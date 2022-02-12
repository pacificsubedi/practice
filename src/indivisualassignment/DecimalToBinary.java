package indivisualassignment;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int decimal;
        int a;
        String x ="";
        int count=0;

        System.out.println("Enter the Decimal number");
        decimal= sc.nextInt();

        while(decimal > 0)
        {
            a = decimal % 2;
            if(a == 1)
            {
                count++;
            }
            x = a + "" + x;
            decimal = decimal / 2;
        }
        System.out.println("The Binary conversion of number is"+x);

    }

}


