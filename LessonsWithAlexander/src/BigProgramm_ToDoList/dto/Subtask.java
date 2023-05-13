package BigProgramm_ToDoList.dto;

public class Subtask extends Task {
    private Epic epic;

    public Subtask(Status status, String name, String description, Epic epic) {
        super(status, name, description);
        this.epic = epic;
    }
    public Subtask(Epic epic) {
    }

    public Epic getEpic() {
        return epic;
    }

}
