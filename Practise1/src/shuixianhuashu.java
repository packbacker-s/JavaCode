public class shuixianhuashu {
    public static void main(String[] args) {
        for(int i = 1; i <= 999999999; i++ ){
            int cnt = 0;
            int temp = i;
            while(temp != 0) {
                cnt++;          //多少位数
                temp /= 10;
            }
            temp = i;
            int sum = 0;
            while(temp!= 0) {
                sum += Math.pow(temp % 10, cnt);
                temp /= 10;
            }
            if(sum == i) {
                System.out.println(i + " is my result!");
            }
        }
    }
}
