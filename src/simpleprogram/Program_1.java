package simpleprogram;

import jdk.jfr.Percentage;

import java.util.Scanner;

public class Program_1 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        int Subject;
        float percentage;
        int multimedia,c_plus,java,Web,Database,Information_System;

        System.out.println("Enter the marks of the following subjects");

        System.out.println("Multimedia");
        multimedia = sc.nextInt();
        System.out.println("c_plus");
        c_plus=sc.nextInt();
        System.out.println("java");
        java=sc.nextInt();
        System.out.println("Web");
        Web=sc.nextInt();
        System.out.println("Database");
        Database=sc.nextInt();
        System.out.println("Information_System");
        Information_System=sc.nextInt();


        Subject=(multimedia+c_plus+java+Web+Database+Information_System);
        System.out.println("Total Marks of the Subjects is :: "+Subject);

        Subject=(multimedia+c_plus+java+Web+Database+Information_System)/6;
        System.out.println("Percentage of the Student :: "+Subject);

        










    }
}
