package BigProgramm_ToDoList;

public class Main {
    public static void main(String[] args) {
        Task task = new Task("Экзамен", "А зачем нужно описание...");
        System.out.println(task);
        Task task1 = new Task("Переезд", "Переезд в Сокольники");
        System.out.println(task1);
        Task task2 = new Task("Занятие в 18.00");
        System.out.println(task2);
        task2.setStatus(Status.IN_PROGRESS);
        System.out.println(task2);

        Task task3 = new Subtask("Собрать вещи", "...");
        System.out.println(task3);

        System.out.println();

        Manager manager = new Manager();
        manager.addElement(task.getID(), task1.getTaskName());
        manager.addElement(task2.getID(), task2.getTaskName());
        System.out.println(manager.taskHashMap);

    }
}
