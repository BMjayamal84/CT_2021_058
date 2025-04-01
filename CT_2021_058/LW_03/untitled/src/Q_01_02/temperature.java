package Q_01_02;

public class temperature {
    private double celsius;
    private double fahrenheit;

    public temperature() {
        celsius = 0;
        fahrenheit = 0;
    }

    public temperature(double celsius) {
        this.celsius = celsius;
    }

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double fahrenheit) {
        celsius = (fahrenheit - 32) * 5/9 ;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double celsius) {
        fahrenheit = celsius * 9/5 + 32 ;
    }

}
