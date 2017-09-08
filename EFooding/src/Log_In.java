import java.sql.*;

import javax.swing.JOptionPane;


public class Log_In extends javax.swing.JFrame {

   
    public Log_In() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        t1 = new javax.swing.JTextField();
        p1 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("E^F00DING LogIn");

        jPanel1.setLayout(null);

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Hp\\Downloads\\Documents\\LOGIN.jpg")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(290, 220, 100, 30);

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Hp\\Downloads\\Documents\\createaccount.jpg")); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(110, 220, 110, 30);
        jPanel1.add(t1);
        t1.setBounds(180, 110, 190, 30);
        jPanel1.add(p1);
        p1.setBounds(180, 160, 190, 30);

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 12));
        jLabel4.setText("Password");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(80, 170, 80, 18);

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 12));
        jLabel3.setText("UserName");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(80, 120, 80, 18);

        jLabel2.setFont(new java.awt.Font("Baskerville Old Face", 1, 18));
        jLabel2.setText(">LOGIN");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(80, 40, 90, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Hp\\Downloads\\Documents\\bg-login.jpg")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 540, 330);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    
  String sql="SELECT * FROM LOG_IN;";
    try {
           Class.forName("com.mysql.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost/gyanvihar","root","root");
           Statement stmt=con.createStatement();
           ResultSet rs = stmt.executeQuery(sql);
          
           String user=t1.getText();
          String pass=new String(p1.getPassword());
          while(rs.next()) {
          String uname=rs.getString("Username");
          //Username is the coloumn name in the database table 
          String password=rs.getString("Password");
         //Password is the coloumn name in the database table
          if((user.equals(uname))&&(pass.equals(password)))
          {
              new E_fastfoodOrdering().setVisible(true);
              this.dispose();
          }

          else
          JOptionPane.showMessageDialog(null,"Username and Password is Incorrect..\n Please Register to Proceed");
          }
}
catch (Exception e){
JOptionPane.showMessageDialog(this, "Error In Connection.......");
}
    
    
    
   
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here
        this.dispose();
        new create_account().setVisible(true);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Log_In().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField p1;
    private javax.swing.JTextField t1;
    // End of variables declaration//GEN-END:variables

}
