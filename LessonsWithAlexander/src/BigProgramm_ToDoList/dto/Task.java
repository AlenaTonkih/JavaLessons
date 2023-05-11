package BigProgramm_ToDoList.dto;

public class Task {
    private Status status;
    private int ID;
    private String name;
    private String description;

    private static int counterID = 0;

    Task(){}

    public Task(String taskName, String taskDescription) { //констурктор с описанием задачи
        this.status = Status.NEW; //потому что когда задача задается, она изначально новая
        this.ID = counterID++;
        this.name = taskName;
        this.description = taskDescription;
    }
    public Task(Status status, String name, String description) {
        this.status = status;
        this.name = name;
        this.description = description;
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

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Task{" +
                "status=" + status +
                ", ID=" + ID +
                ", taskName='" + name + '\'' +
                ", taskDescription='" + description + '\'' +
                '}';
    }
}
