package Lesson_6.QueueSimulator;

public class QueueSimulator {
    private static SomeQueue<Person> people = new SomeQueue<>(); //статические методы могут работать только со статическими переменными
    private static Windows windows = new Windows(3);

    public static void simulate() {
        while (true) {
            addPersonInQueue();
            releaseWindow();
            addPersonInWindow();
            printInfo();
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
        for (int i = 1; i < windows.getCount() && !people.isEmpty(); i++) {
            if (!windows.isOccupied(i)) { //! отрицает любой boolean и переворачивает метод в обр сторону
                windows.addPerson(people.getFirst(), i);
                //System.out.println("Jryj " + i);
            }
        }
        for (int j = 0; j < windows.getWindows().length; j++) {
            if (windows.getWindows()[j] != null) {
                //String s = windows.getWindows()[j].toString();
                //windows.getWindows()[j];

            }
        }
    }

    public static void printInfo() {
        for (int j = 1; j < windows.getCount() && !people.isEmpty(); j++) {
            if (!windows.isOccupied(j)) {
                windows.addPerson(people.getFirst(), j);
            }
                for (int i = 0; i < windows.getWindows().length; i++) {
                    if (windows.getWindows()[i] != null) {
                        System.out.format(" | %-15s | %5s | ", windows.getWindows()[i].toString(), j);
                        System.out.println();
                    }
                }
            }
        }

    public static Windows getWindows() {
        return windows;
    }
}

