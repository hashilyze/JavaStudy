package org.example.ch02;

public class FloatEx1 {
    public static void main(String[] args) {
        float f = 9.12345678901234567890f;
        float f2 = 1.2345678901234567890f;
        double d = 9.12345678901234567890d;

        System.out.printf("f  : %f\n", f);
        System.out.printf("f  : %24.20f\n", f);
        System.out.printf("f2 : %24.20f\n", f2);
        System.out.printf("d  : %24.20f\n", d);
    }
}
