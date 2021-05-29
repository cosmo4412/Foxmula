package com.foxmula.Assignment1;

class Square extends Quadrilateral {
    Square(int a, int b, int c, int d, int e, int f, int g, int h) {
        points(a, b, c, d, e, f, g, h);
    }

    int area() {
        int d = (int) Math.sqrt((x1 - x2) * (x1 - x2) * 2);
        return d * d;
    }
}