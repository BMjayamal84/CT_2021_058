package Q_01;

import java.util.Scanner;

public class Q_01 {
    public static void main(String[] args) {

        //The square root of B^(2)+4AC
        double A;
        double B;
        double C;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value for A:");
        A = scanner.nextDouble();

        System.out.print("Enter value for B:");
        B = scanner.nextDouble();

        System.out.print("Enter value for C:");
        C = scanner.nextDouble();

        double calc = Math.sqrt(Math.pow(B,2)+4*A*C);
        System.out.println(calc);

        //The square root of X+4Y^(3)
        double X;
        double Y;

        System.out.print("Enter value for X:");
        X = scanner.nextDouble();

        System.out.print("Enter value for Y:");
        Y = scanner.nextDouble();

        double sqrt_xy = X + 4 * Math.pow(Y,3);
        System.out.println(sqrt_xy);

        //The cube root of the product of X and Y
        X=0;
        Y=0;
        System.out.print("Enter value for X:");
        X = scanner.nextDouble();

        System.out.print("Enter value for Y:");
        Y = scanner.nextDouble();

        double cubert = Math.cbrt(X*Y);
        System.out.println(cubert);

        //The area of a circle
        double R;
        final double Pi = 3.14;

        System.out.print("Enter the radius value:");
        R = scanner.nextDouble();

        double area = Pi*Math.pow(R,2);
        System.out.println("Area of the circle = "+ area);

    }
}
