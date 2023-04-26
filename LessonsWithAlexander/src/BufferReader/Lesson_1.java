package BufferReader;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Lesson_1 {
    public static void main(String[] args) {
        String inputFileName = "C:\\Users\\Alena\\IdeaProjects\\LessonsWithAlexander\\src\\BufferReader\\BufferReader";
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName))){
            String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line + "\n");
            }
        }
        catch (IOException exception){
            exception.printStackTrace();
        }
    }

}
