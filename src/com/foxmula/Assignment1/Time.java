package com.foxmula.Assignment1;

public class Time {
	private int hour, min, sec;

    Time(int h, int m, int s) {
        hour = h;
        min = m;
        sec = s;
    }

    Time() {
        hour = 0;
        min = 0;
        sec = 0;
    }

    public Time add(Time t2) {
        Time t4 = new Time();
        t4.sec = this.sec + t2.sec;
        if (t4.sec > 60) {
            t4.min += 1;
            t4.sec -= 60;
        }
        t4.min += this.min + t2.min;
        if (t4.min > 60) {
            t4.min -= 60;
            t4.hour += 1;
        }
        t4.hour += this.hour + t2.hour;
        return t4;
    }

    void show() {
        System.out.println("Final Time is: " + hour + ":" + min + ":" + sec);
    }

    public static void main(String args[]) {
        Time t1 = new Time(3, 20, 15);
        Time t2 = new Time(2, 10, 10);
        Time t3 = t1.add(t2);
        t1.show();
        t2.show();
        t3.show();
    }
}