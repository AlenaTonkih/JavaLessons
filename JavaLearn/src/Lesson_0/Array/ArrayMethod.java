package Lesson_0.Array;

import java.util.Arrays;

public class ArrayMethod {
    public void returnAverage(int[] inputArray) {

        //1. Вывести элементы массива, которые больше среднего арифметического
        // этого массива
        double sum = 0;
        for (int i = 0; i < inputArray.length; i++) {
            sum = sum + inputArray[i];
        }
        double average = sum / inputArray.length;

        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] > average) {
                System.out.print(inputArray[i] + " ");
            }
        }
    }

    //5. Найти сумму цифр в числе
    public int sum (int inputInt) {
        int sum = 0;
        int currentDigit;

        for (int i = 0; i <= 3; i++) {
            currentDigit = inputInt % 10; //нахожу остаток от деления
            sum = sum + currentDigit;
            inputInt = inputInt / 10;
        }
        sum = sum + inputInt;

        return sum;
    }
    //6. В заданном массиве поменять местами максимальный и минимальный элементы массива.
    // Если таких элементов несколько, менять местами первые вхождения этих элементов.
    public void minAndMax(int[] inputArray){
        int indexMax = 0;
        int indexMin = 0;

        for (int i = 0; i < inputArray.length; i++) {
            if(inputArray[i] > inputArray[indexMax]){
                indexMax = i;
            }
            if(inputArray[i] < inputArray[indexMin]){
                indexMin = i;
            }
            int temp = inputArray[indexMin];
            inputArray[indexMin] = inputArray[indexMax];
            inputArray[indexMax] = temp;
        }
        System.out.println(Arrays.toString(inputArray));
    }
    //2. Задано два числа: значение, индекс. Задан массив.
    // Необходимо вставить значение на указанный индекс.
    // Старый элемент и те, которые располагаются за ним, сдвинуть вправо
    public void array(int number, int index, int[] inputArray){
        int[] newArray = new int[inputArray.length + 1]; //чтобы было место для нового элемента массива
        newArray[index] = number;

        for (int i = 0; i < index; i++) {
            newArray[i] = inputArray[i]; //копирую старый массив в новый, добавляю все элементы старого массива в новый
            //либо вариант №2 через opyOf
        }
        for (int i = index; i < inputArray.length; i++) {
            newArray[i + 1] = inputArray[i];
        }
        System.out.println(Arrays.toString(newArray));
        }

    }


