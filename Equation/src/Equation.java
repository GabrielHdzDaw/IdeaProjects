/*
    Exercise 1
    Create a program called Equation.java that tries to solve a 2nd degree equation ax^2 + bx + c = 0, given the values of a, b and c. Here you can see the general formula:
*/

public class Equation {
    public static void main(String[] args) {
        double a = 1;
        double b = 5;
        double c = 2;

        double res1 = -b + Math.sqrt(Math.pow(b, 2) - 4 * a * c) / (2 * a);
        double res2 = -b - Math.sqrt(Math.pow(b, 2) - 4 * a * c) / (2 * a);

        System.out.println(Math.round(Math.abs(res1)));
        System.out.println(Math.round(Math.abs(res2)));
    }
}

