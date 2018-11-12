import java.util.*;

public class extra_credit {
    public static void main (String[] args) {
        randomWalk();
    }
    
    public static void randomWalk() {
        Random rand = new Random();
        int position = 0;
        int stepForward = 1;
        int stepBackward = -1;
        Object[] positionArray = {};
        
        
        while (position < 3 && position > -3) {
            int stepRandom = rand.nextBoolean() ? stepForward : stepBackward;
            position += stepRandom;
            System.out.println("position = " + position);
            Object[] positionArray2 = position;
            positionArray = add(positionArray, positionArray2);
            
        }
        System.out.println(Arrays.toString(positionArray));
    }
}