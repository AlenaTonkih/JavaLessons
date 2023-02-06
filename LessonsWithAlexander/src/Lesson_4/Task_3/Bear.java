package Lesson_4.Task_3;

public class Bear extends Animal implements Hunt{

    @Override
    public void hunt(Animal animal) {
        if (animal.getType() == Type.FOX) {
            System.out.println("Медведь поймал лису");
        } else if (animal.getType() == Type.FROG) {
            System.out.println("Медведь не может охотится на лягушку");
        } else if (animal.getType() == Type.BEAR) {
            System.out.println("Медведь не может охотится на медведя");
        }
    }
    public Bear(){

    }
    public Bear(String name, Type type, int age) {
        super(name, type, age);
    }

}
