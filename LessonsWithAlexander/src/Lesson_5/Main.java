package Lesson_5;

public class Main {
    public static void main(String[] args) {
        Month month = Month.APRIL;
        System.out.println(month.ordinal());
        System.out.println(month.name());

        System.out.println(Month.valueOf("APRIL"));
        Month.values(); //возвращает массив значений, которые есть в енум

        Month.APRIL.getNumber();
        //сб, 11.02 - 19.00

            }
}
