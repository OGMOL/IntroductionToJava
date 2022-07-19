package basics_of_software_code_development.linear;

public class Task2 {

    public static void calculateFunction(double a, double b, double c) {
        double result = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c) / 2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
        System.out.println(result);
    }

    public static void main(String[] args) {
        calculateFunction(3, 2, 2);
    }
}
