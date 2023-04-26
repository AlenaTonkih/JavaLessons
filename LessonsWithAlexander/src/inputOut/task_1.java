package inputOut;
import java.io.PrintStream;

public class task_1 {
    public static void main(String[] args) {
        String text = "Привет!";
        //без обработки исключения не получиться работать с файлами
        try {
            PrintStream prStr = new PrintStream(new PrintStream("C:\\Users\\Alena\\Desktop\\inputOut.txt"));
            prStr.print(text);
            prStr.println();
            prStr.println(7);
        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }
    }
}
