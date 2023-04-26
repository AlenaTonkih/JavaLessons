package Lesson_4.Interfaces;

class Skateboard implements Transport {

    @Override
    public void start() {
        System.out.println("Скейт поехал");
    }

    @Override
    public void stop() {
        System.out.println("Скейт остановился");
    }
}
