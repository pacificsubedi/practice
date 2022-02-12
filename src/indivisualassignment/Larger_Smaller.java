package indivisualassignment;

import java.util.Scanner;

public class Larger_Smaller {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number");
        int first = sc.nextInt();
        System.out.println("Enter the second number");
        int second = sc.nextInt();


        if (first > second) {
            System.out.println("First is largest");
        } else {
            System.out.println("Second is greater");
        }

        if (first == second) {
           return;
        }
    }
}

