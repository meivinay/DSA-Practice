import java.util.*;
public class UltraFastMathematician{
    public static void main(String []args){
        Scanner scn = new Scanner(System.in);
        String num1 = scn.next();
        String num2 = scn.next();
        scn.close();
        String ans ="";
        for(int i=0;i<num1.length();i++){
            char ch1 = num1.charAt(i);
            char ch2 = num2.charAt(i);
            int d1 = ch1-'0';
            int d2 = ch2-'0';
            ans = ans + ((d1 + d2 ==1) ? 1 : 0) ;
        }
        System.out.print(ans);
        }
    }
