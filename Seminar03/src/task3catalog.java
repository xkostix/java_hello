import java.util.ArrayList;
import java.util.List;
//Каталог товаров книжного магазина сохранен в виде двумерного списка
//List<ArrayList<String>> так, что на 0й позиции каждого внутреннего списка содержится
//название жанра, а на остальных позициях - названия книг.
// Напишите метод для заполнения данной структуры.

public class task3catalog {
    static List<ArrayList<String>> cat = new ArrayList<>(); //in upper class

    public static void main(String[] args) {
        addBook("Science fict", "To the Moon");
        addBook("Science fict", "qwerty");
        addBook("Detective", "Baker Street");
        addBook("Science fict", "Interstellar");
        System.out.println(cat);
    }

    static void addBook(String genre, String book) {
        ArrayList<String> cur = null; //Empty, for List in List
        for (ArrayList<String> s : cat) { //foreach <ArrayList<String> in cat
            if (s.get(0).equals((genre))) {
                cur = s;  //Link to ArrayList s in cat in memory
                cur.add(book);
                return;
            }
        }
        cur = new ArrayList<>();
        cur.add(genre);
        cat.add(cur);
        cur.add(book);
    }
}
