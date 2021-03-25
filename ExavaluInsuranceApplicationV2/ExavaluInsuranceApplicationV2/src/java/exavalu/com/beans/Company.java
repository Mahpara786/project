/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exavalu.com.beans;

import java.util.ArrayList;

/**
 *
 * @author Avijit Chattopadhyay
 */
public class Company {

    private String companyName;
    private Address companyAddress;
    private Contact companyContact;
    private  ArrayList customers;
    private  ArrayList policiesInForce;
    private  ArrayList customersWithPolicy;

    /**
     * @return the companyName
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * @param companyName the companyName to set
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * @return the companyAddress
     */
    public Address getCompanyAddress() {
        return companyAddress;
    }

    /**
     * @param companyAddress the companyAddress to set
     */
    public void setCompanyAddress(Address companyAddress) {
        this.companyAddress = companyAddress;
    }

    /**
     * @return the companyContact
     */
    public Contact getCompanyContact() {
        return companyContact;
    }

    /**
     * @param companyContact the companyContact to set
     */
    public void setCompanyContact(Contact companyContact) {
        this.companyContact = companyContact;
    }

    /**
     * @return the customers
     */
    public ArrayList getCustomers() {
        return customers;
    }

    /**
     * @param customers the customers to set
     */
    public void setCustomers(ArrayList customers) {
        this.customers = customers;
    }

    /**
     * @return the policiesInForce
     */
    public ArrayList getPoliciesInForce() {
        return policiesInForce;
    }

    /**
     * @param policiesInForce the policiesInForce to set
     */
    public void setPoliciesInForce(ArrayList policiesInForce) {
        this.policiesInForce = policiesInForce;
    }

    /**
     * @return the customersWithPolicy
     */
    public ArrayList getCustomersWithPolicy() {
        return customersWithPolicy;
    }

    /**
     * @param customersWithPolicy the customersWithPolicy to set
     */
    public void setCustomersWithPolicy(ArrayList customersWithPolicy) {
        this.customersWithPolicy = customersWithPolicy;
    }

}
