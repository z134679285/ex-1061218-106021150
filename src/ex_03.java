import java.util.Scanner;
import java.util.SplittableRandom;

public class ex_03 {

    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        String st=scn.next();
        StringBuffer sb= new StringBuffer(st);
        sb.reverse();
        int count=0;
        for(int i=0;i<st.length();i++){
            if(st.charAt(i) ==sb.charAt(i)){
                count++;
            }
        }
        if(count ==st.length()){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
