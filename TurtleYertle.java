import java.util.*;
import java.awt.*;

public class TurtleYertle {
    public static void main(String[] args){
        World habitat = new World(500,500);

        Turtle yertle = new Turtle(habitat);

        yertle.forward();
        yertle.turnLeft();
        yertle.forward();
        yertle.turnLeft();
        yertle.forward();
        yertle.turnLeft();
        yertle.forward();
        
        habitat.show(true);
    }
}
