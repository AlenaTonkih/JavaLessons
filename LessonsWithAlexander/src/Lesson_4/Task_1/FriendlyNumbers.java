package Lesson_4.Task_1;

public class FriendlyNumbers {
    // Задача: найти пары дружественных чисел
    public void checkFriendlyNumbers(int num1, int num2) {
        int sumNum1 = 0;
        int sumNum2 = 0;

        for (int i = 1; i < num1; i++) {
            if (num1 % i == 0) {
                sumNum1 += i;
            }
        }
        for (int i = 1; i < num2; i++) {
            if (num2 % i == 0) {
                sumNum2 += i;
            }
        }
        if ((sumNum1 == num2) && (sumNum2 == num1)) {
            System.out.println("Эти пары чисел являются дружественными: " + num1 + " " + num2);
        } else {
            System.out.println("Эти пары чисел не являются дружественными :(");
        }

    }
}