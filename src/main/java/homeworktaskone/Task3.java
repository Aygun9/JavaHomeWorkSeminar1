package homeworktaskone;

import java.time.LocalTime;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine();

        LocalTime time = LocalTime.now();
        int hour = time.getHour();

        String greeting;
        if (hour >= 6 && hour < 12) {
            greeting = "Доброе утро";
        } else if (hour >= 12 && hour < 18) {
            greeting = "Добрый день";
        } else if (hour >= 18 && hour < 22) {
            greeting = "Добрый вечер";
        } else {
            greeting = "Доброй ночи";
        }

        System.out.println(greeting + ", " + name + "!");
    }
}
