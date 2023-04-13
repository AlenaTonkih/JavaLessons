package Lesson_7.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Task_5Sorting {
    //Дан текст. Необходимо определить частоту вхождения каждого слова и
    // вывести эту информацию в порядке убывания по количеству вхождений
    //Найти три самых повторяющихся слова в тексте

    //посмотреть методы мап, скачать sonar cube, sonar lint (для идеи)

    public static HashMap<String, Integer> displayWordsOnTheScreen(String string) { //метод, превращающий строку в HashMap
        String[] words = string.toLowerCase().replaceAll("[-.?!)(,:]", "").split(" ");

        Map<String, Integer> counterMap = new HashMap<>();
        for (String word : words) {
            if (!word.isEmpty()) {
                int count = counterMap.getOrDefault(word, 0);
                counterMap.put(word, count + 1);
            }
        }
        return (HashMap) counterMap;
    }

    public static ArrayList<Map.Entry<String, Integer>> hashMapSorting(HashMap<String, Integer> counterMap) { //Сортировка HashMap по значению (сортировка пузырьком)
        boolean isSort = false;
        int count = 0;
        ArrayList<Map.Entry<String, Integer>> arrayList = new ArrayList<>(counterMap.entrySet());

        while (!isSort) {
            for (int i = 0; i < arrayList.size() - 1; i++) {
                if (arrayList.get(i).getValue() > arrayList.get(i + 1).getValue()) {
                    Map.Entry<String, Integer> entry = arrayList.get(i + 1);
                    arrayList.set(i + 1, arrayList.get(i));
                    arrayList.set(i, entry);
                    count++;
                }
            }
            if (count == 0) {
                isSort = true;
            } else {
                count = 0;
            }
        }

        return arrayList;
    }

    public static void returnThreeRepeatedWords(ArrayList<Map.Entry<String, Integer>> arrayList) { //Топ-3 повторяющихся слова
        int count = 0;
        for (int i = arrayList.size() - 1; i >= 0; i--) {
            count++;
            if (count <= 3) {
                System.out.println(arrayList.get(i).getKey() + " " + arrayList.get(i).getValue());
            } else {
                break;
            }
        }
    }
}
