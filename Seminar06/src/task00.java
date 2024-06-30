import java.util.*;

public class task00 {
    public static void main(String[] args) {
        //task0();
        //task1:
        System.out.println(task1(createArr(1000, 0, 24)));
    }

    static void task0(){
        Set<Integer> setH = new HashSet<>(Arrays.asList(3,2,1,2,4,5,7,6));
        Set<Integer> setL = new LinkedHashSet<>(Arrays.asList(3,2,1,2,4,5,7,6));
        Set<Integer> setT = new TreeSet<>(Arrays.asList(3,2,1,2,4,5,7,6));
        System.out.println(setH);
        System.out.println(setL);
        System.out.println(setT);
    }

    //task1
// 1. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.
// 2. Создайте метод, в который передайте заполненный выше массив
// и с помощью Set вычислите процент уникальных значений в данном массиве
// и верните его в виде числа с плавающей запятой.
// Для вычисления процента используйте формулу:
// процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
    static Integer[] createArr(int n, int min, int max) { //For creating array 1000 elements
        Integer[] arr = new Integer[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(min, max + 1);
        }
        return arr;
    }
    static double task1(Integer[] arr){ //Put here array and calculate %
        Set<Integer> set = new HashSet<>(Arrays.asList(arr));
        return set.size() * 100.0 / arr.length;
    }

}
