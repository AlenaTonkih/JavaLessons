package Lesson_0.Array;

public class ArrayMethod {
    public int[] calculateAverage(int[] array) {

        //1. Вывести элементы массива, которые больше среднего арифметического
        // этого массива
        double sum = 0;
        for (int k : array) {
            sum = sum + k;
        }
        double average = sum / array.length;

        int count = 0;
        for (int j : array) {
            if (j > average) {
                count++;
            }

        }
        int index = 0;
        int[] newArray = new int[count];
        for(int k : array){
            if(k > average) {
                newArray[index] = k;
                index++;
            }
        }
        return newArray;
    }

    //5. Найти сумму цифр в числе
    public int getSumOfDigits (int number) {
        int sum = 0;

        while(number > 0) { //for - когда знаем точное кол-во повторений, while - когда не знаем.
            int currentDigit = number % 10; //нахожу остаток от деления
            sum += currentDigit;
            number /= 10;
        }
        sum += number;

        return sum;
    }
    //6. В заданном массиве поменять местами максимальный и минимальный элементы массива.
    // Если таких элементов несколько, менять местами первые вхождения этих элементов.
    public void swapMinAndMax(int[] array){
        int indexMax = 0;
        int indexMin = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[indexMax]) {
                indexMax = i;
            }
            if (array[i] < array[indexMin]) {
                indexMin = i;
            }
        }
            int temp = array[indexMin];
            array[indexMin] = array[indexMax];
            array[indexMax] = temp;
    }
    //2. Задано два числа: значение, индекс. Задан массив.
    // Необходимо вставить значение на указанный индекс.
    // Старый элемент и те, которые располагаются за ним, сдвинуть вправо
    public void insert(int[] array, int number, int index){ //сначала кладем источник данных, потом остальное
        int[] newArray = new int[array.length + 1]; //чтобы было место для нового элемента массива
        newArray[index] = number;

        for (int i = 0; i < index; i++) {
            newArray[i] = array[i]; //копирую старый массив в новый, добавляю все элементы старого массива в новый
            //либо вариант №2 через opyOf
        }
        for (int i = index; i < array.length; i++) {
            newArray[i + 1] = array[i];
        }
    }

    }


