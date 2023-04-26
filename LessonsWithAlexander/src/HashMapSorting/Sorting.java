package HashMapSorting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Sorting {
    public static HashMap<String, Integer> createHashMap() {
        HashMap<String, Integer> hashMap = new HashMap<>();
        String name[] = {"Александр", "Петр", "Сергей", "Иван", "Женя", "Владимир", "Константин", "Борис", "Петя", "Евгений"};
        int number[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < number.length; i++) {
            hashMap.put(name[i], number[i]);
        }
        return hashMap;
    }
    public static void hashMapSorting(HashMap hashMap){
        boolean isSort = false;
        int count = 0;
        ArrayList<Map.Entry<String, Integer>> arrayList = new ArrayList<>(hashMap.entrySet());
        
        while (!isSort){
            for (int i = 0; i < arrayList.size() - 1; i++) {
                if(arrayList.get(i).getValue() > arrayList.get(i + 1).getValue()){
                    Map.Entry<String, Integer> entry = arrayList.get(i + 1);
                    arrayList.set(i + 1, arrayList.get(i));
                    arrayList.set(i, entry);
                    count ++;
                }
            }
            if(count == 0){
                isSort = true;
            } else {
                count = 0;
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i).getKey() + " " + arrayList.get(i).getValue());
        }
    }
}
