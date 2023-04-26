package Lesson_5.Generics;

public class Box {
    private Object object;
    public Box(Object object) {
        this.object = object;
    }
    public Object getObject() {
        return object;
    }
    public void setObject(Object object) {
        this.object = object;
    }
}
class Main{
    public static void main(String[] args) {
        Box box = new Box(50);
        Box box2 = new Box("Box");

        //У нас получилось создать коробку и положить туда, как целые числа, так и строки
        //Но если этих коробок у нас будет 500 - мы запутаемся и забудем

        //Или мы можем постоянно проверять
        if(box.getObject() instanceof Integer && box2.getObject() instanceof Integer){
            int result = (Integer)box.getObject() + (Integer)box2.getObject();
            System.out.println(result);
        }
        //Что мы сделали? Мы сделали проверку: если box1 = int, box2 = int,
        //то мы складываем значения объектов
        //также мы должны сделать класс каст (принудительное преобразование к типу int,
        //потому что сейчас у нас в классе лежит тип данных Object
    }
}
