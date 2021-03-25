/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exavalu.com.beans;

import java.util.Date;

/**
 *
 * @author Avijit Chattopadhyay
 */
public class Policy {

    private int policyId;
    private String policyName;
    private String expiryDate;
    private String launchDate;
    private double premiumAmount;
    private double coverageAmount;
    private int minAgeOfOffering;
    private int maxAgeOfOffering;

    /**
     * @return the policyId
     */
    public int getPolicyId() {
        return policyId;
    }

    /**
     * @param policyId the policyId to set
     */
    public void setPolicyId(int policyId) {
        this.policyId = policyId;
    }

    /**
     * @return the policyName
     */
    public String getPolicyName() {
        return policyName;
    }

    /**
     * @param policyName the policyName to set
     */
    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    /**
     * @return the expiryDate
     */
    public String getExpiryDate() {
        return expiryDate;
    }

    /**
     * @param expiryDate the expiryDate to set
     */
    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    /**
     * @return the launchDate
     */
    public String getLaunchDate() {
        return launchDate;
    }

    /**
     * @param launchDate the launchDate to set
     */
    public void setLaunchDate(String launchDate) {
        this.launchDate = launchDate;
    }

    /**
     * @return the premiumAmount
     */
    public double getPremiumAmount() {
        return premiumAmount;
    }

    /**
     * @param premiumAmount the premiumAmount to set
     */
    public void setPremiumAmount(double premiumAmount) {
        this.premiumAmount = premiumAmount;
    }

    /**
     * @return the coverageAmount
     */
    public double getCoverageAmount() {
        return coverageAmount;
    }

    /**
     * @param coverageAmount the coverageAmount to set
     */
    public void setCoverageAmount(double coverageAmount) {
        this.coverageAmount = coverageAmount;
    }

    /**
     * @return the minAgeOfOffering
     */
    public int getMinAgeOfOffering() {
        return minAgeOfOffering;
    }

    /**
     * @param minAgeOfOffering the minAgeOfOffering to set
     */
    public void setMinAgeOfOffering(int minAgeOfOffering) {
        this.minAgeOfOffering = minAgeOfOffering;
    }

    /**
     * @return the maxAgeOfOffering
     */
    public int getMaxAgeOfOffering() {
        return maxAgeOfOffering;
    }

    /**
     * @param maxAgeOfOffering the maxAgeOfOffering to set
     */
    public void setMaxAgeOfOffering(int maxAgeOfOffering) {
        this.maxAgeOfOffering = maxAgeOfOffering;
    }

}
