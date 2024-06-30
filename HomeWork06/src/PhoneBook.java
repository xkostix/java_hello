import java.util.*;

public class PhoneBook {
    private static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();

    public void add(String name, Integer phoneNum) {
        if (phoneBook.containsKey(name)) {
            ArrayList<Integer> list = phoneBook.get(name);
            list.add(phoneNum);
            phoneBook.put(name, list);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(phoneNum);
            phoneBook.put(name, list);
        }
    }

    public ArrayList<Integer> find(String name) {
        if (phoneBook.containsKey(name)) {
            return phoneBook.get(name);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            return list;
        }
    }

    public static HashMap<String, ArrayList<Integer>> getPhoneBook() {
        return phoneBook;
    }

    public void printSortedPhoneBook() {
        TreeMap<Integer, ArrayList<String>> sortedBook = new TreeMap<>(Comparator.reverseOrder());
        /* collect to TreeMap*/
        for (Map.Entry<String, ArrayList<Integer>> entry : phoneBook.entrySet()) {
            String bookKey = entry.getKey();
            ArrayList<Integer> bookValue = entry.getValue();
            int size = bookValue.size();
            if (sortedBook.containsKey(size)) {
                ArrayList<String> list = sortedBook.get(size);
                list.add(bookKey);
            } else {
                ArrayList<String> list = new ArrayList<>();
                list.add(bookKey);
                sortedBook.put(size, list);
            }

        }
        // System.out.println(sortedBook); //for debugging
        /* Print sorted in descending order */
        for (Map.Entry<Integer, ArrayList<String>> entry : sortedBook.entrySet()) {
            for (String name : entry.getValue()) {
                System.out.println(name + "=" + phoneBook.get(name));
            }

        }
    }
}
