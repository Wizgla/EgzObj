package A13_zad4_alg;

import java.util.TreeSet;

public class TestIsUnique {
    public static void main(String[] args) {
        // ✅ Тест 1: Уникальные элементы (ожидаем true)
        TreeSet<Integer> set1 = new TreeSet<>();
        set1.add(10);
        set1.add(20);
        set1.add(30);
        System.out.println("Тест 1 (уникальные элементы): " + Uniq.isUnique(set1));

        // ✅ Тест 2: Дубликаты (должно быть false, но TreeSet не допускает дубликатов)
        TreeSet<Integer> set2 = new TreeSet<>();
        set2.add(10);
        set2.add(10); // Это не сработает, так как TreeSet сам удаляет дубликаты
        System.out.println("Тест 2 (дубликаты): " + Uniq.isUnique(set2)); // Всё равно будет true

        // ✅ Тест 3: Пустой TreeSet (ожидаем true)
        TreeSet<Integer> emptySet = new TreeSet<>();
        System.out.println("Тест 3 (пустой сет): " + Uniq.isUnique(emptySet));

    }
}
