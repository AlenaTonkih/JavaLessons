package Lesson_6.QueueSimulator;

import java.util.ArrayList;

public class SomeQueue<T> implements Queue <T>{ //я не придумала нормальное название для класса
    private ArrayList<T> list = new ArrayList<T>();

    @Override
    public void add(T item) {
        list.add(item); //Добавила элемент в очередь (в ArrayList)

    }

    @Override
    public T returnElement() { //сделать гет элемент
        return list.remove(0); //ф-ция remove достает элемент из начала списка и удаляет
        //а после возвращает, чтобы можно было его еще где-то использовать
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty(); //метод возвращает истину, если список пуст, ну или false, если наш список не пустой
    }

}
