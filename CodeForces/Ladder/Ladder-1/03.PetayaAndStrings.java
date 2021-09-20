import java.util.*;

 class PetayaAndStrings {
    public static void main(String []args){
        Scanner scn = new Scanner(System.in);
        String str1 = scn.next();
        String str2 = scn.next();
        scn.close();
        System.out.print(compare(str1, str2));
    }
    public static int compare(String str1, String str2){
        // int size1 = 0;  // ascii weight of string 1
        // int size2 = 0;  // ascii weight of string 2
        for(int i =0; i<str1.length();i++){
            int ch1 = str1.charAt(i) ;
            int ch2 = str2.charAt(i) ;

            // comverting both uppercase
            if(ch1>=97){
                ch1 -= 32;
            }
            if(ch2>=97){
                ch2 -= 32;
            }
            if(ch1 < ch2){
                return -1;
            }
            else if(ch1 > ch2){
                return 1;
            }
        }

        return 0;
    }
}
