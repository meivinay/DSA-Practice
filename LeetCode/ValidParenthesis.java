import java.util.*;
class ValidParenthesis{
public static void main(String []args){
    Scanner scn = new Scanner(System.in);
    String str = scn.next();
    Stack<Character> st = new Stack<>();
    scn.close();
    boolean isValid = true;
    for(int i =0;i<str.length();i++){
        char ch = str.charAt(i);
        if(ch == '(' || ch == '[' || ch=='{'){
            st.push(ch);
        }
        else{
            if(st.size() != 0){
               int stTop = st.peek();
               if(stTop == '[' && ch ==']'){
                    st.pop();
               }
               else if(stTop == '{' && ch == '}'){
                    st.pop();
               }
               else if(stTop == '(' && ch == ')'){
                    st.pop();
               }
               else{
                    isValid = false;
                      break;
                }
            }
            else{
                isValid = false;
                break;
            }
        }
    }
    if(isValid == true && st.size() == 0)
    System.out.print("true");
    else
    System.out.print(false);
}
}