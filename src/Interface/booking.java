/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Airliner;
import Business.Customer;
import Business.Fleet;
import Business.TravelAgency;
import Business.bookinghistory;
import java.awt.CardLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author HP
 */
public class booking extends javax.swing.JPanel {

    /**
     * Creates new form booking
     */
    private TravelAgency TA;
    private JPanel rightPanel;
    private Fleet fleet;
    private Airliner air;
    public booking(JPanel rightPanel,Fleet fleet,TravelAgency TA,Airliner air) {
        this.fleet=fleet;
        this.air=air;
        this.TA=TA;
        //this.master=master;
        this.rightPanel=rightPanel;
        initComponents();        
        populatecustomer();  
        
     }
    
    public void populatecustomer()
    {   //custComboBox.insertItemAt("", 0);
        DefaultComboBoxModel cbm=(DefaultComboBoxModel)custComboBox.getModel();
        cbm.removeAllElements();
        for(Customer c : TA.getcDir().getCustomerArrayList())
        {
            Object obj=new Object();
            obj=c;
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

        wComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        iComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        fnamefield = new javax.swing.JTextField();
        lnamefield = new javax.swing.JTextField();
        cidfield = new javax.swing.JTextField();
        psprtfield = new javax.swing.JTextField();
        bookButton = new javax.swing.JButton();
        custComboBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();

        wComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Window", "Middle", "Isle" }));
        wComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wComboBoxActionPerformed(evt);
            }
        });

        jLabel1.setText("Seat Type");

        iComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iComboBoxActionPerformed(evt);
            }
        });

        jLabel2.setText("Seat Number:");

        jLabel4.setText("First Name:");

        jLabel5.setText("Last Name:");

        jLabel6.setText("CID:");

        jLabel7.setText("Passport Number:");

        fnamefield.setEditable(false);

        lnamefield.setEditable(false);

        cidfield.setEditable(false);

        psprtfield.setEditable(false);

        bookButton.setText("Book");
        bookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookButtonActionPerformed(evt);
            }
        });

        custComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custComboBoxActionPerformed(evt);
            }
        });

        jLabel3.setText("Select Customer");

        backButton.setText("<< Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(wComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(iComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 251, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(custComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fnamefield)
                    .addComponent(lnamefield)
                    .addComponent(cidfield)
                    .addComponent(psprtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(105, 105, 105))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(bookButton))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(fnamefield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(custComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(lnamefield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cidfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(psprtfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(bookButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                .addComponent(backButton)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void wComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wComboBoxActionPerformed
        DefaultComboBoxModel cbm=(DefaultComboBoxModel)iComboBox.getModel();
        DefaultComboBoxModel wcbm=(DefaultComboBoxModel)wComboBox.getModel();
        cbm.removeAllElements();      
        Object obj=wComboBox.getSelectedItem();
        String value=String.valueOf(obj);
        Object obj1=new Object();
        if(value.equals("Window"))
        {
          for(int i : fleet.getWindow())            
        {   obj1=i;
            cbm.addElement(obj1);
        }  
        }
        else if(value.equals("Isle"))
        {
            for(int i : fleet.getIsle())
        {   obj1=i;
            cbm.addElement(obj1);
        }
        }
        else
        {
           for(int i : fleet.getMiddle())
        {   obj1=i;
            cbm.addElement(obj1);
        } 
        }
    }//GEN-LAST:event_wComboBoxActionPerformed

    private void bookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookButtonActionPerformed
        String type=String.valueOf(wComboBox.getSelectedItem());
        String seat=String.valueOf(iComboBox.getSelectedItem());
        String c=String.valueOf(custComboBox.getSelectedItem());
        
        if(wComboBox.getModel().getSize()==0 || iComboBox.getModel().getSize()==0 || custComboBox.getModel().getSize()==0)
        {
          JOptionPane.showMessageDialog(null, "Fields cannot be empty");  
        }
        else
        {
        try{
        fnamefield.setEnabled(false);
        lnamefield.setEnabled(false);
        cidfield.setEnabled(false);
        psprtfield.setEnabled(false);
        bookinghistory bhs=TA.addbhis();
        bhs.setCfname(fnamefield.getText());
        bhs.setclName(lnamefield.getText());
        bhs.setCid(cidfield.getText());
        bhs.setPid(psprtfield.getText());
        bhs.setAir(air.getaName());
        bhs.setfName(fleet.getfNumber());
        bhs.setSrc(fleet.getSchedule().getSrc());
        bhs.setDest(fleet.getSchedule().getDest());
        bhs.setDate(fleet.getSchedule().getDate());
        if(wComboBox.getSelectedItem().equals("Window"))
        {
            Object obj=iComboBox.getSelectedItem();
            fleet.deletewindow(obj);
            
        }
        if(wComboBox.getSelectedItem().equals("Isle"))
        {
            Object obj=iComboBox.getSelectedItem();
            fleet.deleteisle(obj);
        }
        if(wComboBox.getSelectedItem().equals("Middle"))
        {
            Object obj=iComboBox.getSelectedItem();
            fleet.deletemiddle(obj);
        }
        JOptionPane.showMessageDialog(null, "Ticket successfully booked");
        bookButton.setEnabled(false);
    }
        catch (Exception e)
         {
          JOptionPane.showMessageDialog(null, "Fields cannot be empty");      
         }
        }
        
    }//GEN-LAST:event_bookButtonActionPerformed

    private void custComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custComboBoxActionPerformed
        //DefaultComboBoxModel cbm=(DefaultComboBoxModel)iComboBox.getModel();
        fnamefield.setText("");
        lnamefield.setText("");
        cidfield.setText("");
        psprtfield.setText("");
        Customer cust=(Customer)custComboBox.getSelectedItem();
        fnamefield.setText(cust.getfName());
        lnamefield.setText(cust.getlName());
        cidfield.setText(cust.getcID());
        psprtfield.setText(cust.getPassport());
        
    }//GEN-LAST:event_custComboBoxActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
       rightPanel.remove(this);
       CardLayout layout = (CardLayout)rightPanel.getLayout();
       layout.previous(rightPanel);
    }//GEN-LAST:event_backButtonActionPerformed

    private void iComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton bookButton;
    private javax.swing.JTextField cidfield;
    private javax.swing.JComboBox<String> custComboBox;
    private javax.swing.JTextField fnamefield;
    private javax.swing.JComboBox<String> iComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField lnamefield;
    private javax.swing.JTextField psprtfield;
    private javax.swing.JComboBox<String> wComboBox;
    // End of variables declaration//GEN-END:variables
}
