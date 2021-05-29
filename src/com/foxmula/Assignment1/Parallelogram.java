package com.foxmula.Assignment1;

class Parallelogram extends Quadrilateral {
    private int height;

    Parallelogram(int a, int b, int c, int d, int e, int f, int g, int h, int i) {
        points(a, b, c, d, e, f, g, h);
        height = i;
    }

    int area() {
        int d1 = (int) Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        return d1 * height;
    }
}