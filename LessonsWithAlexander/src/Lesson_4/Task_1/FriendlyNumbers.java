package Lesson_4.Task_1;

public class FriendlyNumbers {
    // Задача: найти пары дружественных чисел
    //Посчитать кол-во времени, требующегося на выполнение кода до оптимизации и после оптимизации и высчитать кол-во операций до оптимизаций и после
    int iterationCountAfter = 0;
    int iterationCountBefore = 0;

    double timeAfter;
    double timeBefore;
    public boolean areFriendlyNumbersAfter(int num1, int num2) { //при boolean название отвечает на вопрос является ли
        int sumNum1 = 0;
        int sumNum2 = 0;
        for (int i = 1; i <= num1 / 2; i++) {
            if (num1 % i == 0) {
                sumNum1 += i;
            }
        }
        for (int i = 1; i <= num2 / 2; i++) {
            if (num2 % i == 0) {
                sumNum2 += i;
            }
        }
        return ((sumNum1 == num2) && (sumNum2 == num1));
    }

    public void printFriendlyNumbersAfter(int maxValue) {
        Timer timer = new Timer();
        timer.start();
        for (int i = 1; i <= maxValue; i++) {
            for (int j = i + 1; j <= maxValue; j++) {
                iterationCountAfter++;
                if (areFriendlyNumbersAfter(i, j)) {
                    System.out.println("Дружественные пары чисел: " + i + " " + j);
                }

            }
        }
        timer.stop();
        timeAfter = timer.getTime(Units.SECONDS);
        System.out.println();
        System.out.println("Время работы после оптимизации: " + timeAfter);
        System.out.println("Количество итераций после оптимизации: " + iterationCountAfter);
    }

    public boolean areFriendlyNumbersBefore(int num1, int num2) {
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
        return ((sumNum1 == num2) && (sumNum2 == num1));
    }

    public void printFriendlyNumbersBefore(int maxValue) {
        Timer timer = new Timer();
        timer.start();
        for (int i = 1; i <= maxValue; i++) {
            for (int j = 1; j <= maxValue; j++) {
                iterationCountBefore++;
                if (areFriendlyNumbersAfter(i, j)) {
                    if ((i != j) && (i < j)) {
                        System.out.println("Дружественные пары чисел: " + i + " " + j);
                    }
                }
            }
        }
        timer.stop();
        System.out.println();
        timeBefore = timer.getTime(Units.SECONDS);
        System.out.println("Время работы до оптимизации: " + timeBefore);
        System.out.println("Количество итераций до оптимизации: " + iterationCountBefore);
    }
    public void calculateIterationDifference(){
       int difference =  iterationCountBefore - iterationCountAfter;
        System.out.println("До оптимизации программа выполняет итераций на " + difference + " больше, чем после");
    }
    public void calculateTimeDifference(){
        double timeDifference = timeBefore - timeAfter;
        System.out.println("До оптимизации программа тратит на " + timeDifference + " секунд больше, чем после");
    }
}
