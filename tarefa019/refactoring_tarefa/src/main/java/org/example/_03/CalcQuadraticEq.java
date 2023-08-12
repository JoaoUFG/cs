package org.example._03;

public class CalcQuadraticEq {
    public void calcQuadraticEq(double a, double b, double c) {
        double D = b * b - 4 * a * c;

        if (D > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("x1 = " + x1 + ", x2 = " + x2);
            return;
        }

        if (D == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("x = " + x);
            return;
        }

            System.out.println("Equation has no real roots");

    }
}
