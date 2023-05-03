package BigProgramm_ToDoList;

import java.util.HashMap;


public class Manager {
    private Task task = new Task();
   HashMap<Integer, String> taskHashMap = new HashMap();
   public void addElement(int ID, String name){
       taskHashMap.put(task.getID(), task.getTaskName());
   }
   public void deleteElement(int ID){
       taskHashMap.remove(task.getID());
   }

    public Task getTask() {
        return task;
    }
}