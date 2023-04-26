package Lesson_4;

public class Main {
    public static void main(String[] args) {
        Cat bobCat = new Cat();
        bobCat.setAge(5);
        bobCat.setName("Bob");

        Cat peterCat = new Cat();
        peterCat.setName("Peter");
        peterCat.setAge(3);

        FightClub fightClub = new FightClub();
        System.out.println("Winner: " + fightClub.fightClub(bobCat, peterCat));
    }
}
