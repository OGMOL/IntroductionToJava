package basics_of_software_code_development.branching;

public class Task3 {

    public static void positionStraightLine(int x1, int y1, int x2, int y2, int x3, int y3) {
        if ((y1 == y2 && y2 == y3) || (x1 == x2 && x2 == x3)) {
            System.out.println("Точки на одной прямой");
        } else {
            System.out.println("Точки не на одной прямой");
        }
    }

    public static void main(String[] args) {
        positionStraightLine(2,3,5,3,7,3);
    }
}
