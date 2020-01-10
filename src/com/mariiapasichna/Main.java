package com.mariiapasichna;

import java.util.Scanner;

public class Main {

    /*3. Написать программу которая решает квадратное уравнене вида a*x*x + b*x + c = 0, где заданы a,b,c.*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a:");
        double a = scanner.nextDouble();
        System.out.println("Enter b:");
        double b = scanner.nextDouble();
        System.out.println("Enter c:");
        double c = scanner.nextDouble();

        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        equation.printResult();
    }
}