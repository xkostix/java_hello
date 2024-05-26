//Напишите программу, представляющую телефонную книгу.
//Программа должна иметь следующие функции:
//      add(String name, Integer phoneNum): Добавляет запись в телефонную книгу.
//  Если запись с именем name уже существует, добавляет новый номер телефона в существующую запись.
//  Если запись с именем name не существует, создает новую запись с этим именем и номером телефона phoneNum.
//     find(String name): Поиск номеров телефона по имени в телефонной книге.
//  Если запись с именем name существует, возвращает список номеров телефона для этой записи.
//  Если запись с именем name не существует, возвращает пустой список.
//     getPhoneBook(): Возвращает всю телефонную книгу в виде HashMap, где ключи - это имена, а значения - списки номеров телефона.
//
//  Пример.
//    На входе:
//        add("Alice", 123456);
//        add("Alice", 789012);
//        add("Bob", 789012);
//
//        На выходе:
//        Команды:
//        find("Alice")
//        getPhoneBook()
//        find("Me")
//
//        Результат:
//        [123456, 789012].
//        []
//        {Bob=[789012], Alice=[123456, 789012]}


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();

    public void add(String name, Integer phoneNum) {
        if (phoneBook.containsKey(name)) {
            ArrayList<Integer> list = phoneBook.get(name);
            list.add(phoneNum);
            phoneBook.put(name, list);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(phoneNum);
            phoneBook.put(name, list);
        }
    }

    public ArrayList<Integer> find(String name) {
        if (phoneBook.containsKey(name)) {
            return phoneBook.get(name);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            return list;
        }
    }

    public static HashMap<String, ArrayList<Integer>> getPhoneBook() {
        return phoneBook;
    }
}
