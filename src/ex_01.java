import java.util.Scanner;

public class ex_01 {

    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
	    Double d=scn.nextDouble();
	    int n =scn.nextInt();
        System.out.println(Math.rint(d*Math.pow(10,n))/Math.pow(10,n));
    }
}
