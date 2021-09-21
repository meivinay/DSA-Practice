class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length() > haystack.length()){
            return -1;
        }
        else if( needle.length() == 0 || haystack.length() == 0){
            return 0;
        }
        
        for(int i=0;i<haystack.length();i++){
            char ch = haystack .charAt(i);
            char ch2 = needle.charAt(0);
            
            int remLen = haystack.length()-i;
            if(remLen < needle.length()){
                return -1;
            }
            
            if(ch == ch2){
                boolean found = false;
                int j = 0;
                int k = i;
                while( j <needle.length() && k < haystack.length()){
                    if(haystack.charAt(k) == needle.charAt(j)){
                            found = true;
                        }
                    else{
                        found = false;
                        break;
                    }
                k++;
                j++;
                }
                
                if(found == true){
                    return i;
                }
                else{
                    found = false;
                }
            }
        }
        return -1;
    }
}