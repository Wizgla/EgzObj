package E13_zad4_algorythm;

public class TestItemManager {
    public static void main(String[] args) {
        // ✅ Тест с числами
        ItemManager<Integer> intManager = new ItemManager<>();
        intManager.addItem(10);
        intManager.addItem(20);
        intManager.addItem(30);

        System.out.println("Элемент по индексу 1: " + intManager.getItem(1)); // 20
        System.out.println("Количество элементов: " + intManager.getItemCount()); // 3

        // ✅ Тест со строками
        ItemManager<String> stringManager = new ItemManager<>();
        stringManager.addItem("Apple");
        stringManager.addItem("Banana");
        stringManager.addItem("Cherry");

        System.out.println("Элемент по индексу 2: " + stringManager.getItem(2)); // "Cherry"
        System.out.println("Количество элементов: " + stringManager.getItemCount()); // 3
    }
}
