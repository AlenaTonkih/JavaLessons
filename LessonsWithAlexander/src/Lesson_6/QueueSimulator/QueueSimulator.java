package Lesson_6.QueueSimulator;

import Lesson_4.Task_1.Units;

public class QueueSimulator {
    double time;

    public double getTime() {
        return time;
    }

    private static SomeQueue<Person> people = new SomeQueue<>(); //статические методы могут работать только со статическими переменными
    private static Windows windows = new Windows(3);

    public static SomeQueue<Person> getPeople() {
        return people;
    }

    public static void simulate() {
        while (true) {
            addPersonInQueue();
            releaseWindow();
            addPersonInWindow();
            Console.displayingOnTheScreen();
            Console.displayTable();
        }
    }
    private static void addPersonInQueue() {
        if (Probability.needToGeneratePerson()) {
            people.add(PersonGenerator.getRandomPerson());
        }
    }
    private static void releaseWindow() {
        for (int i = 0; i < windows.getCount(); i++) {
            if (windows.isOccupied(i)) {
                if (Probability.needToReleaseFreeWindow()) {
                    windows.freeWindow(i);
                }
            }
        }
    }
    private static void addPersonInWindow() {
        Table table = new Table("Имя", "Окно", "Время");
        for (int i = 1; i < windows.getCount() && !people.isEmpty(); i++) {
            if (!windows.isOccupied(i)) { //! отрицает любой boolean и переворачивает метод в обр сторону
                windows.addPerson(people.getFirst(), i);
            }
        }
        for (int j = 0; j < windows.getWindows().length; j++) {
            if (windows.getWindows()[j] != null) {
            }
        }
    }
    public static Windows getWindows() {
        return windows;
    }

}

