package Lesson_6.QueueSimulator;

public class Probability {

    public static boolean needToGeneratePerson() {
        int max = 100;                           //от 0 до 1
        int min = 0;
        int random = min + (int) (Math.random() * max);
            return random <= 60;
    }
}

