package Lesson_5.Generics;

public class GenBox <T, M>{
    T obj;
    M obj2;

    public GenBox(T obj, M obj2) {
        this.obj = obj;
        this.obj2 = obj2;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public M getObj2() {
        return obj2;
    }

    public void setObj2(M obj2) {
        this.obj2 = obj2;
    }
}
