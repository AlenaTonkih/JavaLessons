package BigProgramm_ToDoList.dto;

import java.util.ArrayList;
import java.util.List;

public class Epic extends Task {
    Subtask subtask = new Subtask();
    public Epic(String taskName, String taskDescription) {
        super(taskName, taskDescription);

    }
    Epic(){}
    private List<Subtask> listSubtasks = new ArrayList<>();

    public static Subtask substaksID(){
        Epic epic = new Epic();
        for (int i = 0; i < epic.listSubtasks.size(); i++) {
            epic.listSubtasks.add(substaksID());
        }

        return (Subtask) epic.listSubtasks;
    }

    public List<Subtask> getListSubtasks() {
        return listSubtasks;
    }

    public void setListSubtasks(List<Subtask> listSubtasks) {
        this.listSubtasks = listSubtasks;
    }
}
