package Lesson_7.ArrayList;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();
        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }

        LinkedList<String> myLinkedList = new LinkedList<String>();
        myLinkedList.add("apple");
        myLinkedList.add("banana");
        myLinkedList.add("cherry");
        myLinkedList.add("date");


        System.out.println(Lmd.filter(arrayList, i -> i % 2 == 0));

    }

}
