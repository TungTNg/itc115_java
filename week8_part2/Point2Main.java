
//client for Point2 objects

public class Point2Main {
    public static void main(String[] args) {
        // create two Point2 objects
        Point2 p1 = new Point2(7, 2);
        Point2 p2 = new Point2(4, 3);

        //create point of origin point 
        Point2 p3 = new Point2();
        
        System.out.println("p3 is " + p3.getX() + " " + p3.getY());
        
        // print each point and its distance from origin
        System.out.println("p1 is " + p1);
        System.out.println("distance from origin = " +
                           p1.distanceFromOrigin());

        System.out.println("p2 is " + p2);
        System.out.println("distance from origin = " +
                           p2.distanceFromOrigin());

        // translate each point to a new location
        p1 = p1.translate(11, 6);
        p2 = p2.translate(1, 7);

        // print the points again
        System.out.println("p1 is " + p1);
        System.out.println("p2 is " + p2);
        
        //test object equality
        System.out.println(p3.equals(p2));  //false
        
       //set new  values for fields
        p2.setX(0);
        p2.setY(0);
        

        System.out.println(p2.toString());
        System.out.println(p3.toString());
        
        
        //test equality again
        System.out.println(p3.equals(p2));  //true
        
    }
}