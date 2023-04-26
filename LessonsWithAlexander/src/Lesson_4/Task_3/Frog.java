package Lesson_4.Task_3;

public class Frog extends Animal implements Hunter {
    private int countLive = 3;

    @Override
    public void hunt(Animal animal) {
        if(animal.getType() == Type.FOX || animal.getType() == Type.BEAR || animal.getType() == Type.FROG){
            System.out.println("Лягушка травоядная");
        }

    }
    public Frog(String name, Type type, int live) {
        super(name, type, live);
    }
    public Frog(){

    }

    public int getCountLive() {
        return countLive;
    }

    public void setCountLive(int countLive) {
        this.countLive = countLive;
    }
}
