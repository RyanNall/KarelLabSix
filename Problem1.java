
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem1 extends Robot
{
    public Problem1(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    int[] beeperList = new int[13];
    int tempCount = 0;
    int beepers;
    int avenue = 0;
    public void sortBeepers() {
       moveToStartingPosition();
       for (int index = 0; index < 8 ; index++){
           moveToAvenueWithBeepers();
           collectBeepersOnAvenue();
        }
       getBeeperList();
    }
    
    public void sortList(){
        
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
    public void moveToStartingPosition(){
        faceSouth();
        move();
        move();
        move();
        move();
        move();
        move();
        move();
        faceWest();
        move();
        faceEast();
    }
    public void faceSouth(){
        while (!facingSouth()){
            turnLeft();
        }
    }
    public void faceEast(){
        while (!facingEast()){
            turnLeft();
        }
    }
     public void faceWest(){
        while (!facingWest()){
            turnLeft();
        }
    }
}




