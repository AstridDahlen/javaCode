package com.company;
import java.util.Scanner;


public class Cashback {

    public static void main(String[] args) {


        Scanner myScanner = new Scanner(System.in);
        System.out.print("\nKostanden av varan: ");
        int totalSum = myScanner.nextInt();
        System.out.print("Ange belopp som du betalat med:");
        int sumPay = myScanner.nextInt();



        int changeBack = sumPay - totalSum;
        int totalback = sumPay - totalSum;


        int numThousand = (changeBack / 1000);
        changeBack = (changeBack % 1000);
        int numFivehoundred = (changeBack / 500);
        changeBack = (changeBack % 500);
        int numTwohoundred = (changeBack / 200);
        changeBack = (changeBack % 200);
        int numOnehundred = (changeBack / 100);
        changeBack = (changeBack % 100);
        int numFifty = (changeBack / 50);
        changeBack = (changeBack % 50);
        int numTwenty = (changeBack / 20);
        changeBack = (changeBack % 20);
        int numTwo = (changeBack / 2);
        changeBack = (changeBack % 2);
        int numOne = (changeBack / 1);
        changeBack = (changeBack % 1);




        // return information to user
        System.out.println("\nTotal amount of change to give: " + totalback);
        System.out.println("Number of thousand to give: " + numThousand);
        System.out.println("Number of fivehundred to give: " + numFivehoundred);
        System.out.println("Number of twohundred to give: " + numTwohoundred);
        System.out.println("Number of hundred to give: " + numOnehundred);
        System.out.println("Number of fifty to give: " + numFifty);
        System.out.println("Number of twenty to give: " + numTwenty);
        System.out.println("Number of twokrona to give: " + numTwo);
        System.out.println("Number of onekrona to give: " + numOne);



    }
}
