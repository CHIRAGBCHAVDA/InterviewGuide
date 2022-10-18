
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
