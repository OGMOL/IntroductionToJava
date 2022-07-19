package basics_of_software_code_development.branching;

public class Task1 {

    public static void triangleTest(int a, int b) {
        if (a + b < 180) {
            System.out.println("it's a triangle");
        } if ((a + b) < 180 && (a + b == 90 || a ==90 || b == 90)) {
            System.out.println("it's a right triangle");
        } else {
            System.out.println("no such triangle exists");
        }
    }

    public static void main(String[] args) {
        triangleTest(90,30);
    }
}
