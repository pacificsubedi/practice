package indivisualassignment;


public class FloydTriangle {

        public static void main(String[] args)
        {

            int n = 7;
            int i, j;
            int k = 1;

            for (i = 1; i <= n; i++) {


                for (j = 1; j <= i; j++) {


                    System.out.print(k + "  ");


                    k++;
                }


                System.out.println();
            }
        }
    }
