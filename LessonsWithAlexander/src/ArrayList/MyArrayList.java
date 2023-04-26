package ArrayList;

import java.util.ArrayList;
import java.util.function.Predicate;

public class MyArrayList<T> extends ArrayList<T> {
    public ArrayList<T> filter(Predicate<T> predicate) {
        ArrayList<T> result = new ArrayList<>();
        for (T i : this) { //С помощью цикла forEach пробегаюсь по еще не созданному Array List с типом данных T при помощи ключевого слова this.
            predicate.test(i);
            if (predicate.test(i)) {
                result.add(i);
            }
        }
        return result;
    }

    @Override
    public boolean add(T t) { //метод показывающий строку, что элемент добавлен
        boolean result = super.add(t);
        if(result){
            System.out.println("Эемент " + t + " добавлен");
        }
        else {
            System.out.println("Эемент " + t + " не добавлен");
        }
        return result;
    }
}
