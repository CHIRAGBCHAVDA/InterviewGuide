//This file contains the kind of patterns which are usually asked in tier 3 colleges' placements.

/* 1.

*****
*  *
*  *
*  *
*****

*/
public class patt1{
    public static void main(String[] args) {
        int col = 4;
        int row = 5;

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if((i==0||i==row-1) || (j==0||j==col-1)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}


/* 2. 

*****
****
***
**
*

*/

public class patt2 {
    public static void main(String[] args) {
        int r = 5;
        for(int i=0;i<r;i++){
            for (int j = i; j < r; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


/* 3. 

    *
   **
  ***
 ****
*****

*/

public class patt3 {
    public static void main(String[] args) {
        int r = 5;
        
        for(int i=1;i<=r;i++){
            for(int j=1;j<=r;j++){
                if(j<=r-i){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        
    }
}

/* 4.

1
22
333
4444
55555

*/

public class patt4 {
    public static void main(String[] args) {
        int r=5;
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

/* 5.

1 
2 3
4 5 6
7 8 9 10
11 12 13 14 15

*/

public class patt5 {
    public static void main(String[] args) {
        int r = 5;
        int temp = 1;
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(temp++ + " ");
            }
            System.out.println();
        }
    }
}



/*X Pattern 

*     *

 *   *

  * *

   *

  * *

 *   *

*     *  */

package Patterns;

import java.util.*;

public class Star {

public static void main(String args[]) {

int i, j, n;

Scanner sc = new Scanner(System.in);

System.out.println("Enter a value for n");

n = sc.nextInt(); //Input

//Upper V pattern

for (i = n; i >= 1; i--) {

for (j = i; j < n; j++) {

System.out.print(" ");//print spaces

}

for (j = 1; j <= (2 * i - 1); j++) {

if (j == 1 || j == (2 * i - 1))//Logic for printing star

System.out.print("*");

else

System.out.print(" ");//if logic fails print space

}

System.out.println("");

}

//Lower Inverted V pattern

for (i = 2; i <= n; i++) {

for (j = i; j < n; j++) {

System.out.print(" ");//Print spaces

}

for (j = 1; j <= (2 * i - 1); j++) {

if (j == 1 || j == (2 * i - 1))//Logic for printing star

System.out.print("*");

else

System.out.print(" ");//if logic fails print space

}

System.out.println("");

}

}

}

