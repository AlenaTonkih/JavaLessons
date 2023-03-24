package Lesson_6.QueueSimulator;

import java.util.ArrayList;
import java.util.Arrays;

public class Table {
    //Задача: создать класс (независимый), который будет выводить табличку,
    // но при этом данные он получает не от пользователя.

    private String[] header; //массив, который хранит названия столбцов

    private ArrayList<Object[]> data = new ArrayList<>(); //массив, который хранит строки таблицы в виде массивов

    public Table(String... header) { //затем это преобразуется в массив
        this.header = header;
    }

    public static void printHeader(Table table) {
        System.out.printf(" +-----------------+-----------------+------------------+%n");
        System.out.format(" | %-15s | %-15s | %-15s  | ", table.getHeader());
        System.out.println();
        System.out.printf(" +-----------------+-----------------+------------------+%n");

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

    }

