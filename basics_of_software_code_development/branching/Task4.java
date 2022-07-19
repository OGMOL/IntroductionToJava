package basics_of_software_code_development.branching;

public class Task4 {

    public static void brickInHole(int a, int b, int x, int y, int z) {
        if ((a < x) && (b < y) || (a < x) && (b < z) || ((a < z) && (b < y))) {
            System.out.println("not pass");
        } else {
            System.out.println("will pass");
        }
    }

    public static void main(String[] args) {
        brickInHole(100, 100, 100, 50, 101);
    }
}
