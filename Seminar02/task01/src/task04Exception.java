import java.io.FileWriter;

//Напишите метод, который составит строку, состоящую из 100
//повторений слова TEST и метод, который запишет эту строку в
//простой текстовый файл, обработайте исключения.
public class task04Exception {
    public static void main(String[] args) {
        System.out.println(repeatWord("Test", 100)); //Check
        String resWord = repeatWord("Test", 100);
        writeToFile(resWord, "new.txt");
    }

    static String repeatWord(String word, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(word).append(' ');
        }
        return sb.toString();
    }

    static void writeToFile(String str, String fileName) {
        try (FileWriter fw = new FileWriter(fileName)) {  //try with resource!
            fw.write(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
//        FileWriter fw = null;
//        try {                                //try w/o resource
//            fw = new FileWriter(fileName);
//            fw.write(str);
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                fw.close();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
    }
}
