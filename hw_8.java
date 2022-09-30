import java.util.Scanner;
public class hw_8 {

    public static void main (String[] arg){
        System.out.print("Enter a double: ");
        Scanner scan = new Scanner(System.in); 
        double myDouble = scan.nextDouble();
        System.out.println(myDouble);
        System.out.println((int) myDouble);
        myDouble += 0.5;
        System.out.println(myDouble);
        System.out.println((int) myDouble);


    }

}
