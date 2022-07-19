package basics_of_software_code_development.linear;

public class Task5 {

    public static void calculateFunction(int t) {
        int hour = t / 3600;
        int min = t / 60 % 60;
        int sec = t % 60;
        System.out.println(hour + "ч " + min + "мин " + sec + "с");
    }

    public static void main(String[] args) {
        calculateFunction(66033);
    }
}
