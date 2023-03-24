package Lesson_6.QueueSimulator;
public class Main {
    public static void main(String[] args) {
        Windows windows = new Windows(4);
        Table table = new Table("Name", "Window", "Time");
        Table.printHeader(table);
        QueueSimulator.simulate();

    }
}

