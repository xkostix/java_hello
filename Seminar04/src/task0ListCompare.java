import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class task0ListCompare {
    public static void main(String[] args) {
        task0();
    }
//1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
//2) Замерьте время, за которое в LinkedList добавятся 10000 элементов.
//Сравните с предыдущим.
    //100 000 - быстрее add в конец ArrayList
    //1 000 000 - быстрее add в конец LinkedList
    //Добавление в начало - быстрее LinkedList
    static void task0(){
        List<Integer> listA = new ArrayList<>();
        List<Integer> listL = new LinkedList<>();

        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            listA.add(0, i);
        }
        long middle = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            listL.add(0, i);
        }
        long finish = System.currentTimeMillis();

        System.out.println(middle - start);
        System.out.println(finish - middle);
    }
}
