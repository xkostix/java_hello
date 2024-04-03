//Дано четное число N (>0) и символы c1 и c2.
//Написать метод, который вернет строку длины N,
//которая состоит из чередующихся символов c1 и c2, начиная с c1.
public class task01Chars {
    public static void main(String[] args) {
        int n = 1000;
        char c1 = 'G';
        char c2 = 'b';

        long start = System.currentTimeMillis();
        getAltCharsStr(n, c1, c2);
        System.out.println(System.currentTimeMillis() - start);
        System.out.println(getAltCharsStr(n, c1, c2)); //print if necessary

        start = System.currentTimeMillis();
        getAltCharsSb(n, c1, c2);
        System.out.println(System.currentTimeMillis() - start);
        System.out.println(getAltCharsSb(n, c1, c2)); //print if necessary
    }

    public static String getAltCharsStr(int n, char c1, char c2) {
        String str = "";
        for (int i = 0; i < n/2; i++) {
            str += Character.toString(c1) + Character.toString(c2);
        }
        return str;
    }

    public static String getAltCharsSb(int n, char c1, char c2) {
        StringBuilder sb = new StringBuilder(n); //n - amount of symbols
        for (int i = 0; i < n/2; i++) {
            sb.append(c1).append(c2);
        }
        return sb.toString();
    }
}
