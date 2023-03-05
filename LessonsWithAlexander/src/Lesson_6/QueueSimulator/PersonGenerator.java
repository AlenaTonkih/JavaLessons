package Lesson_6.QueueSimulator;

public class PersonGenerator {
    String[] names = {"Alex", "Ivan", "Elena", "Olga", "Oleg"};
    String[] lastNames = {"Petrov", "Ivanov", "Andreev", "Demenko", "Alexseev"};


    private int getRandomInt(int min, int max) {
        int range = (max - min) + 1;

        return (int)(Math.random() * range) + min;
    }
    public Person getRandomPerson(){
        int indexName = getRandomInt(0, names.length - 1);
        int indexLastName = getRandomInt(0, lastNames.length - 1);

        String name = names[indexName];
        String lastname = lastNames[indexLastName];

        return new Person(name, lastname);
    }
}
