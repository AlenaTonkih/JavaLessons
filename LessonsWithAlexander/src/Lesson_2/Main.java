package Lesson_2;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        LocalTime localTime1 = LocalTime.of(10, 35);
        LocalTime localTime2 = LocalTime.of(1, 55);

        Time time = new Time();
        System.out.println("Сложение двух объектов времени: ");
        System.out.println(time.addTimeObj(localTime1, localTime2));
        System.out.println();
        System.out.println("Прибавление к объекту времени произвольного кол-ва минут: ");
        System.out.println(time.addMinutes(localTime1, 125));
    }
}
