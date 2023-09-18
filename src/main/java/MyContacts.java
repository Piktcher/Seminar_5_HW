import java.util.*;

public class MyContacts {

    public static void addContact(HashMap<String, String> book) {

        System.out.println("Введите ФИО контакта");
        Scanner namestring = new Scanner(System.in);
        String name = namestring.nextLine();

        System.out.println("Введите номер контакта");
        Scanner phonestring = new Scanner(System.in);
        String phone = phonestring.nextLine();

        if (book.containsKey(name)) {
            String newphone = book.get(name);
            newphone += ", " + phone;
            book.put(name, newphone);
        }
        else {
            book.put(name, phone);
        }

        System.out.println("Контакт успешно добавлен!");
    }

    public static void  printOut(HashMap<String, String> book) {

        ArrayList<Map.Entry> temparray = new ArrayList<>(book.entrySet());  // Не нашел/не вспомнил человеческого способа сортировки по value :((
        temparray.sort(new Comparator<>() {
            @Override
            public int compare(Map.Entry o1, Map.Entry o2) {
                return Integer.compare(o2.getValue().toString().length(), o1.getValue().toString().length());
            }
        });
        for (Map.Entry entry: temparray) {
            System.out.println(entry.getKey().toString() + ": " + entry.getValue().toString());
        }
    }

    public static void terminate() {

        System.out.println("До свидания!");
        System.exit(0);
    }

}
