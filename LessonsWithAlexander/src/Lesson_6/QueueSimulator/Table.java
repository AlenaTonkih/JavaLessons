package Lesson_6.QueueSimulator;

import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.String.format;

public class Table {
    //Задача: создать класс (независимый), который будет выводить табличку,
    // но при этом данные он получает не от пользователя.
    private String[] header; //массив, который хранит названия столбцов

    private ArrayList<Object[]> data = new ArrayList<>(); //массив, который хранит строки таблицы в виде массивов

    public Table(String... header) { //затем это преобразуется в массив
        this.header = header;
    }

    public static void printHeader(Table table) { //Перенести в toString
        System.out.printf(" +-----------------+-----------------+------------------+%n");
        System.out.format(" | %-15s | %-15s | %-15s  | ", table.getHeader());
        System.out.println();
        System.out.printf(" +-----------------+-----------------+------------------+%n");

    }
    public static void displayTable(){
        Table table1 = new Table();
        for (int i = 0; i < table1.getData().size(); i++) { //сначала я пробегаюсь по аррай листу и нахожу первый массив
            for (int j = 0; j < table1.getData().get(i).length; j++) { //затем уже пробегаюсь по найденному массиву, где лежат строки
                System.out.format(" |%-15s ", table1.getData().get(i)[j]);
            }
            System.out.println();
            System.out.printf(" +-----------------+-----------------+------------------+%n");

        }
    }

    public void addLine(Object... line) { //кинуть исключение, если кол-во не равно хедеру
        data.add(line);
    }
    public String[] getHeader() {
        return header;
    }

    public ArrayList<Object[]> getData() {
        return data;
    }

    public static String toString(Table table) {
        return " +-----------------+-----------------+------------------+%n" +
               format(" | %-15s | %-15s | %-15s  | "+ table.getHeader() + " %n") +
        " +-----------------+-----------------+------------------+%n";

    }
}

