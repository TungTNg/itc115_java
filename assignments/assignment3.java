public class assignment3 {
    public static void main(String[] args) {
        // declare the program function
        System.out.println("This program calculates and prints out the result from calling printPowersOfN method.");
        System.out.println();
        
        // call the method printPowersOfN
        printPowersOfN(2,7);
        printPowersOfN(5,3);
        
    }
    
    // define method printPowersOfN to take 2 arguments
    public static void printPowersOfN(int mainNumber, int expoNumber) {
        // loop to print out result of power of mainNumber until the expoNumber
        for (int i = 0; i <= expoNumber; i++) {
            // since Math.pow return the result as a double [double pow(double a, double b)], we need to store that variable as a double
            double result = Math.pow(mainNumber, i);
            
            // since the requirement is to print out a whole number, we need to cast that double variable to an int variable
            int resultInt = (int) result;
            
            // print out the result after each loop 
            System.out.print(resultInt + " ");
        }
        System.out.println();
    }
}

