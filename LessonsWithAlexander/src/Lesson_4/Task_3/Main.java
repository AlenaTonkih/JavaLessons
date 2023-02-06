package Lesson_4.Task_3;

public class Main {
    public static void main(String[] args) {
        Bear bear = new Bear("Миша", Type.BEAR, 5);
        Fox fox = new Fox("Алиса", Type.FOX, 2);
        Frog frog = new Frog("Гоша", Type.FROG, 3);

        bear.hunt(fox);

    }
}
