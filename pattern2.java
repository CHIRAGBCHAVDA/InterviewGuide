
public class patt6 {
    public static void main(String[] args) {
        int r = 4;
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
}


/*

*      *            Logic = for(i=1 to r){
**    **                        for(j=1 to 2*r){
***  ***             if(j>i && j<=2*r-i) SPACE
********             else *
********
***  ***
**    **
*      *

*/


public class patt7 {
    public static void main(String[] args) {
        int r = 5;
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= r-i+1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}


/*

12345
1234
123
12
1

*/




public class patt8 {
    public static void main(String[] args) {
        int r =5;
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
}

/*

 1
 0  1
 1  0  1
 0  1  0  1
 1  0  1  0  1

*/


public class patt9 {
    public static void main(String[] args) {
        int r = 5;
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
}

/*

    *****
   *****
  *****
 *****
*****

*/

public class patt10 {
    public static void main(String[] args) {
        int r=5;
        for (int i = 1; i <=r; i++) {
            for (int j = r-i; j >=1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}


/*

    1       Logic = for(i=1 to row)
   12                   for(j=row-i to 1 j--){ Space }
  123                   for(j=1 to i) { print J }
 1234
12345

*/
