package Lesson_6.QueueSimulator;
import java.io.*;
import java.util.ArrayList;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Main {
    public static void main(String[] args) {
        Windows windows = new Windows(4);
        System.out.printf(" +-----------------+-------+%n");
        System.out.printf(" | ТАБЛИЦА ЛЮДЕЙ В ОЧЕРЕДИ |     %n");
        System.out.printf(" +-----------------+-------+%n");
        System.out.format(" | %-15s | %-5s | ", "Имя и Фамилия", "Окно");
        System.out.println();
        System.out.printf(" +-----------------+-------+%n");
        QueueSimulator.simulate();
        System.out.printf("-------------------------------------%n");


    }
}

