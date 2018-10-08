public class assignment2 {
    public static void main(String[] args) {
        // declare the program function
        System.out.println("This program calculates and print out the first 12 Fibonacci numbers.");
        System.out.println();
        
        // declare 3 main variable we'll use (fn-1, fn, fn+1 {fibo} ) 
        int fn = 1;
        int fn_1 = 0;
        int fibo = 0;
        
        // main logic, after every loop, fn+1 /fibo number will be created as the sum of fn + f(n-1)
        // then the current number fn become fibbo (to be waiting for next loop) & fn-1 = fn (last fn)
        for(int i = 0; i < 12; i++) {
            // print out result of current number in series. It's supposed to be fn, 
            // but for the purpose of print out the whole series from the beginning til the end,
            // I'll use f(n-1). You can change this to fn and the result of the 12th number is 144.
            
            // Print out the number first, then execute the loop logic
            System.out.println(fn_1);
            
            //loop logic
            fibo = fn + fn_1;
            fn_1 = fn;
            fn = fibo;
            
        }
    }
}

