package Stream_API_HW;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.OptionalInt;

public class StreamAPI {

    //1. Найти количество четных чисел в LinkedList
    public static int returnTheNumberOfEvenNumbers(LinkedList<Integer> list){
        return (int) list.stream()
                .filter(i -> i % 2 == 0)
                .count();
    }

    //2. Произвести сортировку массива
    public static int [] returnSortArray(int [] array){
        return Arrays.stream(array)
                .sorted()
                .toArray();
    }

    //3. Выводить элементы массива, пока числа четные
    public static void printElementsArray(int [] array){
        Arrays.stream(array)
                .takeWhile(i -> i % 2 == 0) //метод, получающий элементы потока пока сохраняется условие
                .forEach(System.out::println);
    }

    //4. Убрать из массива повторяющиеся элементы
    public static int [] deleteDuplicates(int [] array){
        return Arrays.stream(array)
                .distinct() //метолд, удаляющий все дубликаты в потоке
                .toArray();
    }

    //5. Вывести из массива первые 10 элементов
    public static void print10Elements(int [] arrays){
        Arrays.stream(arrays)
                .limit(10)
                .forEach(System.out::println);
    }

    //7. Найти максимальный элемент массива
    public static OptionalInt returnMax (int [] arrays){ //Спросить откуда Optional int
        return Arrays.stream(arrays)
                .max();
    }
}
