package Lesson_5.Generics;

public class BoxGen<T> { //В треугольных скобках указание на то, что класс содержит параметризированные типы данных
    private T obj; //Эта буква Т будет принимать к-л значение типа в тот момент, когда мы будем создавать объект
    //Важно помнить, что в момент создания объекта, буква Т заменяет на поданный тип данных
    public BoxGen(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}
class MainApp{
    public static void main(String[] args) {
        BoxGen<Integer> boxGen1 = new BoxGen<>(3);
        BoxGen<Integer> boxGen2 = new BoxGen<>(5);

        //boxGen1.setObj("String"); и теперь мы уже не можем добавить объект не типа int
        //+ мы получили доступ ко всем данным класса int
    }
}
