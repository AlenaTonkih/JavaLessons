package Lesson_8;

public class Main {
    public static void main(String[] args) {
        Cat loriCat = new Cat("Lori", 4, "Ivan");
        SayCat sayCat = new SayCat();
        sayCat.say(loriCat, "I want to eat");

        SayCat.sayMeow();

        System.out.println(SayCat.hello);
    }
}
