/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

/**
 *
 * @author aksha
 */
public class JPanel_Admission_enterprise_Student_for_COff extends javax.swing.JPanel {

    /**
     * Creates new form Admission_enterprise
     */
    public JPanel_Admission_enterprise_Student_for_COff() {
        initComponents();
        //StudentJPanel.setVisible(false);
        CourseJPanel.setVisible(false);
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
        CourseJPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton8 = new javax.swing.JButton();
        couseid = new javax.swing.JTextField();
        couseid1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        couseid2 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        Course_button = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        CourseJPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setText("Course 1");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("COURSE DIRECTORY");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Course Name"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jButton8.setText("Update");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        couseid.setEditable(false);
        couseid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                couseidActionPerformed(evt);
            }
        });

        couseid1.setEditable(false);
        couseid1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                couseid1ActionPerformed(evt);
            }
        });

        jLabel7.setText("Course 2");

        couseid2.setEditable(false);
        couseid2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                couseid2ActionPerformed(evt);
            }
        });

        jLabel14.setText("Course 3");

        javax.swing.GroupLayout CourseJPanelLayout = new javax.swing.GroupLayout(CourseJPanel);
        CourseJPanel.setLayout(CourseJPanelLayout);
        CourseJPanelLayout.setHorizontalGroup(
            CourseJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CourseJPanelLayout.createSequentialGroup()
                .addGroup(CourseJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CourseJPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 766, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CourseJPanelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CourseJPanelLayout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addGroup(CourseJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(CourseJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(couseid, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(couseid1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(couseid2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(199, 199, 199)))
                .addContainerGap())
            .addGroup(CourseJPanelLayout.createSequentialGroup()
                .addGap(331, 331, 331)
                .addComponent(jButton8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CourseJPanelLayout.setVerticalGroup(
            CourseJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CourseJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(CourseJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(couseid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(CourseJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(couseid1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(35, 35, 35)
                .addGroup(CourseJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(couseid2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(31, 31, 31)
                .addComponent(jButton8)
                .addContainerGap(140, Short.MAX_VALUE))
        );

        jLayeredPaneAdms.setLayer(CourseJPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPaneAdmsLayout = new javax.swing.GroupLayout(jLayeredPaneAdms);
        jLayeredPaneAdms.setLayout(jLayeredPaneAdmsLayout);
        jLayeredPaneAdmsLayout.setHorizontalGroup(
            jLayeredPaneAdmsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPaneAdmsLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(CourseJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );
        jLayeredPaneAdmsLayout.setVerticalGroup(
            jLayeredPaneAdmsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPaneAdmsLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(CourseJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        Course_button.setText("Course details");
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
                .addGap(115, 572, Short.MAX_VALUE)
                .addComponent(Course_button)
                .addGap(138, 138, 138))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(Course_button, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 123, Short.MAX_VALUE)
                .addComponent(jLayeredPaneAdms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Course_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Course_buttonActionPerformed
        // TODO add your handling code here:
        //StudentJPanel.setVisible(false);
        CourseJPanel.setVisible(true);
        //Dummy_JPanel.setVisible(false);
    }//GEN-LAST:event_Course_buttonActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
//        int selectedRowIndex = studenttable.getSelectedRow();
//
//        if(selectedRowIndex < 0){
//            JOptionPane.showMessageDialog(this, "Please select a row to update.");
//            return;
//        }
//
//        DefaultTableModel model = (DefaultTableModel) studenttable.getModel();
//        String value = model.getValueAt(selectedRowIndex, 0).toString();
//
//        for(Person ho:this.person_list.getList()) {
//            if(ho.getName().equals(value)) {
//                ho.setName(StudentID.getText());
//                ho.setDesignation(jComboBox1.getSelectedItem().toString());
//                ho.setAge(age.getText());
//                ho.setPhone(gender.getText());
//                ho.setHospital(phone.getText());
//                ho.setUsername(email.getText());
//                ho.setPassword(address.getPassword());
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

    private void couseidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_couseidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_couseidActionPerformed

    private void couseid1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_couseid1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_couseid1ActionPerformed

    private void couseid2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_couseid2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_couseid2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CourseJPanel;
    private javax.swing.JButton Course_button;
    private javax.swing.JTextField couseid;
    private javax.swing.JTextField couseid1;
    private javax.swing.JTextField couseid2;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLayeredPane jLayeredPaneAdms;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
