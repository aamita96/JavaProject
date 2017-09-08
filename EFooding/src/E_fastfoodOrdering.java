import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class E_fastfoodOrdering extends javax.swing.JFrame {

    
    public E_fastfoodOrdering() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("E^F00DING");

        jPanel1.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 12));
        jLabel4.setText("Select Food Item of your choice");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 110, 270, 18);

        jButton4.setForeground(new java.awt.Color(255, 0, 0));
        jButton4.setText("Find and select restaurants near you for delivery");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(0, 360, 340, 23);

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Pav Bhaji", "Pasta", "Pizza", "Burger", "Bhel Puri", "Chhole Kulche", "Fried Momos", "Chowmine", " " };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jList1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(30, 160, 180, 80);

        jTextField1.setEditable(false);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(810, 160, 130, 20);

        jTextField2.setEditable(false);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(810, 190, 130, 20);

        jTextField3.setEditable(false);
        jPanel1.add(jTextField3);
        jTextField3.setBounds(810, 250, 130, 20);

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("I agree to place my order");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox1);
        jCheckBox1.setBounds(640, 320, 280, 23);
        jPanel1.add(jTextField4);
        jTextField4.setBounds(810, 280, 130, 20);

        jTextField5.setEditable(false);
        jTextField5.setText("JAIPUR");
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField5);
        jTextField5.setBounds(90, 280, 130, 20);
        jPanel1.add(jTextField6);
        jTextField6.setBounds(90, 310, 130, 20);

        jTextField7.setEditable(false);
        jPanel1.add(jTextField7);
        jTextField7.setBounds(810, 220, 130, 20);

        jButton2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 0));
        jButton2.setText("RESET");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(80, 660, 130, 25);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("STOP");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(230, 660, 140, 25);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel10.setText("Enter Area");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(10, 310, 70, 15);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel9.setText(" City");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(20, 280, 40, 15);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel8.setText("Enter Delivering Address");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(630, 280, 150, 15);

        jLabel7.setFont(new java.awt.Font("Arial Unicode MS", 3, 48));
        jLabel7.setForeground(new java.awt.Color(25, 25, 112));
        jLabel7.setText("Welcome To E^F00DING Service");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(40, 20, 840, 50);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel6.setText("Total Price");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(660, 250, 70, 15);

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setForeground(new java.awt.Color(255, 0, 0));
        jButton3.setText("Place My Order");
        jButton3.setEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(820, 350, 140, 23);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel2.setText("ItemCode");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(660, 160, 70, 15);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel5.setText("Item Name");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(660, 190, 70, 15);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(20, 400, 930, 10);

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Restaurant", "Location"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table1);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(50, 460, 860, 190);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Select Restaurant Where You Want That Item From Table");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(250, 430, 490, 17);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel11.setText("Restaurant");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(660, 220, 80, 15);

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 12));
        jLabel3.setText("to place Order and Enter ");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 130, 250, 18);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Hp\\Downloads\\Documents\\bg-login.jpg")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(-10, -10, 990, 720);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 985, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    
        DefaultTableModel model=(DefaultTableModel)table1.getModel();
        try{
            //set the item selected in the textfield...
             int total=0;
        if(jList1.isSelectedIndex(0)==true)
        {
            jTextField1.setText("001");
            jTextField2.setText("Pav Bhaji");
            total=total+100;
            jTextField3.setText(Double.toString(total));

        }
        if(jList1.isSelectedIndex(1)==true)
        {
            jTextField1.setText("002");
            jTextField2.setText(" Pasta");
            total=total+100;
            jTextField3.setText(Double.toString(total));


        }
        if(jList1.isSelectedIndex(2)==true)
        {
        jTextField1.setText("003");
            jTextField2.setText(" Pizza");
            total=total+300;
            jTextField3.setText(Double.toString(total));

        }
        if(jList1.isSelectedIndex(3)==true)
        {
        jTextField1.setText("004");
            jTextField2.setText(" Burger");
             total=total+70;
            jTextField3.setText(Double.toString(total));

        }
        if(jList1.isSelectedIndex(4)==true)
        {
         jTextField1.setText("005");
            jTextField2.setText(" Bhel Puri");
             total=total+60;
            jTextField3.setText(Double.toString(total));
        }
        if(jList1.isSelectedIndex(5)==true)
        {
        jTextField1.setText("006");
            jTextField2.setText("Chhole Kulche");
             total=total+100;
            jTextField3.setText(Double.toString(total));
        }
        if(jList1.isSelectedIndex(6)==true)
        {
        jTextField1.setText("007");
            jTextField2.setText("Fried Momos");
             total=total+80;
            jTextField3.setText(Double.toString(total));
        }
        if(jList1.isSelectedIndex(7)==true)
        {
        jTextField1.setText("008");
            jTextField2.setText("Chowmine");
             total=total+100;
            jTextField3.setText(Double.toString(total));
        }
             //Retrieving the area from the database table....
            Class.forName("java.sql.Driver");

            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/gyanvihar","root","root");
            Statement stmt=con.createStatement();

            
            String query="SELECT * FROM RESTRA WHERE LOCATION="+ "'" +jTextField6.getText()+ "'" +";";
            ResultSet rs=stmt.executeQuery(query);

            while(rs.next()) {
                String Restra=rs.getString("Restaurants");
                String Location=rs.getString("Location");
                

                model.addRow(new Object[]{Restra,Location});
            }

            rs.close();
            stmt.close();
            con.close();

        } catch(Exception e) {
            JOptionPane.showMessageDialog(this, "Error in Connectivity");
        }




}//GEN-LAST:event_jButton4ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // To enable place my order button....
        if(jCheckBox1.isSelected())

        jButton3.setEnabled(true);





        
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"\nItem# --"+jTextField1.getText()+"\n\nItem Ordered--"+jTextField2.getText()+"__Comming from "
        +jTextField7.getText()+"\n\nTotalPrice--"+jTextField3.getText()+"\n\nDelivering Address--"+jTextField4.getText()
           +"\n\nYOUR ORDER WILL BE DELIVERED IN 30 MINUTES"+"\n\n\n\nTHANK YOU FOR USING E^F00DING SERVICE......"
                );
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
        

}//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Program Exit...
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // reset code.....
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jCheckBox1.setSelected(false);
        jButton3.setEnabled(false);
        DefaultTableModel model=(DefaultTableModel)table1.getModel();
        int rows=model.getRowCount();
        if(rows>0)
        {
          for(int i=0;i<rows;i++)
          {model.removeRow(0);}
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
      //Table clicked row set in the textfield....
        int row =table1.getSelectedRow();
        String Table_click=(table1.getModel().getValueAt(row, 0).toString());
        jTextField7.setText(Table_click);
    }//GEN-LAST:event_table1MouseClicked

   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new E_fastfoodOrdering().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTable table1;
    // End of variables declaration//GEN-END:variables

}
