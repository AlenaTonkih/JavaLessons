package CollectionsFramework;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);

        }
        ArrayList<Integer> list2 = new ArrayList<>(list);
        for (int i = 10; i < 20; i++) {
            list2.add(i);
        }
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));
        }


    }
}
