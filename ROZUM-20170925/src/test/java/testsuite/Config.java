package testsuite;

import java.awt.Rectangle;

public class Config {

    Rectangle rect1Default = new Rectangle(0,0,3,3);

    //Rectangle to check the exception for width and height less than zero
    Rectangle rect2WithHeightLessThanZero = new Rectangle(1,1, -3,-3);

    //Rectangles to test Disjoint
    Rectangle rect2Disjoint1 = new Rectangle(-1,5,5,1);
    Rectangle rect2Disjoint2 = new Rectangle(4,1,2,3);
    Rectangle rect2Disjoint3 = new Rectangle(6,5,1,1);

    //Rectangles to test Touch
    Rectangle rect2Touch1 = new Rectangle(3,-1,2,3);
    Rectangle rect2Touch2 = new Rectangle(-1,3,6,1);
    Rectangle rect2Touch3 = new Rectangle(3,3,3,3);

    //Rectangles to test Overlap
    Rectangle rect2Overlap1 = new Rectangle(2,-1,2,2);
    Rectangle rect2Overlap2 = new Rectangle(1,-2,1,6);
    Rectangle rect2Overlap3 = new Rectangle(-1,2,5,3);
    Rectangle rect2Overlap4 = new Rectangle(1,1,1,1);
    Rectangle rect2Overlap5 = new Rectangle(1,0,1,3);
    Rectangle rect2Overlap6 = new Rectangle(-1, -1, 5, 5);
}
