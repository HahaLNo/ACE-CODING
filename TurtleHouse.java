import java.util.*;
import java.awt.*;

public class TurtleHouse {
  public static void main(String[] args){
    World world = new World(900, 900);

    Turtle yertle = new Turtle(world);
    yertle.setBodyColor(Color.cyan);
    yertle.setShellColor(Color.cyan);
    yertle.penUp();
    yertle.setHeight(10);
    yertle.setWidth(10);
    yertle.moveTo(500, 500);
    yertle.penDown();
    yertle.forward();
    yertle.turnRight();
    yertle.forward();
    yertle.turnRight();
    yertle.forward();
    yertle.turnRight();
    yertle.forward();

    Turtle kertle = new Turtle(world);
    kertle.setBodyColor(Color.green);
    kertle.setShellColor(Color.green);
    kertle.penUp();
    kertle.moveTo(540,500);
    kertle.penDown();
    kertle.forward(35);
    kertle.turnRight();
    kertle.forward(25);
    kertle.turnRight();
    kertle.forward(35);
    kertle.turnRight();
    kertle.forward(15);

    Turtle mertle = new Turtle(560, 440, world);
    mertle.setBodyColor(Color.red);
    mertle.setShellColor(Color.red);
    mertle.penUp();
    mertle.moveTo(560, 440);
    mertle.penDown();
    mertle.forward(20);
    mertle.turnRight();
    mertle.forward(15);
    mertle.turnRight();
    mertle.forward(15);
    mertle.turnRight();
    mertle.forward(20);

    Turtle pertle = new Turtle(world);
    pertle.setBodyColor(Color.magenta);
    pertle.setShellColor(Color.magenta);
    pertle.penUp();
    pertle.moveTo(520, 440);
    pertle.penDown();
    pertle.forward(20);
    pertle.turnRight();
    pertle.forward(15);
    pertle.turnRight();
    pertle.forward(15);
    pertle.turnRight();
    pertle.forward(20);

    Turtle gertle = new Turtle(world);
    gertle.setBodyColor(Color.green);
    gertle.setShellColor(Color.green);
    gertle.penUp();
    gertle.moveTo(480, 412);
    gertle.penDown();
    gertle.turn(45);
    gertle.forward();
    gertle.turn(90);
    gertle.forward();
    /*
    CustomTurtle yertle = new CustomTurtle(500, 500, world, Color.cyan, Color.cyan, 10, 10);
    yertle.forward();
    yertle.turnRight();
    yertle.forward();
    yertle.turnRight();
    yertle.forward();
    yertle.turnRight();
    yertle.forward();



    Turtle mertle = new Turtle(world);
    mertle.setBodyColor(Color.red);
    mertle.setShellColor(Color.red);
    mertle.penUp();
    mertle.moveTo(560, 440);
    mertle.penDown();
    mertle.forward(20);
    mertle.turnRight();
    mertle.forward(15);
    mertle.turnRight();
    mertle.forward(30);

  
*/
    world.show(true);
  }
}