package Lesson_6.QueueSimulator;

public class QueueSimulator {
    public static void simulate() {
        SomeQueue<Person> someQueue = new SomeQueue<>();
        Windows windows = new Windows(3);
        PersonGenerator personGenerator = new PersonGenerator();

        while (true) {
            if (Probability.needToGeneratePerson()) {
                someQueue.add(personGenerator.getRandomPerson());
            }
            for (int i = 0; i < 3; i++) {
                if (windows.isOccupied(i)) {
                    if (Probability.needToGenerateFreeWindow()) {
                        windows.freeWindow(i);
                        for (int j = 0; j < someQueue.getList().size(); j++) {
                            windows.addPerson(someQueue.getList().get(j), i);
                        }
                    }
                }
            }
        }
    }

}






//вынести все настройки в отдельную сущность