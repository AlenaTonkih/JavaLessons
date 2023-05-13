package BigProgramm_ToDoList.dao;

import BigProgramm_ToDoList.dto.Status;

public interface TaskDao {
    long addTask(String name, String description, Status status);
}
