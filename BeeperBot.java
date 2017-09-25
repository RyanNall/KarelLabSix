
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class BeeperBot extends Robot
{
    //instance variable to store beeper count
    int[] beeperList = new int[13];
    int tempCount = 0;
    
    public BeeperBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void findAndCountBeepers() {
        while (frontIsClear()){
        moveToAvenueWithBeepers();
        collectBeepersOnAvenue();
        }
        turn.Off();
        
        
    }
    public void moveToAvenueWithBeepers(){
     while (!nextToABeeper()){
      move();
     }
    }
    public void collectBeepersOnAvenue(){
        turnLeft();
        while (nextToABeeper()){
            pickBeeper();
            move();
        }
        turnRight();
        turnRight();
        while (frontIsClear()){
            move();
        }
        turnLeft();
    }
    public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public int[] getBeeperList() {
            //This will be used to print the beepers found.  No need to modify.
            return beeperList;
    }
   
}

