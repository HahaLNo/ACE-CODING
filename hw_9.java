import java.util.Scanner; 
public class hw_9 {
    public static void main (String[] args){
        System.out.print("First Int");
        Scanner scan = new Scanner(System.in);
        int int1 = scan.nextInt();
        System.out.print("Second Int");
        int int2 = scan.nextInt();
        System.out.println((double)int1/int2);
    }
}
