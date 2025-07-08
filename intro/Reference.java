import java.awt.*;
public class Reference {
    public static void main(String[] args){
        Point p1 = new Point(1,1);
        Point p2 = p1; // p2 is a reference to the same object as p1
        p2.x = 2; // Changing p2 will also change p1 since they refer to the same object
        System.out.println(p2); // Output: java.awt.Point[x=2,y=1]
        System.out.println(p1); // Output: java.awt.Point[x=2,y=1]
    }
    
}
