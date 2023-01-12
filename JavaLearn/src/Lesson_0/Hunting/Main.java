package Lesson_0.Hunting;

public class Main {
    //Реализовать сущности для симуляции жизни животных. Необходимо создать зайца,
    // лису, медведя и наделить их какими-то характеристиками,
    // а также обязательно создать метод boolean canEat, который будет принимать другое животное
    // и возвращать ответ, может ли текущее животное съесть переданное (придумать, кто кого ест).
    // Необходимо создать охотника, который будет охотиться на животных.
    // Учесть, что в дальнейшем могут быть добавлены другие сущности в виде животных и людей.
    // Животные едят только животных. Люди охотятся только на животных
    public static void main(String[] args) {
        Animal bear = new Bear(Type.BEAR);
        Animal fox = new Fox(Type.FOX);
        Animal hare = new Hare(Type.HARE);

        Hunter hunter = new Hunter("Ivan", Type.HUNTER);

        Methods methods = new Methods();

        System.out.println(methods.canEat(bear, fox));
        System.out.println(methods.canEat(hare, fox));

        methods.hunting(hunter, fox);
    }
}
