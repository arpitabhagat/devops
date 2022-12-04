/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

/**
 *
 * @author aksha
 */
public class JPanel_Healthcare_enterprise_Admin extends javax.swing.JPanel {

    /**
     * Creates new form Admission_enterprise
     */
    public JPanel_Healthcare_enterprise_Admin() {
        initComponents();
        doctorSlots.setVisible(false);
        vaccineAvailability.setVisible(false);
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
        doctorSlots = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnAddSlot = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        doctorname = new javax.swing.JComboBox<>();
        slots = new javax.swing.JComboBox<>();
        vaccineAvailability = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        vaccinetable = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        vaccine = new javax.swing.JTextField();
        doses = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        Student_button = new javax.swing.JButton();
        Course_button = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        doctorSlots.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Doctor");

        jLabel3.setText("Slots");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DOCTOR SLOTS");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Doctor", "Slot"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnAddSlot.setText("Add Slot");
        btnAddSlot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSlotActionPerformed(evt);
            }
        });

        jButton7.setText("Update");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton6.setText("Delete");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        doctorname.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "General Physician", "Orthopedician", "Cardiologist" }));

        slots.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "9AM - 10AM", "10AM - 11AM", "11AM - 12PM", "12PM - 1PM", "2PM - 3PM", "3PM - 4PM", "4PM - 5PM" }));

        javax.swing.GroupLayout doctorSlotsLayout = new javax.swing.GroupLayout(doctorSlots);
        doctorSlots.setLayout(doctorSlotsLayout);
        doctorSlotsLayout.setHorizontalGroup(
            doctorSlotsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(doctorSlotsLayout.createSequentialGroup()
                .addGroup(doctorSlotsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, doctorSlotsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, doctorSlotsLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(doctorSlotsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAddSlot, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104)
                        .addGroup(doctorSlotsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(doctorSlotsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(doctorSlotsLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton6)
                                .addGap(28, 28, 28))
                            .addGroup(doctorSlotsLayout.createSequentialGroup()
                                .addGroup(doctorSlotsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(doctorname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(slots, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 267, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(doctorSlotsLayout.createSequentialGroup()
                .addGap(321, 321, 321)
                .addComponent(jButton7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        doctorSlotsLayout.setVerticalGroup(
            doctorSlotsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(doctorSlotsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(doctorSlotsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddSlot)
                    .addComponent(jButton6))
                .addGap(3, 3, 3)
                .addGroup(doctorSlotsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(doctorSlotsLayout.createSequentialGroup()
                        .addGroup(doctorSlotsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(doctorname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addComponent(jLabel3))
                    .addComponent(slots, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(jButton7)
                .addContainerGap(224, Short.MAX_VALUE))
        );

        jLabel6.setText("Vaccine Name");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("VACCINE AVAILABILITY");

        vaccinetable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Vaccine", "Doses available"
            }
        ));
        jScrollPane2.setViewportView(vaccinetable);

        jButton3.setText("Add Vaccine");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton8.setText("Update");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Delete");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        vaccine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vaccineActionPerformed(evt);
            }
        });

        doses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dosesActionPerformed(evt);
            }
        });

        jLabel7.setText("Doses Available");

        jButton2.setText("View");

        javax.swing.GroupLayout vaccineAvailabilityLayout = new javax.swing.GroupLayout(vaccineAvailability);
        vaccineAvailability.setLayout(vaccineAvailabilityLayout);
        vaccineAvailabilityLayout.setHorizontalGroup(
            vaccineAvailabilityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vaccineAvailabilityLayout.createSequentialGroup()
                .addGroup(vaccineAvailabilityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, vaccineAvailabilityLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 766, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, vaccineAvailabilityLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(vaccineAvailabilityLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton9)
                        .addGap(28, 28, 28))
                    .addGroup(vaccineAvailabilityLayout.createSequentialGroup()
                        .addGap(332, 332, 332)
                        .addComponent(jButton8)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(vaccineAvailabilityLayout.createSequentialGroup()
                        .addGroup(vaccineAvailabilityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(vaccineAvailabilityLayout.createSequentialGroup()
                                .addGap(252, 252, 252)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(vaccine, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(vaccineAvailabilityLayout.createSequentialGroup()
                                .addGap(251, 251, 251)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(doses, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(199, 199, 199)))
                .addContainerGap())
        );
        vaccineAvailabilityLayout.setVerticalGroup(
            vaccineAvailabilityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vaccineAvailabilityLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(vaccineAvailabilityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton9)
                    .addComponent(jButton2))
                .addGap(37, 37, 37)
                .addGroup(vaccineAvailabilityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(vaccine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(vaccineAvailabilityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(doses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jButton8)
                .addContainerGap(221, Short.MAX_VALUE))
        );

        jLayeredPaneAdms.setLayer(doctorSlots, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPaneAdms.setLayer(vaccineAvailability, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPaneAdmsLayout = new javax.swing.GroupLayout(jLayeredPaneAdms);
        jLayeredPaneAdms.setLayout(jLayeredPaneAdmsLayout);
        jLayeredPaneAdmsLayout.setHorizontalGroup(
            jLayeredPaneAdmsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPaneAdmsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(doctorSlots, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jLayeredPaneAdmsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPaneAdmsLayout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addComponent(vaccineAvailability, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(12, 12, 12)))
        );
        jLayeredPaneAdmsLayout.setVerticalGroup(
            jLayeredPaneAdmsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPaneAdmsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(doctorSlots, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jLayeredPaneAdmsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPaneAdmsLayout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addComponent(vaccineAvailability, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(12, 12, 12)))
        );

        Student_button.setText("Doctor Slots");
        Student_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Student_buttonActionPerformed(evt);
            }
        });

        Course_button.setText("Vaccine Availability");
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
        doctorSlots.setVisible(true);
        vaccineAvailability.setVisible(false);
        //Dummy_JPanel.setVisible(false);
    }//GEN-LAST:event_Student_buttonActionPerformed

    private void Course_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Course_buttonActionPerformed
        // TODO add your handling code here:
        doctorSlots.setVisible(false);
        vaccineAvailability.setVisible(true);
        //Dummy_JPanel.setVisible(false);
    }//GEN-LAST:event_Course_buttonActionPerformed

    private void btnAddSlotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSlotActionPerformed
        // TODO add your handling code here:
//        Person pd = person_list.addNewPerson();
//
//        pd.setName(jTextField1.getText());
//        pd.setDesignation(doctorname.getSelectedItem().toString());
//        pd.setAge(jTextField3.getText());
//        pd.setPhone(jTextField4.getText());
//        pd.setHospital(doses.getText());
//        pd.setUsername(jTextField9.getText());
//        pd.setPassword(jPasswordField1.getPassword());
//
//        JOptionPane.showMessageDialog(this, "New person added.");
//
//        jTextField1.setText("");
//        doctorname.setSelectedItem("Patient");
//        jTextField3.setText("");
//        jTextField4.setText("");
//        doses.setText("");
//        jTextField9.setText("");
//        jPasswordField1.setText("");
//
//        populateTable();

    }//GEN-LAST:event_btnAddSlotActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
//        int selectedRowIndex = jTable1.getSelectedRow();
//
//        if(selectedRowIndex < 0){
//            JOptionPane.showMessageDialog(this, "Please select a row to update.");
//            return;
//        }
//
//        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
//        String value = model.getValueAt(selectedRowIndex, 0).toString();
//
//        for(Person ho:this.person_list.getList()) {
//            if(ho.getName().equals(value)) {
//                ho.setName(jTextField1.getText());
//                ho.setDesignation(doctorname.getSelectedItem().toString());
//                ho.setAge(jTextField3.getText());
//                ho.setPhone(jTextField4.getText());
//                ho.setHospital(doses.getText());
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

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
//        int selectedRowIndex = jTable1.getSelectedRow();
//
//        if(selectedRowIndex < 0){
//            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
//            return;
//        }
//
//        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
//        //Community selectedCommunity = (Community)model.getValueAt(selectedRowIndex, 0);
//
//        //community_list.deleteCommunity(selectedCommunity);
//        String value1 = model.getValueAt(selectedRowIndex, 0).toString();
//
//        Person_List newList = new Person_List();
//        newList.setList(this.person_list.getList());
//
//        for(Person co:newList.getList()) {
//            if(co.getName().equals(value1)) {
//                person_list.deletePerson(co);
//                break;
//            }else{
//                continue;
//            }
//
//        }
//
//        JOptionPane.showMessageDialog(this, "Person deleted.");
//        //JOptionPane.showMessageDialog(this, model.getValueAt(selectedRowIndex, 0));
//
//        populateTable();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
//        Person pd = person_list.addNewPerson();
//
//        pd.setName(jTextField1.getText());
//        pd.setDesignation(doctorname.getSelectedItem().toString());
//        pd.setAge(jTextField3.getText());
//        pd.setPhone(jTextField4.getText());
//        pd.setHospital(doses.getText());
//        pd.setUsername(jTextField9.getText());
//        pd.setPassword(jPasswordField1.getPassword());
//
//        JOptionPane.showMessageDialog(this, "New person added.");
//
//        jTextField1.setText("");
//        doctorname.setSelectedItem("Patient");
//        jTextField3.setText("");
//        jTextField4.setText("");
//        doses.setText("");
//        jTextField9.setText("");
//        jPasswordField1.setText("");
//
//        populateTable();

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
//        int selectedRowIndex = jTable1.getSelectedRow();
//
//        if(selectedRowIndex < 0){
//            JOptionPane.showMessageDialog(this, "Please select a row to update.");
//            return;
//        }
//
//        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
//        String value = model.getValueAt(selectedRowIndex, 0).toString();
//
//        for(Person ho:this.person_list.getList()) {
//            if(ho.getName().equals(value)) {
//                ho.setName(jTextField1.getText());
//                ho.setDesignation(doctorname.getSelectedItem().toString());
//                ho.setAge(jTextField3.getText());
//                ho.setPhone(jTextField4.getText());
//                ho.setHospital(doses.getText());
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

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
//        int selectedRowIndex = jTable1.getSelectedRow();
//
//        if(selectedRowIndex < 0){
//            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
//            return;
//        }
//
//        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
//        //Community selectedCommunity = (Community)model.getValueAt(selectedRowIndex, 0);
//
//        //community_list.deleteCommunity(selectedCommunity);
//        String value1 = model.getValueAt(selectedRowIndex, 0).toString();
//
//        Person_List newList = new Person_List();
//        newList.setList(this.person_list.getList());
//
//        for(Person co:newList.getList()) {
//            if(co.getName().equals(value1)) {
//                person_list.deletePerson(co);
//                break;
//            }else{
//                continue;
//            }
//
//        }
//
//        JOptionPane.showMessageDialog(this, "Person deleted.");
//        //JOptionPane.showMessageDialog(this, model.getValueAt(selectedRowIndex, 0));
//
//        populateTable();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void vaccineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vaccineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vaccineActionPerformed

    private void dosesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dosesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dosesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Course_button;
    private javax.swing.JButton Student_button;
    private javax.swing.JButton btnAddSlot;
    private javax.swing.JPanel doctorSlots;
    private javax.swing.JComboBox<String> doctorname;
    private javax.swing.JTextField doses;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLayeredPane jLayeredPaneAdms;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> slots;
    private javax.swing.JTextField vaccine;
    private javax.swing.JPanel vaccineAvailability;
    private javax.swing.JTable vaccinetable;
    // End of variables declaration//GEN-END:variables
}