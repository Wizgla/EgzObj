package E12_zad3_utilities;

import java.util.ArrayList;
import java.util.List;

public class TestUtilities {
    public static void main(String[] args) {
        // ✅ Пример с Integer
        List<Integer> numbers1 = new ArrayList<>();
        numbers1.add(1);
        numbers1.add(2);
        numbers1.add(3);

        List<Integer> numbers2 = new ArrayList<>();
        numbers2.add(4);
        numbers2.add(5);

        // Вызываем метод appendFromEnd()
        Append.appendFromEnd(numbers2, numbers1);

        System.out.println("Числа после объединения: " + numbers2); // [4, 5, 1, 2, 3]

        // ✅ Пример с String
        List<String> words1 = new ArrayList<>();
        words1.add("Hello");
        words1.add("World");

        List<String> words2 = new ArrayList<>();
        words2.add("Java");

        Append.appendFromEnd(words2, words1);

        System.out.println("Слова после объединения: " + words2); // [Java, Hello, World]

        // ✅ Пример с Number (Integer -> Number)
        List<Number> mixedNumbers = new ArrayList<>();
        mixedNumbers.add(99.99);

        Append.appendFromEnd(mixedNumbers, numbers1); // Integer -> Number

        System.out.println("Смешанный список чисел: " + mixedNumbers); // [99.99, 1, 2, 3]
    }
}
