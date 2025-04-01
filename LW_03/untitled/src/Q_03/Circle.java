package Q_03;

public class Circle {
    private double r;
    private double area;
    private final double Pi = 3.14;
    private double circumference;

    public Circle() {
        r = 0;
        area = 0;
        circumference = 0;
    }

    public void setRadius(double r) {
        this.r = r;
    }

    public double getArea() {
        return area;
    }

    public void computeArea(){
        area = Pi * r * r ;
    }

    public void computeCircumference(){
        circumference = 2 * Pi * r;
    }

}
