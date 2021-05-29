package com.foxmula.Assignment1;
import java.util.*;

public class Quadrilateral {
    protected int x1, y1, x2, y2, x3, y3, x4, y4;

    void points(int a, int b, int c, int d, int e, int f, int g, int h) {
        x1 = a;
        y1 = b;
        x2 = c;
        y2 = d;
        x3 = e;
        y3 = f;
        x4 = g;
        y4 = h;
    }

    public static void main(String args[]) {
        Square sq = new Square(4, 4, 5, 3, 6, 6, 3, 4);
        System.out.println("Area Of The Square is " + sq.area());
        Rectangle rec = new Rectangle(6, 6, 10, 6, 10, 11, 6, 11);
        System.out.println("Area Of The Rectangle is " + rec.area());
        Parallelogram p = new Parallelogram(20, 20, 40, 20, 30, 30, 10, 30, 8);
        System.out.println("Area Of The Parallelogram is " + p.area());
        Trapezoid t = new Trapezoid(10, 10, 30, 10, 40, 20, 0, 20, 8);
        System.out.println("Area Of The Trapezoid is " + t.area());
    }
}
