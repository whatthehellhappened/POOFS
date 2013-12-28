/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Database.DB;
import Main.User;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author Grant Bacaltos
 */
public class ManageRegistration extends javax.swing.JFrame {

    private static ManageRegistration manageRegistrationUI;
    
    private User u;
    
    public ManageRegistration(User u) {
        initComponents();
        this.u = u;
        FlowLayout fl = new FlowLayout(FlowLayout.LEFT);
        pendingPanel.setLayout(fl);
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));  
        ArrayList<User> pendingUsers = DB.getAllPendingUsers();
        for(int i = 0; i < pendingUsers.size(); i++) {
            //System.out.println(pendingUsers.get(i).toString());
            panel.add(new RegistrationRequest(pendingUsers.get(i)));
        }
        panel.setPreferredSize(new Dimension(300, 45 * pendingUsers.size()));
        //panel.setBorder(javax.swing.BorderFactory.createTitledBorder("panel"));
        pendingPanel.add(panel);
        this.pack();
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
        jLabel1 = new javax.swing.JLabel();
        BTNback = new javax.swing.JButton();
        pendingPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("POOFS");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        BTNback.setText("<");
        BTNback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNbackActionPerformed(evt);
            }
        });

        pendingPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Pending Registrations"));

        org.jdesktop.layout.GroupLayout pendingPanelLayout = new org.jdesktop.layout.GroupLayout(pendingPanel);
        pendingPanel.setLayout(pendingPanelLayout);
        pendingPanelLayout.setHorizontalGroup(
            pendingPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 0, Short.MAX_VALUE)
        );
        pendingPanelLayout.setVerticalGroup(
            pendingPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 282, Short.MAX_VALUE)
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(pendingPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(layout.createSequentialGroup()
                        .add(BTNback)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jLabel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(BTNback, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(pendingPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNbackActionPerformed
        Administrator.start(u);
        this.stop();
    }//GEN-LAST:event_BTNbackActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void start(User u) {
        manageRegistrationUI = new ManageRegistration(u);
        Main.Utility.centerFrame(manageRegistrationUI);
        manageRegistrationUI.setVisible(true);
    }
    
    public static void stop() {
        manageRegistrationUI.dispose();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNback;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel pendingPanel;
    // End of variables declaration//GEN-END:variables
}