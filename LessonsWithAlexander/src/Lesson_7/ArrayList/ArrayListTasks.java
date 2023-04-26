package Lesson_7.ArrayList;
import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListTasks {

    //1. Напишите программу на Java, чтобы добавить указанный элемент в конец связанного списка.
    public static ArrayList<Integer> getLastElementOfArrayList(ArrayList<Integer> inputArray) {
        inputArray.add(7);
        return inputArray;
    }

    //4. Напишите Java-программу для итерации связанного списка в обратном порядке.
    public static void returnArrayList(ArrayList<Integer> inputArray) {
        for (int i = inputArray.size() - 1; i >= 0; i--) {
            System.out.println(inputArray.get(i));
        }

    }

    //5. Напишите Java-программу для вставки указанного элемента в указанную позицию в связанном списке.
    public static LinkedList<String> setElementInLinkedList(LinkedList<String> inputLinkedList) {
        inputLinkedList.add(2, "elderberry");
        return inputLinkedList;
    }

    //6. Напишите программу на Java для вставки элементов в связанный список в первой и последней позиции.
    public static LinkedList<String> setElementsInLinkedList(LinkedList<String> inputLinkedList) {
        inputLinkedList.addFirst("First");
        inputLinkedList.addLast("Last");
        return inputLinkedList;
    }

    //10. Напишите программу на Java, чтобы получить первое и последнее вхождение указанных элементов в связанный список.
    public static void getFirstAndLastElement(LinkedList<String> inputLinkedList) {
        String first = inputLinkedList.getFirst();
        String last = inputLinkedList.getLast();
        System.out.println("First element: " + first);
        System.out.println("Last element: " + last);
    }

    //11. Напишите Java-программу для отображения элементов и их позиций в связанном списке.
    public static void getElementAndItsNumberInTheList(LinkedList<String> inputLinkedList) {
        for (int i = 0; i < inputLinkedList.size(); i++) {
            System.out.println("Element position number: " + i + ", Element: " + inputLinkedList.get(i));
        }
    }

    //12. Напишите Java-программу для удаления указанного элемента из связанного списка.
    public static void deleteElement(LinkedList<String> inputLinkedList) {
        inputLinkedList.remove(1);
        System.out.println(inputLinkedList);
    }

    //13. Напишите программу на Java для удаления первого и последнего элемента из связанного списка.
    public static void deleteFirstAndLastElement(LinkedList<String> inputLinkedList) {
        inputLinkedList.remove(inputLinkedList.getFirst());
        inputLinkedList.remove(inputLinkedList.getLast());
        System.out.println(inputLinkedList);
    }

    //14. Напишите программу на Java, чтобы удалить все элементы из связанного списка.
    public static void deleteAllElements(LinkedList<String> inputLinkedList) {
        inputLinkedList.clear();
        System.out.println(inputLinkedList);
    }

    //15. Напишите программу на Java, которая поменяет два элемента в связанном списке.
    public static void replaceElementsInTheList(LinkedList<String> inputLinkedList) {
        System.out.println("Original LinkedList: " + inputLinkedList);

        String temp = inputLinkedList.get(1);
        inputLinkedList.set(1, inputLinkedList.get(3));
        inputLinkedList.set(3, temp);

        System.out.println("Updated LinkedList: " + inputLinkedList);
    }
}