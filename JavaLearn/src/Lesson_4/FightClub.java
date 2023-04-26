package Lesson_4;

public class FightClub {

    public String fightClub(Cat firstCat, Cat secondCat){
        if(firstCat.getAge() > secondCat.getAge()){
            return firstCat.getName();
        }
        else {
            return secondCat.getName();
        }

    }
}
