/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Airliner;
import Business.Fleet;
import Business.TravelAgency;
import java.text.SimpleDateFormat;
//import java.util.Date;
import java.sql.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class Schedule extends javax.swing.JPanel {

    /**
     * Creates new form Schedule
     */
    private TravelAgency TA;
    private JPanel rightPanel;
    public Schedule(JPanel rightPanel,TravelAgency TA) {
        this.TA=TA;
        this.rightPanel=rightPanel;
        initComponents();
        populatecbox();
        schedulePanel.setVisible(false);
        vsPanel.setVisible(false);
    }
    public void populatecbox()
    {   airlinerCombobox.insertItemAt("",0);
        DefaultComboBoxModel cbm=(DefaultComboBoxModel)airlinerCombobox.getModel();
        for(Airliner air : TA.getAirArrayList())
        {
            Object obj=new Object();
            obj=air;
            cbm.addElement(obj);
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

        airlinerCombobox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        flightsTable = new javax.swing.JTable();
        showflightbutton = new javax.swing.JButton();
        addscheduleButton = new javax.swing.JButton();
        schedulePanel = new javax.swing.JPanel();
        fromfield = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tofield = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        datefield = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        closebtn = new javax.swing.JButton();
        vsPanel = new javax.swing.JPanel();
        fromfield1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tofield1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        datefield1 = new javax.swing.JTextField();
        closeButton = new javax.swing.JButton();
        vsButton = new javax.swing.JButton();

        airlinerCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                airlinerComboboxActionPerformed(evt);
            }
        });

        flightsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Flight Name", "Flight Model"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(flightsTable);

        showflightbutton.setText("Show Flight");
        showflightbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showflightbuttonActionPerformed(evt);
            }
        });

        addscheduleButton.setText("Add Schedule");
        addscheduleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addscheduleButtonActionPerformed(evt);
            }
        });

        schedulePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Add Schedule"));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("From:");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("To:");

        jLabel3.setText("Date:");

        saveButton.setText("Save/Update");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        closebtn.setText("Close");
        closebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closebtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout schedulePanelLayout = new javax.swing.GroupLayout(schedulePanel);
        schedulePanel.setLayout(schedulePanelLayout);
        schedulePanelLayout.setHorizontalGroup(
            schedulePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, schedulePanelLayout.createSequentialGroup()
                .addGroup(schedulePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(schedulePanelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(schedulePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(schedulePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tofield, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                            .addComponent(fromfield)
                            .addComponent(datefield)))
                    .addGroup(schedulePanelLayout.createSequentialGroup()
                        .addContainerGap(32, Short.MAX_VALUE)
                        .addGroup(schedulePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(schedulePanelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(closebtn))
                            .addComponent(saveButton))))
                .addGap(22, 22, 22))
        );
        schedulePanelLayout.setVerticalGroup(
            schedulePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(schedulePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(schedulePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fromfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(schedulePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tofield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(schedulePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(datefield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(saveButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(closebtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        vsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "View Schedule"));

        fromfield1.setEditable(false);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("From:");

        tofield1.setEditable(false);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("To:");

        jLabel6.setText("Date:");

        datefield1.setEditable(false);

        closeButton.setText("Close");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout vsPanelLayout = new javax.swing.GroupLayout(vsPanel);
        vsPanel.setLayout(vsPanelLayout);
        vsPanelLayout.setHorizontalGroup(
            vsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vsPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(vsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(vsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tofield1, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(fromfield1)
                    .addComponent(datefield1))
                .addGap(22, 22, 22))
            .addGroup(vsPanelLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(closeButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        vsPanelLayout.setVerticalGroup(
            vsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(vsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fromfield1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(vsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tofield1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(vsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(datefield1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(closeButton)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        vsButton.setText("View Schedule");
        vsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(airlinerCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showflightbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addscheduleButton)
                        .addGap(31, 31, 31)
                        .addComponent(vsButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(96, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(vsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(schedulePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(airlinerCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(showflightbutton)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addscheduleButton)
                            .addComponent(vsButton))
                        .addGap(22, 22, 22)
                        .addComponent(vsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(140, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(schedulePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void airlinerComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_airlinerComboboxActionPerformed
        String str=String.valueOf(airlinerCombobox.getSelectedItem());
    }//GEN-LAST:event_airlinerComboboxActionPerformed

    private void showflightbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showflightbuttonActionPerformed
       try{
       Airliner air=(Airliner)airlinerCombobox.getSelectedItem();
       DefaultTableModel dtm = (DefaultTableModel)flightsTable.getModel();
       dtm.setRowCount(0);        
       for(Fleet fleet : air.getfArrayList()){
            Object[] row = new Object[dtm.getColumnCount()];
            row[0]=fleet;
            row[1]=fleet.getfModel();
            dtm.addRow(row);
        }
       }
       catch (Exception e)
       {
           JOptionPane.showMessageDialog(null, "Please select an airline");
       }
        
    }//GEN-LAST:event_showflightbuttonActionPerformed

    private void addscheduleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addscheduleButtonActionPerformed
        int selectedrow=flightsTable.getSelectedRow();
        if(selectedrow>=0)
        {   
           schedulePanel.setVisible(true);        
                    
        }
        else {
            JOptionPane.showMessageDialog(null, "Please select a flight");
            
        }
    }//GEN-LAST:event_addscheduleButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        if(fromfield.getText().equals("") || tofield.getText().equals("") || datefield.getText().equals(""))
        {
           JOptionPane.showMessageDialog(null, "fields cannot be empty"); 
        }
        else{
        try {
        int selectedrow=flightsTable.getSelectedRow();
        Fleet fleet=(Fleet)flightsTable.getValueAt(selectedrow, 0);
        String from=fromfield.getText();
        String to=tofield.getText();            
        Date date=Date.valueOf(datefield.getText());
        fleet.getSchedule().setSrc(from);
        fleet.getSchedule().setDest(to);
        fleet.getSchedule().setDate(date);
        JOptionPane.showMessageDialog(null, "schedule added successfully");
        schedulePanel.setVisible(false);
        fromfield.setText("");
        tofield.setText("");
        datefield.setText(""); 
        }
        catch(Exception e)
        {
           JOptionPane.showMessageDialog(null, "Date must be entered in YYYY-MM-DD format"); 
        }    
        }     
    }//GEN-LAST:event_saveButtonActionPerformed

    private void vsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vsButtonActionPerformed
        //vsPanel.setVisible(true);
        int select=flightsTable.getSelectedRow();
        if(select>=0)
        {   
           
           viewschedule();
           /*Fleet fleet=(Fleet)flightsTable.getValueAt(select, 0);
           fromfield1.setText(fleet.getSchedule().getSrc());
           tofield1.setText(fleet.getSchedule().getDest());
           String date=fleet.getSchedule().getDate().toString();
           datefield1.setText(date);  
           //JOptionPane.showMessageDialog(null, "schedule added successfully");*/
            
        }
        else {
            JOptionPane.showMessageDialog(null, "Please select a flight");          
            }
                
    }//GEN-LAST:event_vsButtonActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        vsPanel.setVisible(false);
    }//GEN-LAST:event_closeButtonActionPerformed

    private void closebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closebtnActionPerformed
        schedulePanel.setVisible(false);
    }//GEN-LAST:event_closebtnActionPerformed
    public void viewschedule()
    {
        try { 
        vsPanel.setVisible(true);
        int select=flightsTable.getSelectedRow();
        Fleet fleet=(Fleet)flightsTable.getValueAt(select, 0);
        fromfield1.setText(fleet.getSchedule().getSrc());
        tofield1.setText(fleet.getSchedule().getDest());
        String date=fleet.getSchedule().getDate().toString();
        datefield1.setText(date);
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "flight is not scheduled");
        }
        /*try {
            Thread.sleep(5000);
        }
        catch(InterruptedException e)
        {
            
        }*/
        //vsPanel.setVisible(false);        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addscheduleButton;
    private javax.swing.JComboBox<String> airlinerCombobox;
    private javax.swing.JButton closeButton;
    private javax.swing.JButton closebtn;
    private javax.swing.JTextField datefield;
    private javax.swing.JTextField datefield1;
    private javax.swing.JTable flightsTable;
    private javax.swing.JTextField fromfield;
    private javax.swing.JTextField fromfield1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton saveButton;
    private javax.swing.JPanel schedulePanel;
    private javax.swing.JButton showflightbutton;
    private javax.swing.JTextField tofield;
    private javax.swing.JTextField tofield1;
    private javax.swing.JButton vsButton;
    private javax.swing.JPanel vsPanel;
    // End of variables declaration//GEN-END:variables
}
