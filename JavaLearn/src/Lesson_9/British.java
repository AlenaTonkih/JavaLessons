package Lesson_9;

public class British extends Cat{
    private String name;

    public British(int age, String owner, String name) {
        super(age, owner);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat name: " + name + " Age: " + getAge() + " Owner: " + getOwner();
    }
}
