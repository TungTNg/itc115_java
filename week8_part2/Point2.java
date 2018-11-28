
// A Point object represents a pair of (x, y) coordinates.
// Version with multiple constructors, private access modifiers,getters, setters, 
//object equality test and toString methods


public class Point2 {
	
	//fields
    private int x;
    private int y;

    // Constructs a new point at the origin, (0, 0).
    public Point2() {
        this(0, 0);    // calls Point(int, int) constructor
    }

    // Constructs a new point with the given (x, y) location.
    // pre: x >= 0 && y >= 0
    public Point2(int x, int y) {
        if (x < 0 || y < 0) {
            throw new IllegalArgumentException();
        }

        this.x = x;
        this.y = y;
    }

    // Returns the distance between this Point and (0, 0).
    public double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }

    // Returns whether o refers to a point with the same (x, y)
    // coordinates as this point.
    public boolean equals(Object o) {
        if (o instanceof Point2) {
            Point2 other = (Point2) o;
            return x == other.x && y == other.y;
        } else {  // not a Point object
            return false;
        }
    }

    //set field x to a new value
    public void setX(int x) {
		this.x = x;
	}
    
    //set field y to a new value
	public void setY(int y) {
		this.y = y;
	}

	// Returns the x-coordinate of this point.
    public int getX() {
        return x;
    }

    // Returns the y-coordinate of this point.
    public int getY() {
        return y;
    }

    // Returns a String representation of this point.
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    // Shifts this point's location by the given amount.
    // pre: x + dx >= 0 && y + dy >= 0
    public Point2 translate(int dx, int dy) {
        return new Point2(x + dx, y + dy);
    }
}
