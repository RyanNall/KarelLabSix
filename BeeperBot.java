
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class BeeperBot extends Robot
{
    //instance variable to store beeper count
    int[] beeperList = new int[13];
    int tempCount = 0;
    int beepers;
    int avenue = -1;
    public BeeperBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void findAndCountBeepers() {
        while (frontIsClear()){
        moveToAvenueWithBeepers();
        collectBeepersOnAvenue();
        }
        getBeeperList();
        turnOff();
        
        
    }
    public void moveToAvenueWithBeepers(){
     while (!nextToABeeper() && frontIsClear()){
        move();
        avenue++;

        
    }
    }
    public void collectBeepersOnAvenue(){
        turnLeft();
        
        while (nextToABeeper()){
            pickBeeper();
            beepers ++;
            move();
        }
        beeperList [avenue] = beepers;

        beepers = 0;
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

