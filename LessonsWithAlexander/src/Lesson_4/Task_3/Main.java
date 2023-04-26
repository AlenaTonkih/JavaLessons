package Lesson_4.Task_3;

public class Main {
    public static void main(String[] args) {
        Bear bear = new Bear("Миша", Type.BEAR, 5);
        Fox fox = new Fox("Алиса", Type.FOX, 2);
        Frog frog = new Frog("Гоша", Type.FROG, 3);

        //bear.hunt(fox);

        Hunter hunter = new Bear("Misha", Type.BEAR, 5);
        Hunter hunter1 = new Fox("Alisa", Type.FOX, 2);
        Hunter hunter2 = new Frog("Kwa", Type.FROG, 1);
        Hunter hunter3 = new Fox("Klawa", Type.FOX, 5);

        Hunter[] hunterArray = new Hunter[4];
        hunterArray[0] = hunter;
        hunterArray[1] = hunter1;
        hunterArray[2] = hunter2;
        hunterArray[3] = hunter3;


        for (int i = 0; i < hunterArray.length; i++) {
            hunterArray[i].hunt(bear);
        }
    }
}
//pull request