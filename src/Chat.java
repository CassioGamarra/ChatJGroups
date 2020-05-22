
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.jgroups.Address;
import org.jgroups.JChannel;
import org.jgroups.Message;
import org.jgroups.ReceiverAdapter;
import org.jgroups.View;

/**
 *
 * @author Cássio Gamarra & Frederico Hartmann
 */
public class Chat extends javax.swing.JFrame {

    /**
     * Creates new form Chat
     */
    public Chat() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        scrollPanelChat = new javax.swing.JScrollPane();
        txtAreaChat = new javax.swing.JTextArea();
        lblApelido = new javax.swing.JLabel();
        fieldApelido = new javax.swing.JTextField();
        btnEntrar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        fieldFalar = new javax.swing.JTextField();
        lblFalar = new javax.swing.JLabel();
        btnFalar = new javax.swing.JButton();
        lblSusurrar = new javax.swing.JLabel();
        comboBoxUsuarios = new javax.swing.JComboBox<>();
        fieldSussurar = new javax.swing.JTextField();
        btnSussurar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextInfo = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Chat - JGroups");
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(800, 600));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));

        txtAreaChat.setEditable(false);
        txtAreaChat.setColumns(20);
        txtAreaChat.setLineWrap(true);
        txtAreaChat.setRows(5);
        txtAreaChat.setWrapStyleWord(true);
        scrollPanelChat.setViewportView(txtAreaChat);

        lblApelido.setText("Apelido:");

        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.setEnabled(false);
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        fieldFalar.setEnabled(false);
        fieldFalar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fieldFalarKeyPressed(evt);
            }
        });

        lblFalar.setText("Falar para o grupo:");

        btnFalar.setText("Falar");
        btnFalar.setEnabled(false);
        btnFalar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFalarActionPerformed(evt);
            }
        });

        lblSusurrar.setText("Sussurar para:");

        comboBoxUsuarios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar Usuário" }));
        comboBoxUsuarios.setEnabled(false);
        comboBoxUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxUsuariosActionPerformed(evt);
            }
        });

        fieldSussurar.setEditable(false);
        fieldSussurar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fieldSussurarKeyPressed(evt);
            }
        });

        btnSussurar.setText("Sussurar");
        btnSussurar.setEnabled(false);
        btnSussurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSussurarActionPerformed(evt);
            }
        });

        jTextInfo.setEditable(false);
        jScrollPane1.setViewportView(jTextInfo);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblApelido)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fieldApelido, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEntrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSair))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblFalar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fieldFalar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblSusurrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboBoxUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fieldSussurar, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnFalar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSussurar, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(scrollPanelChat, javax.swing.GroupLayout.DEFAULT_SIZE, 778, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApelido)
                    .addComponent(fieldApelido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEntrar)
                    .addComponent(btnSair))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPanelChat, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldFalar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFalar)
                    .addComponent(btnFalar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSusurrar)
                    .addComponent(comboBoxUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldSussurar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSussurar))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        // TODO add your handling code here:
        com.entrar();
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // TODO add your handling code here:
        sair();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnFalarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFalarActionPerformed
        // TODO add your handling code here:
        falar();
    }//GEN-LAST:event_btnFalarActionPerformed

    private void btnSussurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSussurarActionPerformed
        // TODO add your handling code here:
        sussurar();
    }//GEN-LAST:event_btnSussurarActionPerformed

    private void comboBoxUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxUsuariosActionPerformed
        // TODO add your handling code here:
        verificaUsuario();
    }//GEN-LAST:event_comboBoxUsuariosActionPerformed

    private void fieldFalarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldFalarKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            falar();
        }
    }//GEN-LAST:event_fieldFalarKeyPressed

    private void fieldSussurarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldSussurarKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            sussurar();
        }
    }//GEN-LAST:event_fieldSussurarKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Chat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Chat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Chat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Chat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Chat().setVisible(true);
            }
        });
    }

    //Define o JChannel
    JChannel channel;
    //Classe do comunicador, para fins de facilitar o desenvolvimento, está junto com o form
    class Comunicador extends ReceiverAdapter{
        private void entrar(){
            //Seta a preferencia por IPV4
            System.setProperty("java.net.preferIPv4Stack", "true");
            //Verifica se o apelido foi preenchido
            if(fieldApelido.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Digite seu apelido...");
            }
            else{
                try {
                    channel = new JChannel(); //Cria um novo channel
                    channel.setReceiver(this); //Define a classe que implementa o método de callback
                    channel.setName(fieldApelido.getText()); //Seta o nome com o apelido digitado
                    channel.connect("Chat - JGroups"); //Define o nome do grupo
                    //Desativa e ativa botoes e campos
                    fieldApelido.setEnabled(false);
                    btnEntrar.setEnabled(false);
                    btnSair.setEnabled(true);
                    comboBoxUsuarios.setEnabled(true);
                    fieldFalar.setEnabled(true);
                    btnFalar.setEnabled(true);
                }
                catch (Exception ex) {
                    Logger.getLogger(Chat.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //Envia uma mensagem publica
        private void falar(String mensagem){
            if(!mensagem.equals("")){
                Message msg = new Message(null, mensagem);
                try {
                    channel.send(msg);
                }
                catch (Exception ex) {
                    Logger.getLogger(Chat.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //Envia uma mensagem privada
        private void sussurar(String destinatario, String mensagem){
            View view = channel.getView(); //Instancia a view do canal
            List<Address> membros = view.getMembers(); //Cria uma lista com todos os membros

            //Pegar o destinatario, ver se o destinatario é mesmo na lista de membro, dai mandar msg
            membros.stream().filter(membro -> (destinatario.equals(membro.toString()))).forEach(
                membro -> {
                    try {
                        Message msg = new Message(membro, mensagem);
                        channel.send(msg);
                    } catch (Exception ex) {
                        Logger.getLogger(Chat.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            );
        }
        
        @Override
        public void receive(Message msg) {
            String chat = msg.getSrc().toString();
            //verifica se a mensagem possui um destinatario, ou seja, é privada
            if(msg.getDest() != null){
                chat += " sussurou para você: "+msg.getObject()+"\n";
            }
            //Envia para todos no chat
            else{
                chat += msg.getObject()+"\n";
            }
            txtAreaChat.append(chat);
        }
        //Callback para atualizar as entradas e saídas do grupo
        @Override
        public void viewAccepted(View view_atual) {
            String info;
            List<Address> membros = view_atual.getMembers();
            
            if(membros.size() > 1){
                comboBoxUsuarios.removeAllItems();
                comboBoxUsuarios.addItem("Selecionar Usuário");
                info = "";
            }
            //Atualiza o texto de informações
            info = "---VISÃO DO GRUPO ATUALIZADA---\n";
            info += "ID da view: "+view_atual.getViewId().getId();
            info += "\nCoordenador: "+view_atual.getCreator();
            info += "\nMembros: ";
            //Itera sobre os membros
            for (Address membro : membros){
                info += membro+", ";
                comboBoxUsuarios.addItem(membro.toString());
            }
            jTextInfo.setText(info);
        }
        
    }
    
    //Métodos
    Comunicador com = new Comunicador(); //Cria uma instância do comunicador para acessar os métodos
    
    //Verifica o usuário para enviar mensagens privadas
    private void verificaUsuario(){
        //Verificando o tamanho do combobox
        if(tamCombo()){
            String user = comboBoxUsuarios.getSelectedItem().toString();
            if((!user.equals(channel.getAddressAsString()))&&(!user.equals("Selecionar Usuário"))){
                fieldSussurar.setEditable(true);
                btnSussurar.setEnabled(true);
            }else{
                fieldSussurar.setText("");
                fieldSussurar.setEditable(false);
                btnSussurar.setEnabled(false);
            }
        }
    }
    //Envia uma mensagem privada
    private void sussurar(){
        if(tamCombo()){
            String user = comboBoxUsuarios.getSelectedItem().toString();
            String msg = fieldSussurar.getText();
            if(!msg.equals("")){
                com.sussurar(user, msg);
                fieldSussurar.setText("");
                fieldSussurar.setEditable(false);
                btnSussurar.setEnabled(false);
            }
        }
    }
    //Fala para todos no chat
    private void falar(){
        String msg = " disse: "+fieldFalar.getText();
        com.falar(msg);
        fieldFalar.setText("");
    }
    //Sai do chat
    private void sair(){
        com.falar(" saiu do chat.");
        channel.disconnect();
        fieldApelido.setEnabled(true);
        btnEntrar.setEnabled(true);
        comboBoxUsuarios.setEnabled(false);
        btnSair.setEnabled(false);
        fieldFalar.setEnabled(false);
        btnFalar.setEnabled(false);
    }
    
    //Verifica o tamanho do combobox
    private boolean tamCombo(){
        if(comboBoxUsuarios.getItemCount() > 0){
            return true;
        }
        else{
            return false;
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnFalar;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSussurar;
    private javax.swing.JComboBox<String> comboBoxUsuarios;
    private javax.swing.JTextField fieldApelido;
    private javax.swing.JTextField fieldFalar;
    private javax.swing.JTextField fieldSussurar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextInfo;
    private javax.swing.JLabel lblApelido;
    private javax.swing.JLabel lblFalar;
    private javax.swing.JLabel lblSusurrar;
    private javax.swing.JScrollPane scrollPanelChat;
    private javax.swing.JTextArea txtAreaChat;
    // End of variables declaration//GEN-END:variables
}
