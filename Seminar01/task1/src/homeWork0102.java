public class homeWork0102 {
    public static void main(String[] args) {

        Answer ans = new Answer();
        ans.printPrimeNums();
    }
}

class Answer {
    public void printPrimeNums(){
//        Напишите функцию printPrimeNums, которая выведет на экран все простые числа
//        в промежутке от 1 до 1000, каждое на новой строке.
        int n = 1000;
        int rem = 1;
        System.out.println("2"); //Only one even number
        for (int i = 3; i < n; i += 2) {
            for (int j = 2; j < i; j++) {
                rem = i % j;
                if (rem == 0) j = i;
            }
            if (rem != 0) System.out.println(i);
        }
    }
}