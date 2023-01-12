package Lesson_0.Array;

public class Main {
    public static void main(String[] args) {
        ArrayMethod newArray = new ArrayMethod();

        newArray.returnAverage(new int [] {2, 5, 7, 12, 3});
        System.out.println();
        System.out.println(newArray.sum(346));
        System.out.println();
        newArray.minAndMax(new int [] {2, 5, 7, 12});
        newArray.array(9, 3,new int [] {2, 5, 7, 12, 3});
    }
}
