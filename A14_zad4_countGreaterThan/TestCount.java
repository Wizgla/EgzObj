package A14_zad4_countGreaterThan;

import java.util.LinkedList;

public class TestCount {
    public static void main(String[] args) {
        // ✅ Тест 1: LinkedList с числами
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("Чисел больше 25: " + Count.countGreaterThan(25, numbers)); // Ожидаем 3
        System.out.println("Чисел больше 50: " + Count.countGreaterThan(50, numbers)); // Ожидаем 0

        // ✅ Тест 2: LinkedList с `String`
        LinkedList<String> words = new LinkedList<>();
        words.add("Apple");
        words.add("Banana");
        words.add("Mango");
        words.add("Peach");
        words.add("Orange");

        System.out.println("Слов больше чем 'Banana': " + Count.countGreaterThan("Banana", words)); // Ожидаем 3

        // ✅ Тест 3: Пустой список (должно вернуть 0)
        LinkedList<Double> emptyList = new LinkedList<>();
        System.out.println("Пустой список: " + Count.countGreaterThan(5.0, emptyList)); // Ожидаем 0

    }
}
