package Lesson_5.Generics.Array;

public class BoxWithNumbers <N extends Number>{
        //Теперь наша коробка может принимать только int, double и т.д
        private N [] array; //Создали массив

        public BoxWithNumbers(N... array) {
            this.array = array;
        }

        public N[] getArray() {
            return array;
        }

        public void setArray(N[] array) {
        this.array = array;
    }

    public double average(){ //метод, возвращающий ср.арифметическое элементов массива
        double avg = 0.0; //переменная, в которой будем хранить ср.арифметическое
        for (int i = 0; i < array.length; i++) {
            avg += array[i].doubleValue(); //метод doubleValue() преобразует значение в тип double
        }
        avg /= array.length; //делю сумму значений элементов массива на кол-во элементов
        return avg;
    }

}
