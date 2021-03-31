package interfaces;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.applet.AudioClip;

public class MainInterface extends javax.swing.JFrame {

    public MainInterface() {
        initComponents();
        centreWindow();

    }
    AudioClip ButtonSound;

    private void centreWindow() {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - this.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - this.getHeight()) / 2);
        this.setLocation(x, y - 25);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cardContent = new javax.swing.JPanel();
        aboutUsButton = new javax.swing.JButton();
        startButton = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        ball = new javax.swing.JLabel();
        bar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 550));
        setResizable(false);

        cardContent.setBackground(new java.awt.Color(52, 52, 60));
        cardContent.setPreferredSize(new java.awt.Dimension(900, 550));

        aboutUsButton.setBackground(new java.awt.Color(52, 52, 60));
        aboutUsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dataIcons/about us.png"))); // NOI18N
        aboutUsButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        aboutUsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aboutUsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutUsButtonActionPerformed(evt);
            }
        });

        startButton.setBackground(new java.awt.Color(155, 152, 152));
        startButton.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        startButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dataIcons/play.png"))); // NOI18N
        startButton.setText("PLAY");
        startButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dataImages/title_layour.png"))); // NOI18N

        ball.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dataImages/Circle.png"))); // NOI18N

        bar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dataImages/Bar.jpg"))); // NOI18N

        javax.swing.GroupLayout cardContentLayout = new javax.swing.GroupLayout(cardContent);
        cardContent.setLayout(cardContentLayout);
        cardContentLayout.setHorizontalGroup(
            cardContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cardContentLayout.createSequentialGroup()
                .addGap(0, 210, Short.MAX_VALUE)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(181, 181, 181))
            .addGroup(cardContentLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(bar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(cardContentLayout.createSequentialGroup()
                .addGroup(cardContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cardContentLayout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(ball))
                    .addGroup(cardContentLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(aboutUsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cardContentLayout.setVerticalGroup(
            cardContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cardContentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(aboutUsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(cardContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cardContentLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(ball)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                        .addComponent(bar))
                    .addGroup(cardContentLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(67, 67, 67))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cardContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cardContent, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        new ControlInterface().setVisible(true);
        this.dispose();
        ButtonSound = java.applet.Applet.newAudioClip(getClass().getResource("/dataSounds/ButtonSound.mp3"));
        ButtonSound.play();
    }//GEN-LAST:event_startButtonActionPerformed

    private void aboutUsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutUsButtonActionPerformed

        new AboutUs().setVisible(true);
        this.dispose();
        ButtonSound = java.applet.Applet.newAudioClip(getClass().getResource("/dataSounds/ButtonSound.mp3"));
        ButtonSound.play();
    }//GEN-LAST:event_aboutUsButtonActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainInterface().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aboutUsButton;
    private javax.swing.JLabel ball;
    private javax.swing.JLabel bar;
    private javax.swing.JPanel cardContent;
    private javax.swing.JButton startButton;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
