public class assignment6 {
    public static void main (String[] args) {
        System.out.println("This program accepts an array of real numbers as a parameter and returns true if the list is insorted (nondecreasing) order and false otherwise.");
        System.out.println();
        
        double[] testArr1 = new double[]{16.1, 12.3, 22.2, 14.4};
        double[] testArr2 = new double[]{1.5, 4.3, 7.0, 19.5, 25.1, 46.2};
        
        System.out.println("Test Array 1 = {16.1, 12.3, 22.2, 14.4}");
        System.out.println("Result of isSorted(testArr1): " + isSorted(testArr1));
        System.out.println();
        
        System.out.println("Test Array 2 = {1.5, 4.3, 7.0, 19.5, 25.1, 46.2}");
        System.out.println("Result of isSorted(testArr2): " + isSorted(testArr2));
        System.out.println();
    }
    
    public static boolean isSorted(double[] arr) {
        for(int i = 1; i < arr.length; i++) {
            if((arr[i]) < arr[i-1]) {
               return false;
            }
        }
        return true;
    }
}