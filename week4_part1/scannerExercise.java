import java.util.Scanner;

public class scannerExercise {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("How old are you? ");
        int age = console.nextInt();
        
        System.out.print("How old is mom? ");
        int momAge = console.nextInt();
        
        System.out.println();
        System.out.println("Your age is " + age);
        System.out.println("Your mom's age is " + momAge);

    }
}