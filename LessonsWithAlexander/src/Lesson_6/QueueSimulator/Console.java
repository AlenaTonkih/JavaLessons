package Lesson_6.QueueSimulator;

import Lesson_4.Task_1.Units;

public class Console {
    static Table table = new Table();
    public static void displayingOnTheScreen() {
        Timer timer = new Timer();
        timer.start();
        for (int j = 1; j < QueueSimulator.getWindows().getCount() && !QueueSimulator.getPeople().isEmpty(); j++) {
            if (!QueueSimulator.getWindows().isOccupied(j)) {
                QueueSimulator.getWindows().addPerson(QueueSimulator.getPeople().getFirst(), j);
                timer.stop();
            }
            for (int i = 0; i < QueueSimulator.getWindows().getWindows().length; i++) {
                if (QueueSimulator.getWindows().getWindows()[i] != null) {
                    table.addLine(QueueSimulator.getWindows().getWindows()[i], j, timer.getTime(Units.MILLISECONDS) * -1);

                }
            }
        }

    }
    public static void displayTable() {
        for (int i = 0; i < table.getData().size(); i++) { //сначала я пробегаюсь по аррай листу и нахожу первый массив
            for (int j = 0; j < table.getData().get(i).length; j++) { //затем уже пробегаюсь по найденному массиву, где лежат строки
                System.out.format(" |%-15s ", table.getData().get(i)[j]);
            }
            System.out.println();
            System.out.printf(" +-----------------+-----------------+------------------+%n");

        }
    }
}





