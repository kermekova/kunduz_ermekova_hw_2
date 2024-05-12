import java.util.Random;
import java.util.Scanner;


public class Main {
    public static String permission(int age, int temperature) {
        if ((age >= 20 && age <= 50 && temperature >= -20 && temperature <= 30) ||
                (age <= 20 && temperature >= 0 && temperature <= 28) ||
                (age >= 45 && temperature >= -10 && temperature <= 25)) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Введите свой возраст: ");
            int age = scanner.nextInt();
            int temperature = 10 ;
            String result = permission(age, temperature);
            System.out.println("Результат: " + result);
        }
    }

    public static int generateRandomAge() {
        Random random = new Random();
        return generateRandomAge ();
    }
}
