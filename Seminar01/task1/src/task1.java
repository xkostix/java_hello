import java.time.LocalTime;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        System.out.println(task05(2,3));
    }

    static void task00(){
        System.out.print("Hello! Print your name: ");
        Scanner scan = new Scanner(System.in, "cp1251");
        String name = scan.nextLine();
        System.out.println("Hello, " + name);
    }

    static void task01(){
        //Запросить имя польз. В зависимости от времени вывести приветствие:
        //"Доброе утро/день/вечер/ночи, <Имя>!"
        System.out.println("Hello! Print your name: ");
        Scanner scan = new Scanner(System.in, "cp1251");
        String name = scan.nextLine();
        LocalTime nowTime = LocalTime.now();
        int hour = nowTime.getHour();

        String greeting;
        if (hour >= 5 && hour < 12) greeting = "Good morning";
        else if (hour >= 12 && hour < 18) greeting = "Good day";
        else if (hour >= 18 && hour < 23) greeting = "Good evening";
        else  greeting = "Good night";

        System.out.printf("%s, %s!\n", greeting, name);
    }

    static void task02(){
//      Дан массив двоичных чисел, например [1,1,0,1,1,1,0],
//      вывести максимальное количество подряд идущих 1
        int[] array = {1,1,0,1,1,1};
        int count = 0;
        int maxOnes = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) count++;
            else {
                if(maxOnes < count) maxOnes = count;
                count = 0;
            }
        }
        if (maxOnes < count) maxOnes = count;
        System.out.println(maxOnes);
    }

    static void task03() {
//        Дан массив nums = [3,2,2,3] и число val = 3.
//        Если в массиве есть числа, равные заданному,
//        нужно перенести эти элементы в конец массива.
//        Таким образом, первые несколько (или все) элементов
//        массива должны быть отличны от заданного, а остальные - равны ему.
        int[] nums = {3,2,2,3};
        int val = 3;
        int[] tempArr = new int[nums.length];
        Arrays.fill(tempArr, val);
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != val) {
                tempArr[count++] = nums[i];
            }
        }
        System.out.println(Arrays.toString(tempArr));
    }

    static void task04(String str) {
//      Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.
        str = str.toLowerCase();
        String[] arr = str.split(" ");
        String result = "";
        for (int i = arr.length-1; i >= 0; i--) {
            result += arr[i] + ' ';
        }
        System.out.println(result);
    }

    static double task05(int a, int b) {
//        Реализовать функцию возведения числа а в степень b. a, b из Z.
//        Сводя количество выполняемых действий к минимуму.
//        Пример 1: а = 3, b = 2, ответ: 9
//        Пример 2: а = 2, b = -2, ответ: 0.25
//        Пример 3: а = 3, b = 0, ответ: 1
        double result = 1;
        int c = b < 0 ? -b : b; //always positive multiplier
        for (int i = 0; i < c; i++) {
            result *= a;
        }
        return b > 0 ? result : 1/result;
    }
}
