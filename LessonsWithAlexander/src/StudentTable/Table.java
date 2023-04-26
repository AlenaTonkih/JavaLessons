package StudentTable;

import java.util.ArrayList;

public class Table {
    private String[] header; //массив, который хранит названия столбцов

    private static ArrayList<String[]> data = new ArrayList<>(); //массив, который хранит строки таблицы в виде массивов

    public Table(String... header) { //затем это преобразуется в массив
        this.header = header;
    }

    public static void printHeader(Lesson_6.QueueSimulator.Table table) {
        System.out.printf(" +-----------------+--------+--------------------+%n");
        System.out.format(" | %-15s | %-5s | %-17s  | ", table.getHeader());
        System.out.println();
        System.out.printf(" +-----------------+--------+--------------------+%n");
    }

    //public void addLine(Object... line) { //кинуть исключение, если кол-во не равно хедеру
    //data.add(line);
    //}
    public void addLine (String ...line){
        data.add(line);
    }

    public static void printTable() {
        for (int i = 0; i < data.size(); i++) {
            System.out.println(data.get(i).toString());
        }
    }

    public String[] getHeader() {
        return header;
    }

    //public static ArrayList<Object[]> getData() {
    //return data;
    //}


    public static ArrayList<String[]> getData() {
        return data;
    }
}

