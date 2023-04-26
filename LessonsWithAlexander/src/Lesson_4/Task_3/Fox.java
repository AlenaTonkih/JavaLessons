package Lesson_4.Task_3;

public class Fox extends Animal implements Hunter {
    private int countLive;
    @Override
    public void hunt(Animal animal) {
        if(animal.getType() == Type.BEAR){
            System.out.println("Лиса не охотиться на медведя");
        } else if (animal.getType() == Type.FOX) {
            System.out.println("Лиса не может охотиться на лису");
        } else if (animal.getType() == Type.FROG) ;
            System.out.println("Лиса поймала лягушку");
        }
    public Fox(String name, Type type, int countLive) {
        super(name, type, countLive);
    }
    public Fox(){

    }
}
