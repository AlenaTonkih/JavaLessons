package Lesson_3;

public class Main {
    public static void main(String[] args) {
        f1(10);
    }
    public static void f1(int i) throws ArithmeticException{
        if(i == 10){
            throw new TenException("Введено число 10");
        }
    }
    //сл: в сб, в 10.00
}
