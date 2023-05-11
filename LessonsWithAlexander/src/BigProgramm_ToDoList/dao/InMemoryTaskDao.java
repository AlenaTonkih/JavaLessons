package BigProgramm_ToDoList.dao;

import BigProgramm_ToDoList.dto.Status;

public class InMemoryTaskDao implements TaskDao{
    private int ID;
    @Override
    public long addTask(String name, String description, Status status) {
        ID++;
        return ID;
    }
}
