package Lesson_6.QueueSimulator;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        testQueue();
    }
    private static void testQueue(){
        SomeQueue<Integer> queue = new SomeQueue<>();
        System.out.println("В таком порядке я положила элементы в очередь:");
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            queue.add(i);
        }
        System.out.println();

        System.out.println("А в таком порядке я эти элементы вытащила: ");
        while (!queue.isEmpty()){
            System.out.println(queue.returnElement());
        }
    }
}
