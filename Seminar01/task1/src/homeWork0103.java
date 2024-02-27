public class homeWork0103 {
    public static void main(String[] args) {
        int a = 0;
        char op = ' ';
        int b = 0;

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = 7;
            op = '=';
            b = 3;
        } else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
        }

        if (op == '+' || op == '-' || op == '*' || op == '/') {
            Calculator calculator = new Calculator();
            double result = calculator.calculate(op, a, b);
            System.out.println(result);
        }
        else {
            System.out.println("Некорректный оператор: '" +op+ "'.");
        }
    }
}

class Calculator {
    public double calculate(char op, int a, int b) {
        double aD = a;
        double bD = b;
        if (op == '+') return aD + bD;
        else {
            if (op == '-') return aD - bD;
            else {
                if (op == '*') return  aD * bD;
                else {
                    return aD / bD;
                }
            }
        }
    }
}