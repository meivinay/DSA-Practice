import java.util.*;

public class AmusingJoke {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String guest = scn.next();
        String host = scn.next();
        String jumbledString = scn.next();
        scn.close();
        // put strings character to arraylist
        // ArrayList<Character> guestAL = makeAL(guest);
        // ArrayList<Character> hostAL = makeAL(host);
        ArrayList<Character> jumbledStringAL = makeAL(jumbledString);
        boolean guestAns = isPermutation(guest, jumbledStringAL);
        if(guestAns == false){
            System.out.print("NO");
            return;
        }
        boolean hostAns = isPermutation(host, jumbledStringAL);
        if(hostAns == false){
            System.out.print("NO");
            return;
        }
        if(jumbledStringAL.size() == 0){
            System.out.println("YES");
        }
        else{
            System.out.print("NO");
        }
    }
    public static boolean isPermutation(String str, ArrayList<Character> jumbledStringAL){
        int strLen = str.length();
        for(int i =0;i< str.length();i++){
            char ch = str.charAt(i);
            for(int j=0; j<jumbledStringAL.size();j++){
                char ch2 = jumbledStringAL.get(j);
                if(ch == ch2){
                    jumbledStringAL.remove(j);
                    strLen--;
                    break;
                }
            }
        }

        if(strLen == 0){
            return true;
        }
        else{
            return false;
        }
    }
    public static ArrayList<Character> makeAL(String jumbledString){
        ArrayList<Character> al = new ArrayList<>();
        for(int i=0; i<jumbledString.length();i++){
            al.add(jumbledString.charAt(i));
        }
        return al;
    }
}