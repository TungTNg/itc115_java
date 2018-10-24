import java.util.Scanner;

public class ifExample {
    public static void main (String args[]) {
        Scanner console = new Scanner(System.in);
        
        System.out.print("What is your gpa? ");
        double gpa = console.nextDouble();
        
        console.close();
        
        if(gpa >= 2) {
            System.out.println("Application accepted.");
        } else {
            System.out.println("Application got denied.");
        }
        
        System.out.println("Bye!");
    }
} 