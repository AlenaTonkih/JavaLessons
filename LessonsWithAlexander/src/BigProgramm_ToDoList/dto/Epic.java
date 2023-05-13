package BigProgramm_ToDoList.dto;

import java.util.ArrayList;
import java.util.List;

public class Epic extends Task {
    private List<Subtask> subtasks = new ArrayList<>();

    public Epic(String taskName, String taskDescription) {
        super(taskName, taskDescription);
    }
    public Epic(){}

    public void addSubtask(Subtask subtask){
        subtasks.add(subtask);
    }

    public List<Subtask> getSubtasks() {
        return subtasks;
    }


}
