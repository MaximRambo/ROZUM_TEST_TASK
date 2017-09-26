package com.epam.test;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        RectUtil rect = new RectUtil();
        boolean isOverlapped;
        isOverlapped = rect.isOverlapped(new Rectangle(0, 0, 1, 1), new Rectangle(0,0,1,1));

        //for testing purpose
        System.out.println(isOverlapped);
    }
}
