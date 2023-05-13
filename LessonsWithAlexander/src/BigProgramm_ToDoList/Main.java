package BigProgramm_ToDoList;

import BigProgramm_ToDoList.configuration.ApplicationSetting;
import BigProgramm_ToDoList.dao.InMemoryTaskDao;
import BigProgramm_ToDoList.dto.Epic;
import BigProgramm_ToDoList.dto.Status;
import BigProgramm_ToDoList.dto.Subtask;
import BigProgramm_ToDoList.dto.Task;
import BigProgramm_ToDoList.servisw.Manager;

public class Main {
    public static void main(String[] args) {
        InMemoryTaskDao inMemoryTaskDao = new InMemoryTaskDao();
        ApplicationSetting applicationSetting = new ApplicationSetting();
        Task task = new Task(Status.NEW, "в 6", "Учеба");

        applicationSetting.readFile(task);
       inMemoryTaskDao.putHashMap(5, new Task(Status.NEW, "в 6", "Учеба"));





    }
}
