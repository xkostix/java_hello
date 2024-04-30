import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class task3QueueStack {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5};
        arrToStack(array);
        arrToQueue(array);
    }

    //1) Написать метод, который принимает массив элементов, помещает их в стэк
// и выводит на консоль содержимое стэка.
    static void arrToStack(int[] arr) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            st.push(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(st.pop());
        }
        System.out.println(st); //Once again print stack (empty)
    }

    //Написать метод, который принимает массив элементов,
//помещает их в очередь и выводит на консоль содержимое очереди.
    static void arrToQueue(int[] arr) {
        Queue<Integer> qu = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            qu.add (arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(qu.poll());
        }
        System.out.println(qu); //Once again print Queue (empty)
    }
}
