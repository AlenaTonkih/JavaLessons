package Lesson_10;

public class Main {
    public static void main(String[] args) {
        AbstractAnimal loriCat = new Cat(); //Пример полиморфизма
        AbstractAnimal bublikDog = new Dog();

        loriCat.say();
        bublikDog.say();

        findOwner(loriCat);
        findOwner(bublikDog);

        System.out.println("Lori: " + ((Cat)loriCat).getOwner());
    }
    private static void findOwner(AbstractAnimal animal){
        if(animal.getClass() == Cat.class){
            animal.setOwner("Cat_Owner");
            //Cat someCat = (Cat)animal; //класс каст, до того как вынесли set в интерфейс
            //someCat.setOwner("Cat_Owner");
        }
        if(animal.getClass() == Dog.class){ //Если класс равен собаки, то мы установим владельца
            animal.setOwner("Dog_Owner");
            //Dog someDog = (Dog)animal;
            //someDog.setOwner("Dog_Owner");
        }
    }
}
