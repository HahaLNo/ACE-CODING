import java.util.*;
import java.awt.*;

public class BlockLetter {
    public static void main(String[] args){
     
        World habitat = new World(300,300);
        Turtle yertle = new Turtle(habitat);  
        yertle.forward();
        yertle.turnLeft(); 
        yertle.forward();
        yertle.turnLeft();
        yertle.forward(300);
        yertle.turnLeft();
        yertle.forward();
        yertle.turnLeft();
        yertle.forward();
        yertle.forward();

        habitat.show(true);
    }
}