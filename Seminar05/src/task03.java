//Взять набор строк (слов), например,
// Мороз и солнце день чудесный
// Еще ты дремлешь друг прелестный
// Пора красавица проснись.
//Написать метод, который отсортирует эти строки по длине с помощью TreeMap.
//Строки (слова) с одинаковой длиной не должны “потеряться”.

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class task03 {
    public static void main(String[] args) {
        task3("Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись");
    }

    static void task3(String str){
        String[] words = str.split(" ");
        Map<Integer, List<String>> map = new TreeMap<>();
        for (String word : words) {
            int len = word.length();
            if (map.containsKey(len)) {
                List<String> list = map.get(len);
                list.add(word);
            } else {
                List<String> list = new ArrayList<>();
                list.add(word);
                map.put(len, list);
            }
        }
        System.out.println(map);
    }
}
