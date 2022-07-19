package basics_of_software_code_development.linear;

public class Task3 {

    public static void calculateFunction(double x, double y) {
        double result = Math.sin(x) + Math.cos(y) / Math.cos(x) - Math.sin(y) * Math.tan(x * y);
        System.out.println(result);
    }

    public static void main(String[] args) {
        calculateFunction(3, 5);
    }
}
