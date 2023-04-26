package Lesson_4;

class Figure {
    public static void main(String[] args) {
        Kvadrat kvadrat = new Kvadrat();
        kvadrat.perimetr();
        kvadrat.ploshad();
    }
}
abstract class FigureAbstract{
    int count;
    abstract void perimetr();
    abstract void ploshad();
}
class Kvadrat extends FigureAbstract{
    int storona = 10;
    @Override
    public void perimetr() {
        System.out.println("Периметр квадрата равен: " + storona * 4);
    }
    @Override
    public void ploshad() {
        System.out.println("Площадь квадрата равна: " + storona * storona);
    }
}
abstract class Krug extends FigureAbstract{ //класс абстрактный, поэтому без переопределения методов ошибки компиляции нет
    void def(){
        System.out.println("Это круг");
    }
        }
