import java.util.Scanner;

public class sushu {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
            for(int i = 2; i <= n; i++) {
                int j;
                for(j = 2; j <= (int)Math.sqrt(i); j++) {
                    if(i % j == 0) {
                                                            //System.out.println(i + "不是素数！");
                        break;
                    }
                }
                if(j > (int)Math.sqrt(i)) {
                    System.out.println(i + "是素数！");

                }
            }



           /* for(int i = 2; i < (int)Math.sqrt(n); i++) {
                if(n % i == 0) {
                    System.out.println(n + "不是素数！");
                    break;
                }
            }
*/
          /*  for(int i = 2; i < n/n; i++) {
                if(n % i == 0) {
                    System.out.println(n + "不是素数！");
                    break;
                }
            }*/


           /* for(int i = 2; i < n; i++) {
                if(n % i == 0) {
                    System.out.println(n + "不是素数！");
                    break;
                }
            }*/






        /*Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        while(n <= 20) {
            if(n % 15 == 0) {
                System.out.println(n);
                //break;
                continue;
            }
            }
            n++;
        }*/


        /*for(byte i = 0; i <= 130; i++) {
            System.out.println(i);
        }*/
    }
}
