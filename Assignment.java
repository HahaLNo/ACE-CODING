import java.util.Scanner;

public class Assignment {
    private String assignmentName;
    private double numberGrade;
    
    public Assignment(String initName, double initNumGrade){
        assignmentName = initName;
        numberGrade = initNumGrade;
    }

    public void letterGrade(){

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the name of the assignment");
        String assignmentName = scan.nextLine();
        
        System.out.println("Enter number grade");
        int numberGrade = scan.nextInt();

        if (numberGrade >= 90)
        {
            System.out.println("A");
        }

        else if (numberGrade >= 80)
        {
            System.out.println("B");
        }

        else if (numberGrade >= 70)
        {
            System.out.println("C");
        }

        else if (numberGrade >= 60)
        {
            System.out.println("D");
        }

        else 
        {
            System.out.println("F");
        }
    }

    public static void main(String[] args)
    {
        Assignment assignmentOne = new Assignment("homework", 88.5);
        assignmentOne.letterGrade();

        // Below, write the code to create four more objects to test out 
        // all of the conditions of your letterGrade() method.

        Assignment assignmentTwo = new Assignment("classwork", 96.0);
        Assignment assignmentThree = new Assignment("discussion", 75);
        Assignment assignmentFour = new Assignment("homework", 61.8);
        Assignment assignmentFive = new Assignment("homework", 58.0);
    }
}

    }

    public static void main(String[] args)
    {
        Assignment assignmentOne = new Assignment("homework", 88.5);
        assignmentOne.letterGrade();

        // Below, write the code to create four more objects to test out 
        // all of the conditions of your letterGrade() method.


    }
}
