package BigProgramm_ToDoList.servisw;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class Setting {
    //Я не уверена, что это должно быть в этой папке, если что перенесу
    private static final String FileWithSetting = "setting.properties";
    //переменная, отвечающая за хранение имени файла с настройками

    public static Setting getSettingsFromFile(String fileName){
        Properties properties = new Properties();
        Setting setting = new Setting();
        try {
            FileInputStream fileInputStream = new FileInputStream(fileName);
            properties.load(fileInputStream); //загрузка файла в объект
            fileInputStream.close(); //закрытие файла
        }catch (IOException exception){

        }
        setting.setProperties(properties); //присваиваю настройки объекту класса Setting
        return setting;
    }

    private Properties properties;

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}

