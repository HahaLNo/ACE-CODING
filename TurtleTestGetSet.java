import java.util.*;
import java.awt.*;
import java.lang.Math;

public class TurtleTestGetSet
{
  public static void main(String[] args)
  {
      World world = new World(300,300);
      Turtle yertle = new Turtle(world);
      System.out.println("Yertle's width is: " + yertle.getWidth());
      yertle.setWidth(1);
      yertle.setHeight(1);
      System.out.println("Yertle's width is: " + yertle.getWidth());
      yertle.turnRight();
      world.show(true);
  }
}
