public class phoneBookMain {
    public static void main(String[] args) {
        String name1 = "Ivanov";
        String name2 = "Petrov";
        String name3 = "Sidorov";
        String name4 = "Popov";
        int phone1 = 111111;
        int phone2 = 222222;
        int phone3 = 333333;
        int phone4 = 444444;
        int phone5 = 555555;

        PhoneBook myPhoneBook = new PhoneBook();
        myPhoneBook.add(name1, phone1);
        myPhoneBook.add(name2, phone1);
        myPhoneBook.add(name2, phone2);
        myPhoneBook.add(name2, phone3);
        myPhoneBook.add(name2, phone4);
        myPhoneBook.add(name3, phone3);
        myPhoneBook.add(name3, phone4);
        myPhoneBook.add(name3, phone5);
        myPhoneBook.add(name4, phone1);
        myPhoneBook.add(name4, phone2);
        myPhoneBook.add(name4, phone3);
        myPhoneBook.add(name4, phone4);

        System.out.println(myPhoneBook.find(name3));
        System.out.println(myPhoneBook.find("Nobody"));
        //System.out.println(myPhoneBook.getPhoneBook());
        myPhoneBook.printSortedPhoneBook();
    }
}
