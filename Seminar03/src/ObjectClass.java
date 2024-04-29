//Даны следующие строки, cравнить их с помощью == и
//метода equals() класса Object
// String s1 = "hello";
// String s2 = "hello";
// String s3 = s1;
// String s4 = "h" + "e" + "l" + "l" + "o";
// String s5 = new String("hello");
// String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
public class ObjectClass {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = s1;  //link to the same memory area
        String s4 = "h" + "e" + "l" + "l" + "o"; //link to the same memory area
        String s5 = new String("hello"); //another memory area
        String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});  //another memory area
        System.out.println(s1 == s2); //True
        System.out.println(s2 == s3); //True
        System.out.println(s3 == s4); //True
        System.out.println(s4 == s5); //False, different mem area
        System.out.println(s5 == s6); //False, different mem area

        System.out.println(s1.equals(s2)); //True
        System.out.println(s2.equals(s3)); //True
        System.out.println(s3.equals(s4)); //True
        System.out.println(s4.equals(s5)); //True
        System.out.println(s5.equals(s6)); //True

    }
}
