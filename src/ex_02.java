import java.util.Scanner;

public class ex_02 {

    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int a= scn.nextInt();
        int b= scn.nextInt();
        int c= scn.nextInt();
        System.out.println(Math.max(Math.max(a,b),c));
        System.out.println(Math.min(Math.min(a,b),c));
    }
}
