import java.util.Scanner;

public class assignment4 {
    public static void main(String[] args) {
        // declare the program function
        System.out.println("This program calculate the season of the year based on user input's Month & Day.");
        
        // call the method season
        System.out.println();
        System.out.println("The season is: " + season() + "!");
    }
    
    // define method to take user input
    public static int[] userInput() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the month of the year (1 - 12): ");
        int month = console.nextInt();
        
        System.out.print("Enter the day of the month (1 - 31): ");
        int day = console.nextInt();
        
        // return user input in an array
        int[] ar = new int[]{month, day};
        return ar;
    }
    
    // define method season
    public static String season() {
        // call method userInput and assigned returned value to 2 variables => month & day
        int[] ar = userInput();
        int month = ar[0];
        int day = ar[1];
        
        // define variable season as an empty string
        String season = "";
        
        // Logic to enforce user to input correct month & day
        while (month < 1 || month > 12 || day < 1 || day > 31) {
            System.out.println();
            System.out.println("Month has to be between (1 - 12) and Day has to be between (1 - 31)!!!");
            ar = userInput();
            month = ar[0];
            day = ar[1];
        }
        
        // Logic to determine season & reassign value of variable season accordingly
        switch (month) {
            // Winter
            case 12:
                if (day >= 16) {
                    season = "winter";
                } else {
                    season = "fall";
                }
                break;
                
            case 1:
            case 2:
                season = "winter";
                break;
                
            case 3:
                if (day <= 15) {
                    season = "winter";
                } else {
                    season = "spring";
                }
                break;
                
            // Spring
            case 4:
            case 5:
                season = "spring";
                
            case 6:
                if (day <= 15) {
                    season = "spring";
                } else {
                    season = "summer";
                }
                break;
                
            // Summer
            case 7:
            case 8:
                season = "summer";
                
            case 9:
                if (day <= 15) {
                    season = "summer";
                } else {
                    season = "fall";
                }
                break;
            
            // Fall
            case 10:
            case 11:
                season = "fall";
        }
        
        return season;
    }
}