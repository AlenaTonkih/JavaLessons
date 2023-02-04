package Lesson_4.Task_1;

public class Main {
    public static void main(String[] args) {
        FriendlyNumbers friendlyNumbers = new FriendlyNumbers();

        System.out.println("Пары дружественных чисел до оптимизации + расчет времени и итераций: ");
        friendlyNumbers.printFriendlyNumbersBefore(5000);
        System.out.println();
        System.out.println("Пары дружественных чисел после оптимизации + расчет времени и итераций: ");
        friendlyNumbers.printFriendlyNumbersAfter(5000);
        System.out.println();
        friendlyNumbers.calculateIterationDifference();
        System.out.println();
        friendlyNumbers.calculateTimeDifference();
    }
}
