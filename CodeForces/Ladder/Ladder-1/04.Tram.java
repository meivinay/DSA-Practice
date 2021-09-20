import java.util.*;

 public class Tram{
    static class Pair{
        int exit;
        int enter;
        int cap;
        Pair(int ai, int bi, int cap){
            this.exit = ai;
            this.enter = bi;
            this.cap = cap;
        }
        Pair(){
    
        }
    }
    public static void main(String []args){
        Scanner scn = new Scanner(System.in);
        int stopsLength = scn.nextInt();
        Pair []stops = new Pair [stopsLength];
        for(int i =0; i<stopsLength;i++){
            int ai = scn.nextInt();
            int bi = scn.nextInt();
            stops[i] = new Pair(ai, bi,0);
        }
        scn.close();
       int tramMinCap = getMinCap(stops);
       System.out.print(tramMinCap);
    }
public static int getMinCap(Pair []stops){
    // get total passanger in curr stop i.e (total passenger in prev stop- total exit on curr stop) + numbr of people enter on curr stop
    // check if curr capacity is greater than prev capacity
    // return max capacity
    
    // first stop no one exit
    stops[0].cap = stops[0].enter;
    int minCap = stops[0].cap;
    for(int i =1;i<stops.length;i++){
        int currCap = (stops[i-1].cap-stops[i].exit)+stops[i].enter;
        stops[i].cap = currCap;
        if(currCap>minCap){
            minCap = currCap;
        }
    }
    return minCap;
}
}