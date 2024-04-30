//Реализовать стэк с помощью массива. Нужно реализовать методы:
//size(), empty(), push(), peek(), pop().
public class MyStack {
    private int[] arr = new int[10];
    private int size = 0;
    //public static void main(String[] args) {

    public  int size(){
        return size;
    }

    public boolean empty(){
        return size == 0;
    }

    public void push(int item){
        if (size == arr.length){  //if array is full, then add elements
            int[] tempArr = new int[arr.length * 2];
            System.arraycopy(arr, 0 ,tempArr, 0, arr.length);
            arr = tempArr;
        }
        arr[size++] = item;
    }

    public int peek(){
        return arr[size - 1];
    }

    public int pop(){
        return arr[--size];
    }
}
