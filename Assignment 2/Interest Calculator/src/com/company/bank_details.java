package com.company;
import java.util.*;
//Class for Bank details
public class bank_details {
    Scanner k=new Scanner(System.in);
    int bank_name;
    int loan;

    //Function to get bank name from user
    void bank_name(){
        System.out.println("Select bank name:");
        System.out.println("1.Andhra Bank");
        System.out.println("2.SBI Bank");
        System.out.println("3.Central Bank of India");
        bank_name=k.nextInt();
        if(bank_name==1){
            System.out.println("You Selected Andhra Bank");
        }
        if(bank_name==2){
            System.out.println("You Selected SBI Bank");
        }if(bank_name==3){System.out.println("You Selected Central  Bank of India");}

    }
    //Function for getting the loan type from user
    void loan(){
        System.out.println("Select loan type:");

        System.out.println("1.Personal Loan");
        System.out.println("2.Educational Loan");
        System.out.println("3.Housing Loan");
        System.out.println("4.Gold Loan");
        loan=k.nextInt();
        if(loan==1){
            System.out.println("You Selected personal loan");
        }
        if(loan==2){
            System.out.println("You Selected Educational Loan");
        }if(loan==3){System.out.println("You Selected Housing Loan");}
        if(loan==4){
            System.out.println("You Selected Gold loan");
        }

    }

    //function for loan amount
    double loan_amount(){
        System.out.println("Enter loan amount or grams of gold :");
        return k.nextDouble();

    }
}
