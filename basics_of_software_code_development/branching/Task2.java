package basics_of_software_code_development.branching;

public class Task2 {

    public static void maxAmongMin(int a, int b, int c, int d) {

        int res = Math.max(Math.min(a, b), Math.min(c, d));
        System.out.println(res);
    }

    public static void main(String[] args) {
        maxAmongMin(12,3,4,6);
    }
}
