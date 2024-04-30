import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

// 1. Принимает от пользователя строку вида text~num
// 1. Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
// 2. Если введено print~num, выводит строку из позиции num в связном списке
// и удаляет её из списка.
public class task1LinkedList {
    public static void main(String[] args) {
        //task1();
        task2();
    }

    // 1. Принимает от пользователя строку вида text~num
// 1. Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
// 2. Если введено print~num, выводит строку из позиции num в связном списке
// и удаляет её из списка.
    static void task1(){
        List<String> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Enter command (text~num): ");
            String line = scanner.nextLine();
            if (line.equals(("exit"))){
                System.out.println("Bye!");
                return;
            }
            String[] arr = line.split("~");
            String text = arr[0];
            int num = Integer.parseInt(arr[1]);
            switch (text){
                case "print":
                    System.out.println(list.remove(num)); //remove and print
                    break;
                default:
                    list.add(num, text);
            }
        }
    }

//1. Принимает от пользователя и “запоминает” строки.
//2. Если введено print, выводит строки так, чтобы последняя введенная была
// первой в списке, а первая - последней.
//3. Если введено revert, удаляет предыдущую введенную строку из памяти.
    static void task2() {
        List<String> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter string: ");
            String line = scanner.nextLine();
            switch (line) {
                case "exit":
                    return;
                case "print":
                    int in = list.size() - 1;
                    while (in >= 0) {
                        System.out.println(list.get(in--));
                    }
                    break;
                case "revert":
                    System.out.println(list.removeLast());
                    break;
                default:
                    list.add(line);
            }

        }
    }
}
