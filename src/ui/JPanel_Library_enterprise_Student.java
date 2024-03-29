/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

/**
 *
 * @author aksha
 */
public class JPanel_Library_enterprise_Student extends javax.swing.JPanel {

    /**
     * Creates new form Admission_enterprise
     */
    public JPanel_Library_enterprise_Student() {
        initComponents();
        bookDirectory.setVisible(false);
        libraryRoomBooking.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPaneAdms = new javax.swing.JLayeredPane();
        bookDirectory = new javax.swing.JPanel();
        description = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        librarytable = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        bookname = new javax.swing.JTextField();
        author = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        libraryRoomBooking = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        libraryroommaintable = new javax.swing.JTable();
        jButton8 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        Student_button = new javax.swing.JButton();
        Course_button = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        bookDirectory.setBackground(new java.awt.Color(255, 255, 255));

        description.setEditable(false);
        description.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descriptionActionPerformed(evt);
            }
        });

        jLabel2.setText("Name");

        jLabel3.setText("Author");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BOOK DIRECTORY");

        jLabel4.setText("Description");

        librarytable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "Author", "Description"
            }
        ));
        jScrollPane1.setViewportView(librarytable);

        jButton7.setText("Update Selection");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        bookname.setEditable(false);
        bookname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                booknameActionPerformed(evt);
            }
        });

        author.setEditable(false);
        author.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authorActionPerformed(evt);
            }
        });

        jLabel5.setText("Current Book");

        jButton2.setText("Delete Selection");

        javax.swing.GroupLayout bookDirectoryLayout = new javax.swing.GroupLayout(bookDirectory);
        bookDirectory.setLayout(bookDirectoryLayout);
        bookDirectoryLayout.setHorizontalGroup(
            bookDirectoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookDirectoryLayout.createSequentialGroup()
                .addGroup(bookDirectoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bookDirectoryLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bookDirectoryLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(bookDirectoryLayout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addGroup(bookDirectoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(bookDirectoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(author, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                            .addComponent(bookname)
                            .addComponent(description))
                        .addGap(196, 196, 196))
                    .addGroup(bookDirectoryLayout.createSequentialGroup()
                        .addGroup(bookDirectoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bookDirectoryLayout.createSequentialGroup()
                                .addGap(319, 319, 319)
                                .addComponent(jLabel5))
                            .addGroup(bookDirectoryLayout.createSequentialGroup()
                                .addGap(280, 280, 280)
                                .addComponent(jButton7)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        bookDirectoryLayout.setVerticalGroup(
            bookDirectoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookDirectoryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel5)
                .addGap(26, 26, 26)
                .addGroup(bookDirectoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(bookname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bookDirectoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(author, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bookDirectoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(description, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(bookDirectoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton2))
                .addContainerGap(177, Short.MAX_VALUE))
        );

        jLabel6.setText("Room");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("LIBRARY ROOM BOOKING");

        libraryroommaintable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Room", "Slots"
            }
        ));
        jScrollPane2.setViewportView(libraryroommaintable);

        jButton8.setText("Update Booking");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel7.setText("Slots");

        jButton1.setText("Delete Selection");

        jLabel9.setText("Current Selection");

        jTextField1.setEditable(false);

        jTextField2.setEditable(false);

        javax.swing.GroupLayout libraryRoomBookingLayout = new javax.swing.GroupLayout(libraryRoomBooking);
        libraryRoomBooking.setLayout(libraryRoomBookingLayout);
        libraryRoomBookingLayout.setHorizontalGroup(
            libraryRoomBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(libraryRoomBookingLayout.createSequentialGroup()
                .addGroup(libraryRoomBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, libraryRoomBookingLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 766, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, libraryRoomBookingLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(libraryRoomBookingLayout.createSequentialGroup()
                        .addGroup(libraryRoomBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(libraryRoomBookingLayout.createSequentialGroup()
                                .addGap(264, 264, 264)
                                .addGroup(libraryRoomBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(61, 61, 61)
                                .addGroup(libraryRoomBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField1)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)))
                            .addGroup(libraryRoomBookingLayout.createSequentialGroup()
                                .addGap(273, 273, 273)
                                .addGroup(libraryRoomBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addComponent(jButton8))
                                .addGap(18, 18, 18)
                                .addComponent(jButton1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        libraryRoomBookingLayout.setVerticalGroup(
            libraryRoomBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(libraryRoomBookingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(libraryRoomBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(libraryRoomBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(libraryRoomBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8)
                    .addComponent(jButton1))
                .addContainerGap(184, Short.MAX_VALUE))
        );

        jLayeredPaneAdms.setLayer(bookDirectory, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPaneAdms.setLayer(libraryRoomBooking, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPaneAdmsLayout = new javax.swing.GroupLayout(jLayeredPaneAdms);
        jLayeredPaneAdms.setLayout(jLayeredPaneAdmsLayout);
        jLayeredPaneAdmsLayout.setHorizontalGroup(
            jLayeredPaneAdmsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPaneAdmsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bookDirectory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jLayeredPaneAdmsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPaneAdmsLayout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addComponent(libraryRoomBooking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(12, 12, 12)))
        );
        jLayeredPaneAdmsLayout.setVerticalGroup(
            jLayeredPaneAdmsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPaneAdmsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bookDirectory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jLayeredPaneAdmsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPaneAdmsLayout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addComponent(libraryRoomBooking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(12, 12, 12)))
        );

        Student_button.setText("Book Directory");
        Student_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Student_buttonActionPerformed(evt);
            }
        });

        Course_button.setText("Room Booking");
        Course_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Course_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPaneAdms)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(Student_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Course_button)
                .addGap(138, 138, 138))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Student_button, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(Course_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 105, Short.MAX_VALUE)
                .addComponent(jLayeredPaneAdms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Student_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Student_buttonActionPerformed
        // TODO add your handling code here:
        bookDirectory.setVisible(true);
        libraryRoomBooking.setVisible(false);
        //Dummy_JPanel.setVisible(false);
    }//GEN-LAST:event_Student_buttonActionPerformed

    private void Course_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Course_buttonActionPerformed
        // TODO add your handling code here:
        bookDirectory.setVisible(false);
        libraryRoomBooking.setVisible(true);
        //Dummy_JPanel.setVisible(false);
    }//GEN-LAST:event_Course_buttonActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
//        int selectedRowIndex = librarytable.getSelectedRow();
//
//        if(selectedRowIndex < 0){
//            JOptionPane.showMessageDialog(this, "Please select a row to update.");
//            return;
//        }
//
//        DefaultTableModel model = (DefaultTableModel) librarytable.getModel();
//        String value = model.getValueAt(selectedRowIndex, 0).toString();
//
//        for(Person ho:this.person_list.getList()) {
//            if(ho.getName().equals(value)) {
//                ho.setName(bookname.getText());
//                ho.setDesignation(roomname.getSelectedItem().toString());
//                ho.setAge(description.getText());
//                ho.setPhone(jTextField4.getText());
//                ho.setHospital(jTextField8.getText());
//                ho.setUsername(jTextField9.getText());
//                ho.setPassword(jPasswordField1.getPassword());
//                break;
//            }else{
//                continue;
//            }
//
//        }
//
//        JOptionPane.showMessageDialog(this, "Record updated.");
//
//        populateTable();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void booknameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_booknameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_booknameActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
//        int selectedRowIndex = librarytable.getSelectedRow();
//
//        if(selectedRowIndex < 0){
//            JOptionPane.showMessageDialog(this, "Please select a row to update.");
//            return;
//        }
//
//        DefaultTableModel model = (DefaultTableModel) librarytable.getModel();
//        String value = model.getValueAt(selectedRowIndex, 0).toString();
//
//        for(Person ho:this.person_list.getList()) {
//            if(ho.getName().equals(value)) {
//                ho.setName(bookname.getText());
//                ho.setDesignation(roomname.getSelectedItem().toString());
//                ho.setAge(description.getText());
//                ho.setPhone(jTextField4.getText());
//                ho.setHospital(jTextField8.getText());
//                ho.setUsername(jTextField9.getText());
//                ho.setPassword(jPasswordField1.getPassword());
//                break;
//            }else{
//                continue;
//            }
//
//        }
//
//        JOptionPane.showMessageDialog(this, "Record updated.");
//
//        populateTable();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void descriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descriptionActionPerformed

    private void authorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_authorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Course_button;
    private javax.swing.JButton Student_button;
    private javax.swing.JTextField author;
    private javax.swing.JPanel bookDirectory;
    private javax.swing.JTextField bookname;
    private javax.swing.JTextField description;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPaneAdms;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPanel libraryRoomBooking;
    private javax.swing.JTable libraryroommaintable;
    private javax.swing.JTable librarytable;
    // End of variables declaration//GEN-END:variables
}
