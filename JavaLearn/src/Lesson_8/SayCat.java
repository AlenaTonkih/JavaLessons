package Lesson_8;

public class SayCat {
    public static String hello = "Hello from static";
    public void say(Cat cat, String message){
        String catName = cat.getName();
        System.out.println(contactNameAndMessage(catName, message));
    }
    private String contactNameAndMessage(String catName, String message){ //Этот метод не должен быть доступен пользователю, ему достаточно доступа только к 1ому методу
        return catName + ": " + message;
    }
    public static void sayMeow(){
        System.out.println("Meow");
    }
}
