package Lesson_4.Task_3;

public class Animal {
    private String name;
    private Type type;

    public Animal(String name, Type type, int age) {
        this.name = name;
        this.type = type;
    }

    public Animal() {
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
