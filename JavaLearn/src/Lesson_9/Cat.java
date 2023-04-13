package Lesson_9;

public class Cat {
    private int age;
    private String owner;

    public void sayMeow(){
        System.out.println("Meow");
    }

    public Cat(int age, String owner) {
        this.age = age;
        this.owner = owner;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", owner='" + owner + '\'' +
                '}';
    }
}
