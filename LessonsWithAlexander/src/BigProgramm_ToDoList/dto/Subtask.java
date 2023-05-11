package BigProgramm_ToDoList.dto;

public class Subtask extends Task {
    private Epic epic;
    public Subtask(String taskName, String taskDescription) {
        super(taskName, taskDescription);
    }

    public Subtask() {

    }
}
