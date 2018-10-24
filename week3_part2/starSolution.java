public class starSolution {
    public static void main(String[] args) {
        line(13);
        line(7);
        line(35);
        System.out.println();
        box(10, 3);
        box(5, 4);
        box(20, 7);
    }
    
    // Prints the given number of stars plus a line break.
    public static void line(int count) {
        repeat("*", count);
        System.out.println();
    }
    
    // Prints a box of stars of the given size.
    public static void box(int width, int height) {
        line(width);
        
        for (int line = 1; line <= height - 2; line++) {
            System.out.print("*");
            repeat(" ", width - 2);
            System.out.println("*");
        }
        
        line(width);
    }
    
    // Prints the given String the given number of times.
    public static void repeat(String s, int times) {
        for (int i = 1; i <= times; i++) {
            System.out.print(s);
        }
    }
}
