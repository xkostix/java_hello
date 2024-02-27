public class homeWork01 {
    public static void main(String[] args) {
        int n = 0;

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            n = 0;
        } else {
            n = Integer.parseInt(args[0]);
        }

        // Вывод результата на экран
        Answer1 ans = new Answer1();
        int itresume_res = ans.countNTriangle(n);
        System.out.println(itresume_res);
    }
}

class Answer1 {
    public int countNTriangle(int n) {
//  Вычислить n-ое треугольное число(сумма чисел от 1 до n).
//  Общая формула для n n-го по порядку треугольного числа:
//  Tn = n * ( n + 1 ) /2 , n = 1 , 2 , 3 ...
        if (n < 1) return -1;
        else return n * (n + 1) / 2;
//       another solution:
//       int sum = 0;
//       for(int i = 1; i <= n; i++){
//           sum += i; }
    }
}