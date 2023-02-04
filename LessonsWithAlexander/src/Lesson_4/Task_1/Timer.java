package Lesson_4.Task_1;

import static Lesson_4.Task_1.Units.MILLISECONDS;
import static Time.Task_3.Units.SECONDS;

public class Timer {
   private long start;
    private long stop;

    public void start(){
        start = System.currentTimeMillis(); //точка начала работы таймера
    }
    public void stop(){
        stop = System.currentTimeMillis(); //точка завершения работы таймера
    }
    public double getTime(Units units) { //служебный метод, считающий потраченное время
        double difference = 0; //переменная, где мы будем хранить то, сколько времени прошло от старта программы до финиша

        switch(units){
            case MILLISECONDS: //если пользователь хочет получить результат в миллисекундах, то
            difference = (stop - start); //просто вычетаю
                break;
         case SECONDS: //если пользователь хочет получить результат в секундах, то
            difference = ((stop - start) / 1000.0); //вычетаю и делю на 1000.0 (чтобы получилось дробное число)
            break;
        }
        return difference; //возращаю потраченное в ремя, в секундах или миллисекундах в зависимости от желания пользователя
    }

    public long getStart() { //Геттер
        return start;
    } //Геттер

    public long getStop() { //Геттер
        return stop;
    }
}
