/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
 
public class CustomerDirectory {
    
    private ArrayList<Customer> customerArrayList;
    
    public CustomerDirectory()
    {   
        customerArrayList=new ArrayList<Customer>();
        
    }

    public ArrayList<Customer> getCustomerArrayList() {
        return customerArrayList;
    }

    public void setCustomerArrayList(ArrayList<Customer> customerArrayList) {
        this.customerArrayList = customerArrayList;
    }
    
    public Customer addcustomer()
    {
        Customer cust=new Customer();
        customerArrayList.add(cust);
        return cust;
    }
            
}
