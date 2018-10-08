public class drawSquare {
    public static void main(String[] args) {
    drawLine();
    drawBody();
	drawLine();
    }
    
    public static void drawLine() {
        for (int i = 1; i <= 12; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
    
    public static void drawBody() {
		for (int i = 1; i <= 5; i++) {
		    System.out.print("*");
		    drawSpace();
		    System.out.print("*");
		    System.out.println();
		}
    }

    public static void drawSpace() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(" ");
        }
    }
}