package Lesson_6.QueueSimulator;

public class Probability {
    public static boolean needToGeneratePerson() {
        return needToDo(60);
    }
    public static boolean needToReleaseFreeWindow(){
        return needToDo(90);
    }
    private static boolean needToDo(int probability){
        int min = 0;
        int max = 100;
        int random = min + (int) (Math.random() * max);
        return random <= probability;
    }
}

