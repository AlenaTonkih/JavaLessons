package Lesson_0.Array;

public class Main {
    public static void main(String[] args) {
        ArrayMethod newArray = new ArrayMethod();

        newArray.calculateAverage(new int [] {2, 5, 7, 12, 3});
        System.out.println();
        System.out.println(newArray.getSumOfDigits(346));
        System.out.println();
        newArray.swapMinAndMax(new int [] {2, 5, 7, 12});
        newArray.insert(new int [] {2, 5, 7, 12, 3}, 5, 1);
    }
}
