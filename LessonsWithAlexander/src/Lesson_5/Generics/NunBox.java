package Lesson_5.Generics;

public class NunBox <N extends Number>{
    //Я хочу, чтобы моя коробка имела только числовые значения,
    //Поэтому generics может принимать только числовые параметры
    //Поэтому <N extends Number>, т.к. Number - родительский класс для int, double, float

    private N[] numbers;
    public NunBox(N[] numbers) { //Конструктор для массива
        this.numbers = numbers;
    }
    public double average(){
        double d = 0.0;
        for (int i = 0; i < numbers.length; i++) {
            d += i;
        }
        return d / this.numbers.length;
    }
}
