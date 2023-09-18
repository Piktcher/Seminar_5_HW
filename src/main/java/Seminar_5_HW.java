import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class Seminar_5_HW {

//    Реализуйте структуру телефонной книги с помощью HashMap.
//    Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными телефонами,
//    их необходимо считать, как одного человека с разными телефонами.
//    Вывод должен быть отсортирован по убыванию числа телефонов.

    public static void main(String[] args) {

        HashMap<String, String> phoneBook = new HashMap<>();

        int i = 1;
        while (true) {

            System.out.println("Введите желаемое действие, где\n" +
                    "1 - добавление контакта\n" +
                    "2 - вывод телефонной книги\n" +
                    "3 - закрыть приложение\n");

            Scanner s = new Scanner(System.in);
            String action = s.next();

            if (Objects.equals(action, "1")) {
                MyContacts.addContact(phoneBook);
                continue;
            }

            if (Objects.equals(action, "2")) {
                MyContacts.printOut(phoneBook);
                continue;
            }

            if (Objects.equals(action, "3")) MyContacts.terminate();

            else System.out.println("Введите значение от 1 до 3");


        }



    }

}
