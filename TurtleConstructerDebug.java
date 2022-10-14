import java.util.*;
import java.awt.*;

public class TurtleConstructerDebug {
public static void main(String[] args){

World world1 = new World(300,100);

//Custom Turtle turtle1 = new CustomTurtle(world1); 
Turtle t0 = new Turtle(world1); 
Turtle t1 = new Turtle(world1);
Turtle t2 = new Turtle(100, 50, world1);
t0.forward();
t1.turnRight();
t2.turnLeft();
world1.show(true);

    }    
}
