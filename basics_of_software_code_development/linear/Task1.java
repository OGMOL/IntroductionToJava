package basics_of_software_code_development.linear;

public class Task1 {

    public static void calculateFunction(double a, double b, double c) {
        double result = ((a - 3) * b / 2) + c;
        System.out.println(result);
    }

    public static void main(String[] args) {
        calculateFunction(3, 2, 4);
    }
}
