package pat_online_test;

import java.util.Scanner;

/**
 * @author sheepcore
 */
public class P1001_add_format {
    public static void main(String[] args) {
        int a, b, sum;
        String s;
        Scanner scanner = new Scanner(System.in);

        a = scanner.nextInt();
        b = scanner.nextInt();
        sum = a + b;
        boolean sign = sum >= 0;
        s = sum + "";
        int len = s.length();

        for (int i = 0; i < len; i++) {
            System.out.print(s.charAt(i));
            if(s.charAt(i) == '-'){
                continue;
            }
            if((i+1) % 3 == len % 3 && i != len -1){
                System.out.print(',');
            }

        }

    }
}
