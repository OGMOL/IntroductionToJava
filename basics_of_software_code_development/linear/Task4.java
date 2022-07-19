package basics_of_software_code_development.linear;

public class Task4 {
    public static void calculateFunction(double a) {
        double result = (a * 1000) % 1000 + (int) a / 1000.0;
        System.out.println(result);
    }

    public static void main(String[] args) {
        calculateFunction(123.456);
    }
}
