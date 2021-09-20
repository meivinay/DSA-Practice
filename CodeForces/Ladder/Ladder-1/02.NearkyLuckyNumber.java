import java.util.*;
import java.math.BigInteger;
public class NearlyLuckyNumber{
    public static void main(String []args){
        Scanner scn = new Scanner(System.in);
        // nearly number =>
        // no. of lucky numbers is a lucky number
        // 1<=n<=10^8
        String input = scn.next();
        scn.close();
        boolean lucky = isLucky(input);
        System.out.println(lucky?"YES":"NO");
       
    }
    public static boolean isLucky(String input){
        //check if current digit is a lucky number
        //// increase number of lucky digits encountered
        // also keep track of length of the number
        // if no number other than lucky number found return true
        // else if a non-lucky number found than check if numbers of digits is a lucky number or not(this is a recursive call)
        int numOfLuckyDigit=0;
        for(int i=0; i<input.length();i++){
         char ch = input.charAt(i);
         if(ch == '4' || ch == '7'){
             numOfLuckyDigit++;
         }
        }
        if(numOfLuckyDigit == 4 || numOfLuckyDigit ==7){
            return true;
        }
        else {
            return false;
        }
        }
    }
