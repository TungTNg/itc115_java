// Point object represents a pair of coordinators (x, y)

public class Point{
    // fields - what the object knows
    int x;
    int y;
    
    // constructor - called when the object id initialnized from the client 
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    // methods - what the class does
    public double distancedFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }
    
    public void translated(int dx, int dy) {
        x += dx;
        y += dy;
    }
} 