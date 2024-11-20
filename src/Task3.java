
//Реализуйте метод countOccurrences в классе ListUtils, который
//принимает LinkedList<String> и строку, и возвращает количество
//вхождений строки в список.

import java.util.LinkedList;

class ListUtils {
    public static int countOccurrences(LinkedList<String> list, String value) {
// Напишите свое решение ниже
        int counter = 0;
        for (String str : list) {
            if (str.equals(value))
                counter++;
        }
        return counter;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Task3 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        String value;
        if (args.length < 2) {
// При отправке кода на Выполнение, вы можете варьировать эти параметры
            list.add("apple");
            list.add("banana");
            list.add("apple");
            list.add("pear");
            list.add("banana");
            list.add("apple");
            value = "apple";
        } else {
            for (int i = 0; i < args.length - 1; i++) {
                list.add(args[i]);
            }
            value = args[args.length - 1];
        }
        ListUtils utils = new ListUtils();
        System.out.println("Occurrences of \"" + value + "\": "
                + utils.countOccurrences(list, value));
    }
}
