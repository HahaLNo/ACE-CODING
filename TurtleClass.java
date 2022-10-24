import java.util.*;
import java.awt.*;

public class TurtleClass {
    public static void main(String[] args){
        World habitat = new World(300,300);
        Turtle yertle = new Turtle(400, 400, habitat);
        Turtle lertle = new Turtle(habitat);
        Turtle jertle = new Turtle(habitat);
        yertle.forward();
        yertle.turnLeft();
        yertle.forward();
  
        lertle.turnRight();
        lertle.forward();

        jertle.forward();
    
        habitat.show(true);
  }
}
