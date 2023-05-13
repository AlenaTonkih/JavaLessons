package BigProgramm_ToDoList.configuration;

import BigProgramm_ToDoList.dao.InMemoryTaskDao;
import BigProgramm_ToDoList.dto.Task;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

public class ApplicationSetting {
    private InMemoryTaskDao inMemoryTaskDao;

    public InMemoryTaskDao getInMemoryTaskDao() {
        return inMemoryTaskDao;
    }

    public void readFile(Task task) {
        String line = null;
        BufferedReader bufferedReader;
        boolean boolean1;

        try {
            bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Alena\\Desktop\\StorageType.txt"));
            while ((line = bufferedReader.readLine()) != null) {
                if (line.equals("HashMap")) {
                    //здесь я хотела вызывать метод из InMemoryTaskDao, создающий HashMap, но я запуталась как это сделать...
                    inMemoryTaskDao.createHashMap();
                }
            }
            bufferedReader.close();
        } catch (Exception exception) {

        }
    }
}
