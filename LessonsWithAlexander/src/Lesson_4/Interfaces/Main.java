package Lesson_4.Interfaces;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Person person = new Person();
        person.drive(car);
        person.stop();
    }
}
