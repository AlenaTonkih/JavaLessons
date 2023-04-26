package Lesson_6.QueueSimulator;

public interface Queue <T> {
    //Логика очереди -> кто первый пришел, тот первый ушел и так далее
    //+ добавлять элементы можно только в конец очереди, а извлекать из начала

    void add(T item); //метод, добавляющий неопределенный элемент в начало очереди
    T getFirst(); //метод, возвращающий неопределенный элемент из начала очереди
    boolean isEmpty(); //метод, возвращающий true, если очередь пустая и false, если наоборот
}
