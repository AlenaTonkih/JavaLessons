package BigProgramm_ToDoList.dao;

import BigProgramm_ToDoList.configuration.ApplicationSetting;
import BigProgramm_ToDoList.dto.Status;
import BigProgramm_ToDoList.dto.Task;

import java.util.HashMap;

public class InMemoryTaskDao implements TaskDao{
    private int ID;
    private  HashMap<Integer, Task> hashMap;
    private InMemoryTaskDao inMemoryTaskDao;
    private ApplicationSetting applicationSetting;

    public ApplicationSetting getApplicationSetting() {
        return applicationSetting;
    }

    public InMemoryTaskDao getInMemoryTaskDao() {
        return inMemoryTaskDao;
    }
    @Override
    public long addTask(String name, String description, Status status) {
        ID++;
        return ID;
    }

    public HashMap<Integer, Task> createHashMap(){
       hashMap = new HashMap<>();
        return hashMap;
    }
    public void putHashMap(int x, Task task){
        System.out.println(hashMap.put(x, task));
    }


    public HashMap<Integer, Task> getHashMap() {
        return hashMap;
    }

    public void setHashMap(HashMap<Integer, Task> hashMap) {
        this.hashMap = hashMap;
    }

    public int getID() {
        return ID;
    }
}
