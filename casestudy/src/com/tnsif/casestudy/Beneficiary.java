package com.tnsif.casestudy;

public class Beneficiary {
    private int beneficiaryID;
    private int customerID;
    private String name, accountNumber, bankDetails;

    public Beneficiary(int beneficiaryID, int customerID, String name, String accountNumber, String bankDetails) {
        this.beneficiaryID = beneficiaryID;
        this.customerID = customerID;
        this.name = name;
        this.accountNumber = accountNumber;
        this.bankDetails = bankDetails;
    }

    public int getBeneficiaryID() { return beneficiaryID; }
    public int getCustomerID() { return customerID; }
    public String getName() { return name; }

    @Override
    public String toString() {
        return "Beneficiary ID: " + beneficiaryID + ", Name: " + name;
    }
}
