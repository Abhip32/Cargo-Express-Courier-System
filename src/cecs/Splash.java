/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cecs;

/**
 *
 * @author Abhishek Patil
 */
public class Splash extends javax.swing.JFrame {

    /**
     * Creates new form Splash
     */
    public Splash() {
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

        SplashScreen = new javax.swing.JPanel();
        Heading = new javax.swing.JLabel();
        TruckGIF = new javax.swing.JLabel();
        ProgressBar = new javax.swing.JProgressBar();
        process = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        SplashScreen.setBackground(new java.awt.Color(255, 102, 0));

        Heading.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 36)); // NOI18N
        Heading.setForeground(new java.awt.Color(255, 255, 255));
        Heading.setText("Express Courier System");

        TruckGIF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cecs/ezgif.com-gif-maker.gif"))); // NOI18N

        process.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        process.setForeground(new java.awt.Color(255, 255, 255));
        process.setText("%");

        javax.swing.GroupLayout SplashScreenLayout = new javax.swing.GroupLayout(SplashScreen);
        SplashScreen.setLayout(SplashScreenLayout);
        SplashScreenLayout.setHorizontalGroup(
            SplashScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SplashScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ProgressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(SplashScreenLayout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(TruckGIF, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 187, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SplashScreenLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(SplashScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SplashScreenLayout.createSequentialGroup()
                        .addComponent(process)
                        .addGap(265, 265, 265))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SplashScreenLayout.createSequentialGroup()
                        .addComponent(Heading, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102))))
        );
        SplashScreenLayout.setVerticalGroup(
            SplashScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SplashScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Heading)
                .addGap(18, 18, 18)
                .addComponent(TruckGIF, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(process)
                .addGap(18, 18, 18)
                .addComponent(ProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplashScreen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(SplashScreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Splash MySplash = new Splash();
         MySplash.setVisible(true);
         try{
             int i;     
             for(i=0;i<=100;i++)
             {
                 Thread.sleep(50);
                 MySplash.ProgressBar.setValue(i);
                 MySplash.process.setText(Integer.toString(i)+" % ");
             }
         }
         catch (Exception e)
         {
             
         }
         new Login().setVisible(true);
         MySplash.dispose();
         
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Heading;
    private javax.swing.JProgressBar ProgressBar;
    private javax.swing.JPanel SplashScreen;
    private javax.swing.JLabel TruckGIF;
    private javax.swing.JLabel process;
    // End of variables declaration//GEN-END:variables
}
