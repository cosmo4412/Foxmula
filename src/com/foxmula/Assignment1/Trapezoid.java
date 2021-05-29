package com.foxmula.Assignment1;

class Trapezoid extends Quadrilateral {
    private int height;

    Trapezoid(int a, int b, int c, int d, int e, int f, int g, int h, int i) {
        points(a, b, c, d, e, f, g, h);
        height = i;
    }

    int area() {
        int d1 = (int) Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        int d2 = (int) Math.sqrt((x3 - x4) * (x3 - x4) + (y3 - y4) * (y3 - y4));
        return (int) ((d1 + d2) * height) / 2;
    }
}