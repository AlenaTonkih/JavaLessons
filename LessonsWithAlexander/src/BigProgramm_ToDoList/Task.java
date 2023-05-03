package BigProgramm_ToDoList;

import java.util.HashMap;

public class Task {
    private Status status;
    private int ID;
    private String taskName;
    private String taskDescription;

    private Subtask subtask;
    private static int counterID = 0;

    Task(){}

    public Task(String taskName, String taskDescription) { //констурктор с описанием задачи
        this.status = Status.NEW; //потому что когда задача задается, она изначально новая
        this.ID = counterID++;
        this.taskName = taskName;
        this.taskDescription = taskDescription;
    }

    public Task(String taskName) {
        this.status = Status.NEW;
        this.ID = counterID++;
        this.taskName = taskName;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Status getStatus() {
        return status;
    }

    public int getID() {
        return ID;
    }

    public String getTaskName() {
        return taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    @Override
    public String toString() {
        return "Task{" +
                "status=" + status +
                ", ID=" + ID +
                ", taskName='" + taskName + '\'' +
                ", taskDescription='" + taskDescription + '\'' +
                '}';
    }
}
