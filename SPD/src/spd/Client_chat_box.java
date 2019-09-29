/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spd;


import java.awt.Dimension;
import java.awt.Event;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import RPS.PLA_VS_PLA;

public class Client_chat_box extends javax.swing.JFrame {

    /**
     * Creates new form Client_chat_box
     */
    static Socket SS;
    BufferedReader R;
    PrintWriter W;
    static String SSct;
    @Override
    public boolean mouseDown(Event evt, int x, int y) {
        return super.mouseDown(evt, x, y); //To change body of generated methods, choose Tools | Templates.
    }
    

    @Override
    public Dimension minimumSize() {
        return super.minimumSize(); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Client_chat_box(Socket s,String a) {
        try {
            initComponents();
            SSct=a;
            SS = s;
            R = new BufferedReader(new InputStreamReader(SS.getInputStream()));
            W = new PrintWriter(SS.getOutputStream(),true);
            read r = new read(SS);
            r.start();
        } catch (IOException ex) {
            Logger.getLogger(Client_chat_box.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sms = new javax.swing.JTextField();
        sendbutton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        display = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        Connect = new javax.swing.JButton();
        cnn = new javax.swing.JTextField();
        jt1 = new javax.swing.JScrollPane();
        online = new javax.swing.JTextArea();
        game = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sendbutton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        sendbutton.setText("Send");
        sendbutton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        sendbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendbuttonActionPerformed(evt);
            }
        });

        display.setColumns(20);
        display.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        display.setRows(5);
        jScrollPane1.setViewportView(display);

        jLabel1.setText("User:");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        userLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        Connect.setText("Connect");
        Connect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConnectActionPerformed(evt);
            }
        });

        online.setColumns(20);
        online.setRows(5);
        jt1.setViewportView(online);

        game.setText("Game");
        game.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(sms)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sendbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(userLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Connect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cnn)
                            .addComponent(jt1)
                            .addComponent(game, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                    .addComponent(userLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jt1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cnn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Connect)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(game, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sms, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sendbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sendbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendbuttonActionPerformed
        // TODO add your handling code here:
        String a = sms.getText();
        
        W.println(a);
        sms.setText("");
        display.setText(display.getText()+"\n"+"ME: "+a);
        
        
    }//GEN-LAST:event_sendbuttonActionPerformed

    private void ConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConnectActionPerformed
        // TODO add your handling code here:
        String a = cnn.getText();
        if(a.equals(""))
        {
            display.setText(display.getText()+"\n"+"Invalid User");
        }
        else{
            W.println("&&$ "+cnn.getText());
        }
    }//GEN-LAST:event_ConnectActionPerformed

    private void gameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gameActionPerformed
        // TODO add your handling code here:
        
        new PLA_VS_PLA(SSct).setVisible(true);
    }//GEN-LAST:event_gameActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Client_chat_box.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Client_chat_box.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Client_chat_box.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Client_chat_box.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Client_chat_box(SS,SSct).setVisible(true);
               
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton Connect;
    public static javax.swing.JTextField cnn;
    public static javax.swing.JTextArea display;
    public static javax.swing.JButton game;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JScrollPane jt1;
    public static javax.swing.JTextArea online;
    private javax.swing.JButton sendbutton;
    private javax.swing.JTextField sms;
    public static javax.swing.JLabel userLabel;
    // End of variables declaration//GEN-END:variables
}
class read extends Thread
{
    Socket s ;

    public read(Socket s) {
        this.s = s;
        
    }

    @Override
    public void run() {
        try {
            //To change body of generated methods, choose Tools | Templates.
            PrintWriter out =new PrintWriter(s.getOutputStream(),true);
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(s.getInputStream())
            );
            String a = in.readLine();
            Client_chat_box.userLabel.setText(a);
             while(true)
             {
                 a = in.readLine();
                 if(a.equals("update"))
                 {
                     Client_chat_box.online.setText("");
                     a = in.readLine();
                     while(!a.equals(""))
                     {
                         if(!a.equals(Client_chat_box.userLabel.getText()))
                         {
                            Client_chat_box.online.setText(Client_chat_box.online.getText()+"\n"+a);
                         }
                         a=in.readLine();
                         
                     }
                    



                 }
                 else{
                     Client_chat_box.display.setText(Client_chat_box.display.getText()+"\n"+a);
                 }
                 
             }
        } catch (IOException ex) {
            Logger.getLogger(read.class.getName()).log(Level.SEVERE, null, ex);
        }
           
    }

    
}