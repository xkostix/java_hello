import java.util.*;

//Заполнить список десятью случайными числами.
//Отсортировать список методом sort() и вывести его на экран.
public class ListSort {
    public static void main(String[] args) {
        //task1(10, 0, 9);
        //task2_1();
    }

    static void task1(int n, int min, int max) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new Random().nextInt(min, max + 1));
        }
        Collections.sort(list);
        System.out.println(list);
    }

//Создать список типа ArrayList. Поместить в него как строки, так и целые числа.
// Пройти по списку, найти и удалить целые числа.
    static void task2_1() {
        ArrayList list = new ArrayList<>();
        list.add(23);
        list.add("qwerty");
        list.add(17.99);
        list.add(654);
        list.add("asdf");

        Iterator iter = list.iterator();
        while (iter.hasNext()){
            Object o = iter.next();
            if(o instanceof Integer){
                iter.remove();
            }
        }

        System.out.println(list);
    }
}

