/**
*
* Shuttle Run (Lab05 in Unit1, fcps.karel)
*
* @author Shaurya Prakash
* @version 5/11/2014
*/

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab05 {

     public static void runTheRace(Racer arg) {
          arg.shuttle(4, 7);
          arg.shuttle(6, 5);
          arg.shuttle(8, 3);
          arg.move();
     }

     public static void main(String[] args) {
            
            Display.openWorld("maps/shuttle.map");
            Display.setSize(10, 10);
            Display.setSpeed(10);
            
            Racer a = new Racer(7);
            Racer b = new Racer(4);
            Racer c = new Racer(1);
            runTheRace(a);
            runTheRace(b);
            runTheRace(c);
                 
   }
            
}