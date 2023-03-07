package Lesson_6.QueueSimulator;

public class QueueSimulator {
    private static SomeQueue<Person> people = new SomeQueue<>(); //статические методы могут работать только со статическими переменными
    private static Windows windows = new Windows(3);

    public static void simulate() {
        while (true) {
            addPersonInQueue();
            releaseWindow();
            addPersonInWindow();
        }
    }
    private static void addPersonInQueue(){
        if (Probability.needToGeneratePerson()) {
            people.add(PersonGenerator.getRandomPerson());
        }
    }

    private static void releaseWindow(){
        for (int i = 0; i < windows.getCount(); i++) {
            if (windows.isOccupied(i)) {
                if (Probability.needToReleaseFreeWindow()) {
                    windows.freeWindow(i);
                }
            }
        }
    }

    private static void addPersonInWindow(){
        for (int i = 0; i < windows.getCount() && !people.isEmpty(); i++) {
            if(!windows.isOccupied(i)){ //! отрицает любой boolean и переворачивает метод в обр сторону
                windows.addPerson(people.getFirst(), i);
            }
        }
    }
}






//вынести все настройки в отдельную сущность