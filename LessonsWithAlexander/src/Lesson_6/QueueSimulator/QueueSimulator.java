package Lesson_6.QueueSimulator;

import java.util.ArrayList;

public class QueueSimulator {
    public static void simulate(){
        SomeQueue <Person> someQueue = new SomeQueue <>();
        Windows windows = new Windows(3);

        while (true){
            if(Probability.needToGeneratePerson()){
                PersonGenerator personGenerator = new PersonGenerator();
                someQueue.add(personGenerator.getRandomPerson());
                while (!someQueue.isEmpty()){
                    someQueue.returnElement();
                    if(windows.findWindowFree() != -1){

                    }
                }

            }
        }


    }
}
//вынести все настройки в отдельную сущность