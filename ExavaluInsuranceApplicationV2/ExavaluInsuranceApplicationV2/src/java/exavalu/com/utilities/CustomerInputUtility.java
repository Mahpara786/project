/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exavalu.com.utilities;

import exavalu.com.beans.Customer;

/**
 *
 * @author Avijit Chattopadhyay
 */
public class CustomerInputUtility {

    public static Customer getCustomerInput() {
        Customer customer = new Customer();
        customer.setCustomerName("Patel Ji");
        customer.setAge(32);
        customer.setOccupation("Service");
        
        return customer;
    }
    
}
