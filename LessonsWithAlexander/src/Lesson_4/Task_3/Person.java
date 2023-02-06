package Lesson_4.Task_3;

public class Person implements Hunt{
    private String name;
    private Type type;
    @Override
    public void hunt(Animal animal) {
        if(animal.getType() == Type.FOX){
            System.out.println("Охотник поймал лису");
        } else if (animal.getType() == Type.BEAR) {
            System.out.println("Охотник поймал медведя");
        } else if (animal.getType() == Type.FROG) {
            System.out.println("Охотник не охотится на это животное");
        }else {
            System.out.println("Такого животного в лесу нет");
        }
    }

    public Person(String name, Type type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }


}
