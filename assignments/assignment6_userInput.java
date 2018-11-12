import java.util.*;

public class assignment6_userInput {
    public static void main (String[] args) {
        System.out.println("This program accepts an array of real numbers as a parameter and returns true if the list is insorted (nondecreasing) order and false otherwise.");
        System.out.println();
        
        List<String> list = new ArrayList<String>();
        Scanner stdin = new Scanner(System.in);
        
        System.out.print("Enter the number you want to add to the array (type \"exit\" to finish with the inputting): ");
        String userInput = stdin.next();
        
         while (!userInput.startsWith("exit")) {
            list.add(userInput);
            System.out.println("Current list is " + list);
            System.out.print("Enter the number you want to add to the array (type \"exit\" to finish with the inputting): ");
            userInput = stdin.next();
        }
        
        stdin.close();
        System.out.println("List is " + list);
        String[] arr = list.toArray(new String[0]);
        Double[] numbers = new Double[arr.length];
        for(int i = 0;i < arr.length;i++)        
        {
            try 
            {        
                numbers[i] = Double.parseDouble(arr[i]);
            }
            catch (NumberFormatException nfe)
            {
                numbers[i] = 0.0;
            }
    
        }
        
        System.out.println("The array is in a sorted order? => " + isSorted(numbers));
    
    }
    
    public static boolean isSorted(Double[] arr) {
        for(int i = 1; i < arr.length; i++) {
            if((arr[i]) < arr[i-1]) {
              return false;
            }
        }
        return true;
    }
}