package com.epam.test;

import java.awt.Rectangle;


public class RectUtil {

    public static boolean isOverlapped (Rectangle rect1, Rectangle rect2) {

//        Exception was implemented to avoid misunderstanding considering that in real life height or width
//        can not be less than zero
        if ((rect1.height < 0) || (rect1.width < 0) || (rect2.height < 0) || (rect2.width < 0)) {
            throw new IllegalArgumentException("ERROR: Height and Width must be positive or zero");
        } else {
            if (((rect1.x <= rect2.x + rect2.width) && (rect2.x <= rect1.x + rect1.width)) &&
                    ((rect1.y <= rect2.y + rect2.height) && (rect2.y <= rect1.y + rect1.height))) {
                return true;
            } else {
                return false;
            }
        }
    }
}
