/*
 * JGroups é uma API para comunicação confiável em grupo. 
Ele pode ser utilizado para a criação de grupos/clusters
 * em que as instancias podem enviar mensagens umas as outras.
 * As principais características são:
 * --> Criação e exclusão de clusters/grupos.
 * --> Entrada e saída de clusters
 * --> Detecção de falhas e notificação de entrada/saída/falha de membros de um grupo
 * --> Detecção e remoção de nodos falhos
 * --> Envio e recebimento de mensagens em grupo
 * --> Envio e recebimento de mensagens ponto-a-ponto
 * 
 */

import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jgroups.Address;
import org.jgroups.JChannel;
import org.jgroups.Message;
import org.jgroups.ReceiverAdapter;
import org.jgroups.View;

/*
 * Para poder receber mensagens enviadas a um grupo, a classe
 * deve estender ReceiverAdapter
 */
public class XXX extends ReceiverAdapter {

    JChannel channel;
    List<Address> membros;
    
    public void iniciar() throws Exception {

        System.setProperty("java.net.preferIPv4Stack", "true");//desabilita ipv6, para que só sejam aceitas conexões via ipv4
        /*
         * JGroups utiliza um JChannel como principal forma de conectar
         * a um cluster/grupo. É atraves dele que enviaremos e recebermos mensagens
         * bem como registrar os eventos callback quando acontecer alguma
         * mudança (por exemplo, entrada de um membro no grupo).
         * 
         * Neste caso, criamos uma instancia deste objeto, utilizando configurações default.
         */
        channel = new JChannel();
        /*
         * Definimos através do método setReceiver qual classe implementará
         * o método callback receive, que será chamado toda vez que alguém
         * enviar uma mensagem ao cluster/grupo. Neste caso, a própria classe
         * implementa o método receive mais abaixo.
         */
        channel.setReceiver(this);
        /*
         * O método connect faz com que este processo entre no cluster/grupo ChatCluster.
         * Não há a necessidade de se criar explicitamente um cluster, pois o método connect
         * cria o cluster caso este seja o primeiro membro a entrar nele.
         */
        channel.connect("Chat - JGroups");

    }

    /*
     * O método abaixo é callback, e é chamado toda vez que alguem
     * envia uma mensagem ao processo/grupo/canal. Esta mensagem é recebida no parâmetro
     * Message msg. Nessa implementação, mostramos na tela o originador
     * da mensagem em msg.getSrc() e a mensagem propriamente dita em
     * msg.getObject
     */
    public void send(String user, String mensagem){
        Message msg = new Message(null, mensagem);
        if(!user.isEmpty()){
             msg = new Message(channel.getAddress(), mensagem);
        }
        try {
            channel.send(msg);
        } catch (Exception ex) {
            Logger.getLogger(XXX.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void receive(Message msg) {
        System.out.println("\n"+msg.getSrc()+" disse: "+msg.getObject());
    }
    
    public void sair(){
        channel.close();
    }
    /*
     * O método abaixo é callback, e é chamado toda vez que uma nova
     * instancia entra no grupo, ou se alguma instancia sai do grupo.
     * Ele recebe uma View como parâmetro. Este objeto possui informações
     * sobre todos os membros do grupo.
     * Na nossa implementação, quando damos um print no objeto new_view
     * ele mostra, respectivamente:
     *      [Criador do grupo | ID da View]  [Membros do grupo]
     * 
     * Cada View possui uma ID, que a identifica. 
     * O ID da View é um Relógio de Lamport que marca a ocorrência de eventos.
     */
    
    @Override
    public void viewAccepted(View view_atual) {

        System.out.println("---VISÃO DO GRUPO ATUALIZADA---");
        System.out.println("ID da view: "+view_atual.getViewId().getId());
        System.out.println("Coordenador: "+view_atual.getCreator());
        System.out.print("Membros: ");
        membros = view_atual.getMembers();
        for (int i = 0; i < membros.size(); i++) {
            System.out.print(membros.get(i)+", ");
        }
        System.out.println();

    }
    
    
    
    /*
     * Este método callback é chamado toda vez que um membro é 
     * suspeito de ter falhado, porém ainda não foi excluído
     * do grupo. Esse método só é executado no coordenador do grupo.
     */
    
    @Override
    public void suspect(Address mbr) {

        System.out.println("PROCESSO SUSPEITO DE FALHA: " + mbr);
    }
}
