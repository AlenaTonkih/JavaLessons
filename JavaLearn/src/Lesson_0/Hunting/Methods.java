package Lesson_0.Hunting;

public class Methods {
    public boolean canEat(Animal animalPredator, Animal animalVictim) {
        if (animalPredator.getType() == Type.BEAR) {
            if (animalVictim.getType() == Type.FOX || animalVictim.getType() == Type.HARE) {
                return true;
            }
        } else if (animalPredator.getType() == Type.FOX) {
            if (animalVictim.getType() == Type.HARE) {
                return true;
            } else {
                return false;
            }

        } else if (animalPredator.getType() == Type.HARE) {
            System.out.println("Заяц травоядный");
        }
        return false;
    }

    public void hunting(Hunter hunter, Animal animal) {
        if (hunter.getType() == Type.HUNTER) {
            if (animal.getType() == Type.BEAR) {
                System.out.println("Охотник поймал медведя");
            } else if (animal.getType() == Type.FOX) {
                System.out.println("Охотник поймал лису");
            } else if (animal.getType() == Type.HARE) {
                System.out.println("Охотник поймал зайца");
            }
        } else {
            System.out.println("Ошибка");
        }
    }

}
