import java.util.Scanner;

public class ex_04 {
//運用
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        System.out.println(fun(a)/(fun(b)*fun(a-b)));
    }

    public static int fun(int a) {
        int sum1 = 1;
        for (int i = a; i > 1; i--) {
            sum1 = sum1 * i;
        }
        return sum1;
    }
}


