package Q_03;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double ri,ro;
        Scanner scanner = new Scanner(System.in);
        Circle innerCircle = new Circle();
        Circle outerCircle = new Circle();

        System.out.print("Enter inner circle radius:");
        ri = scanner.nextDouble();
        System.out.print("Enter outer circle radius:");
        ro = scanner.nextDouble();

        innerCircle.setRadius(ri);
        innerCircle.computeArea();
        outerCircle.setRadius(ro);
        outerCircle.computeArea();
        System.out.println("Area of the shaded area: "+(outerCircle.getArea() - innerCircle.getArea()));
    }
}
