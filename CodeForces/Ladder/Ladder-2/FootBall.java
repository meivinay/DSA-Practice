import java.util.*;

public class FootBall {
    public static void main(String []args){
        Scanner scn = new Scanner(System.in);

        String players = scn.next();
        
        if(players.length() <=7){
            System.out.print("NO");
            return;
        }

        int lastPlayerTeam = players.charAt(0) - '0' == 0 ? 0 : 1 ;  //true = team = 0; false = team = 1;
       
        int consecutivePlayers = 1;
        for(int i =1;i<players.length();i++){
            int currPlayerTeam = players.charAt(i) - '0';
            if(lastPlayerTeam == currPlayerTeam){
                consecutivePlayers++;
            }
            else{
                consecutivePlayers = 1;
                lastPlayerTeam = currPlayerTeam;
            }

            if(consecutivePlayers ==7){
                System.out.print("YES");
                return;
            }
        }
    System.out.print("NO");

        scn.close();
    }
}