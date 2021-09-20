import java.util.*;

public class xeniaAndRingRoads {
public static void main (String []args){
    Scanner scn = new Scanner(System.in);
    int numOfHouses = scn.nextInt();
    int numOfTasks = scn.nextInt();
    int [] tasksArr = new int[numOfTasks];
    for(int i =0;i< numOfTasks;i++){
        tasksArr[i] = scn.nextInt();
    }
    scn.close();

    long completionTime = timeToCompleteAllTask(numOfHouses, numOfTasks, tasksArr);
    System.out.print(completionTime);
}    
public static long timeToCompleteAllTask(int houses, int tasks, int []tasksArr){
    int currHouse = 1;
    long time = currHouse-1;
    for(int i=0;i<tasks;i++){
        int newHouse =  tasksArr[i];
        if(newHouse > currHouse){
            time+= newHouse - currHouse;
        }
        else if(newHouse < currHouse){
                time+= (houses-currHouse) +  newHouse ;
            }
            currHouse = newHouse;
    }
    
    return time;
}
}
