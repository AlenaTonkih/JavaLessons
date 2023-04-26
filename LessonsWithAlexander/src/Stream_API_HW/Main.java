package Stream_API_HW;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();

        for (int i = 0; i <= 20; i++) {
            list.add(i);
        }

        System.out.println(StreamAPI.returnTheNumberOfEvenNumbers((LinkedList<Integer>) list));
        System.out.println();
        int[] array = {1, 7, 2, 9, 3, 8, 9, 5, 9, 10, 5, 3, 8};
        int [] sortedArray = StreamAPI.returnSortArray(array);
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.println(sortedArray[i] + " ");
        }
        System.out.println();

        int[] array2 = {2, 4, 6, 8, 3, 9};
        StreamAPI.printElementsArray(array2);

        System.out.println();
        StreamAPI.print10Elements(array);

        System.out.println();
        System.out.println(StreamAPI.returnMax(array));


    }
}
