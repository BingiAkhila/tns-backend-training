package com.tnsif.casestudy;

import java.util.Scanner;

public class BankingSystemApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankingServiceImple service = new BankingServiceImple();
        int choice;

        do {
            System.out.println("\nBanking System");
            System.out.println("1. Add Customer");
            System.out.println("2. Add Account");
            System.out.println("3. Add Beneficiary");
            System.out.println("4. Add Transaction");
            System.out.println("5. Find Customer by ID");
            System.out.println("6. List Accounts by Customer");
            System.out.println("7. List Transactions by Account");
            System.out.println("8. List Beneficiaries by Customer");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Customer ID: ");
                    int cid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Address: ");
                    String address = sc.nextLine();
                    System.out.print("Contact: ");
                    String contact = sc.nextLine();
                    service.addCustomer(new Customer(cid, name, address, contact));
                    break;

                case 2:
                    System.out.print("Account ID: ");
                    int aid = sc.nextInt();
                    System.out.print("Customer ID: ");
                    int custID = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Account Type (Saving/Current): ");
                    String type = sc.nextLine();
                    System.out.print("Balance: ");
                    double bal = sc.nextDouble();
                    service.addAccount(new Account(aid, custID, type, bal));
                    break;

                case 3:
                    System.out.print("Beneficiary ID: ");
                    int bid = sc.nextInt();
                    System.out.print("Customer ID: ");
                    int bcustID = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Beneficiary Name: ");
                    String bname = sc.nextLine();
                    System.out.print("Account Number: ");
                    String bacc = sc.nextLine();
                    System.out.print("Bank Details: ");
                    String bdetails = sc.nextLine();
                    service.addBeneficiary(new Beneficiary(bid, bcustID, bname, bacc, bdetails));
                    break;

                case 4:
                    System.out.print("Transaction ID: ");
                    int tid = sc.nextInt();
                    System.out.print("Account ID: ");
                    int taid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Type (Deposit/Withdrawal): ");
                    String ttype = sc.nextLine();
                    System.out.print("Amount: ");
                    double amt = sc.nextDouble();
				service.addTransaction(new Transaction(tid, taid, ttype, amt));
                    break;

                case 5:
                    System.out.print("Customer ID: ");
                    int fid = sc.nextInt();
                    System.out.println(service.findCustomerById(fid));
                    break;

                case 6:
                    System.out.print("Customer ID: ");
                    int cust = sc.nextInt();
                    for (Account a : service.getAccountsByCustomerId(cust))
                        System.out.println(a);
                    break;

                case 7:
                    System.out.print("Account ID: ");
                    int acc = sc.nextInt();
                    for (Transaction t : service.getTransactionsByAccountId(acc))
                        System.out.println(t);
                    break;

                case 8:
                    System.out.print("Customer ID: ");
                    int bc = sc.nextInt();
                    for (Beneficiary b : service.getBeneficiariesByCustomerId(bc))
                        System.out.println(b);
                    break;

                case 9:
                    System.out.println("Thank you!");
                    break;
            }
        } while (choice != 9);

        sc.close();
    }
}
