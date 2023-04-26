package Lesson_7.ArrayList;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Lmd {
    public static ArrayList<Integer> filter(ArrayList<Integer> inputArray, Predicate<Integer> predicate){
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer i : inputArray) {
            if(predicate.test(i)){
                result.add(i);
            }
        }
        return result;
    }
}
