package com.company;

import java.util.Scanner;
//Main Class to Calculate the interest rate
public class Main extends bank_details{


    public static void main(String[] args) {
        // write your code here
        Scanner k = new Scanner(System.in);
        bank_details b = new bank_details();
        b.bank_name();
        b.loan();
        //Getting repayment period from user
        System.out.println("Enter time period in years:");
        int t = k.nextInt();
        int t1=t*12;
        //Andhra Bank-personal Loan
        if (b.bank_name == 1 && b.loan == 1) {
            double p=b.loan_amount();
            double r = 0.12/12;
            double emi = ((p * r * Math.pow(1 + r, t1)) / ((Math.pow(1 + r, t1) - 1)));
            double emi2=emi/12;
            System.out.println("The Emi for  month is:\n" + emi2);

        }
        //Andhra Bank-Educational Loan
        if (b.bank_name == 1 && b.loan == 2) {
            double p=b.loan_amount();
            double r = ((10.25/100)/12);
            double emi = ((p * r * Math.pow(1 + r, t1)) / (Math.pow(1 + r, t1) - 1));
            double emi2=emi/12;
            System.out.println("The Emi for  month is:\n" + emi2);

        }
        //Andhra Bank-Housing Loan
        if (b.bank_name == 1 && b.loan == 3) {
            double p=b.loan_amount();
            double r = ((6.85/100)*12);
            double emi = ((p * r * Math.pow(1 + r, t1)) / (Math.pow(1 + r, t1) - 1));
            double emi2=emi/12;
            System.out.println("The Emi for  month is:\n" + emi2);

        }
        //Andhra Bank-Gold Loan
        if (b.bank_name == 1 && b.loan == 4) {
            double p=b.loan_amount();
            double p1=p*2500;
            double r = 0.12/12;
            double emi = ((p1 * r * Math.pow(1 + r, t1)) / (Math.pow(1 + r, t1) - 1));
            double emi2=emi/12;
            System.out.println("The Emi for  month is:\n" + emi2);

        }
        //SBI Bank-personal Loan

        if (b.bank_name == 2 && b.loan == 1) {
            double p=b.loan_amount();
            double r = ((9.6/100)/12);
            double emi = ((p * r * Math.pow(1 + r, t1)) / (Math.pow(1 + r, t1) - 1));
            double emi2=emi/12;
            System.out.println("The Emi for  month is:\n" + emi2);

        }
        //SBI Bank-educational Loan
        if (b.bank_name == 2 && b.loan ==2 ) {
            double p=b.loan_amount();
            double r =( (8.12/100)/12);
            double emi = ((p * r * Math.pow(1 + r, t1)) / (Math.pow(1 + r, t1) - 1));
            double emi2=emi/12;
            System.out.println("The Emi for  month is:\n" + emi2);

        }
        //SBI Bank-housing Loan
        if (b.bank_name == 2 && b.loan ==3 ) {
            double p=b.loan_amount();
            double r = ((6.9/100)/12);
            double emi = ((p * r * Math.pow(1 + r, t1)) / (Math.pow(1 + r, t1) - 1));
            double emi2=emi/12;
            System.out.println("The Emi for  month is:\n" + emi2);

        }
        //SBI Bank-gold loan
        if (b.bank_name == 2 && b.loan ==4 ) {
            double p=b.loan_amount();
            double p1=p*2500;
            double r = ((7.30/100)/12);
            double emi = ((p1 * r * Math.pow(1 + r, t1)) / (Math.pow(1 + r, t1) - 1));
            double emi2=emi/12;
            System.out.println("The Emi for  month is:\n" + emi2);

        }
        //cbi bank- personal loan
        if (b.bank_name == 3 && b.loan ==1 ) {
            double p=b.loan_amount();
            double r = ((9.83/100)/12);
            double emi = ((p * r * Math.pow(1 + r, t1)) / (Math.pow(1 + r, t1) - 1));
            double emi2=emi/12;
            System.out.println("The Emi for  month is:\n" + emi2);

        }
        //cbi Bank -educational loan
        if (b.bank_name == 3 && b.loan ==2 ) {
            double p=b.loan_amount();
            double r = ((8.25/100)/12);
            double emi = ((p * r * Math.pow(1 + r, t1)) / (Math.pow(1 + r, t1) - 1));
            double emi2=emi/12;
            System.out.println("The Emi for  month is:\n" + emi2);

        }
        //cbi Bank-Housing loan
        if (b.bank_name == 3 && b.loan ==3 ) {
            double p=b.loan_amount();
            double r = ((7.3/100)/12);
            double emi = ((p * r * Math.pow(1 + r, t1)) / (Math.pow(1 + r, t1) - 1));
            double emi2=emi/12;
            System.out.println("The Emi for  month is:\n" + emi2);

        }
        //cbi Bank-Gold loan
        if (b.bank_name == 3 && b.loan ==4 ) {
            double p=(b.loan_amount());
            double p1=p*2500;
            double r = ((5.88/100)/12);
            double emi = ((p1 * r * Math.pow(1 + r, t1)) / (Math.pow(1 + r, t1) - 1));
            double emi2=emi/12;
            System.out.println("The Emi for month is:\n" + emi2);

        }

    }
}
