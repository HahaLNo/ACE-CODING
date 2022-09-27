import java.util.Scanner;  
public class hw_7 {
   
    public static void main (String[] arg){
        System.out.print("Please enter the cost of the t-shirt: ");
        Scanner scan = new Scanner(System.in); 
        int cost = scan.nextInt();
        System.out.println("The t-shirt costs " + cost);
        cost++; 
        System.out.println("A personalized t-shirt costs:" + cost);
        cost--;
        System.out.println("Without personalization, the t-shirt costs " + cost);
    } 
}

