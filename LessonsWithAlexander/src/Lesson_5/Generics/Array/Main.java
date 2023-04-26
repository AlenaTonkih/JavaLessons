package Lesson_5.Generics.Array;

public class Main {
    public static void main(String[] args) {
        BoxWithNumbers<Integer> boxWithNumbers = new BoxWithNumbers<>(5, 9, 12);
        System.out.println(boxWithNumbers.average());
    }
}
