public class Pattern {
    public static void main(String[] args) {
        System.out.println("Printing Pattern 1: ");
        pattern1(5, 5);
        System.out.println("\n\nPrinting Pattern 2: ");
        pattern2(5);
        System.out.println("\n\nPrinting Pattern 3: ");
        pattern3(5);
        System.out.println("\n\nPrinting Pattern 4: ");
        pattern4(5);
        System.out.println("\n\nPrinting Pattern 5: ");
        pattern5(5);
        System.out.println("\n\nPrinting Pattern 6: ");
        pattern6(5);
    }

    /* 1.

     *****
     *   *
     *   *
     *   *
     *****
      
     */
    public static void pattern1(int col, int row) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if ((i == 0 || i == row - 1) || (j == 0 || j == col - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    /* 2.

     *****
     ****
     ***
     **
     *
     
     */
    public static void pattern2(int r) {
        for (int i = 0; i < r; i++) {
            for (int j = i; j < r; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /* 3.

    *
    **
    ***
    ****
    *****
     
     */
    public static void pattern3(int r) {
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= r; j++) {
                if (j <= r - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    /* 4.
     * 
     * 1
     * 22
     * 333
     * 4444
     * 55555
     * 
     */
    public static void pattern4(int r) {
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    /* 5.
     * 
     * 1
     * 2 3
     * 4 5 6
     * 7 8 9 10
     * 
     */
    public static void pattern5(int r) {
        int temp = 1;
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(temp++ + " ");
            }
            System.out.println();
        }
    }

    /* 6.

    *      *
    **    **
    ***  ***
    ********
    ********
    ***  ***
    **    **
    *      *

    */
    public static void pattern6(int r) {
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i; j++) {
               System.out.print("*");
            }
            int space = 2*r - 2*i;
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
             }
            System.out.println();
        }
        

        for(int i=r;i>=1;i--){
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
             }
             int space = 2*r - 2*i;
             for(int j=1;j<=space;j++){
                 System.out.print(" ");
             }
             for (int j = 1; j <= i; j++) {
                 System.out.print("*");
              }
             System.out.println();
        }
    }

    /* 7.

        *****
       *****
      *****
     *****
    *****

    */
    public static void pattern7(int r) {
        for (int i = 1; i <= 5; i++) {
            for(int j=r-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=r;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*

    12345
    1234
    123
    12
    1

    */
    public static void pattern8(int r) {
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= r-i+1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    /* 9.
     
       *   *
        * *
         *
        * *
       *   *
       
     */
    public static void pattern9(int n) {
        int i, j;

        // Upper V pattern
        for (i = n; i >= 1; i--) {
            for (j = i; j < n; j++) {
                System.out.print(" "); // print spaces
            }
            for (j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1)) // Logic for printing star
                    System.out.print("*");
                else
                    System.out.print(" "); // if logic fails print space
            }
            System.out.println("");
        }

        // Lower Inverted V pattern
        for (i = 2; i <= n; i++) {
            for (j = i; j < n; j++) {
                System.out.print(" "); // Print spaces
            }
            for (j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1)) // Logic for printing star
                    System.out.print("*");
                else
                    System.out.print(" "); // if logic fails print space
            }
            System.out.println("");

        }
    }

    /* 10.

    1
    0  1
    1  0  1
    0  1  0  1
    1  0  1  0  1

    */
    public static void pattern10(int r) {
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i+j)%2==0) {
                    System.out.print(" 1 ");
                }else{
                    System.out.print(" 0 ");
                }
            }
            System.out.println();
        }
    }

    /* 11.

        1
       12
      123
     1234
    12345

    */
    public static void pattern11(int r) {
        for (int i = 1; i <= r; i++) {
            for (int j = r - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
