package com.mariiapasichna;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void printResult() {
        if (isQuadratic()) {
            double discriminant = Math.pow(b, 2) - (4 * a * c);
            if (discriminant < 0) {
                System.out.println("The quadratic equation " + a + "*x*x + " + b + "*x + " + c + " = 0 has no real roots");
            } else if (discriminant == 0) {
                double x = (-1) * b / (2 * a);
                System.out.println("The quadratic equation " + a + "*x*x + " + b + "*x + " + c + " = 0 has one root: x = " + x);
            } else if (discriminant > 0) {
                double x1 = ((-1) * b - Math.sqrt(discriminant)) / (2 * a);
                double x2 = ((-1) * b + Math.sqrt(discriminant)) / (2 * a);
                System.out.println("The quadratic equation " + a + "*x*x + " + b + "*x + " + c + " = 0 has two roots: x = " + x1 + ", x = " + x2);
            }
        } else {
            System.out.println("In the quadratic equation, 'a' can't be equal 0");
        }
    }

    private boolean isQuadratic() {
        return a != 0;
    }
}