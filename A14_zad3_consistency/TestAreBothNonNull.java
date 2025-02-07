package A14_zad3_consistency;

public class TestAreBothNonNull {
    public static void main(String[] args) {
        // ✅ Тест 1: Оба объекта не null (должно вернуть true)
        String str1 = "Hello";
        String str2 = "World";
        System.out.println("Тест 1: " + Are.areBothNonNull(str1, str2)); // true

        // ✅ Тест 2: Один объект null (должно вернуть false)
        String str3 = null;
        System.out.println("Тест 2: " + Are.areBothNonNull(str1, str3)); // false

        // ✅ Тест 3: Оба объекта null (должно вернуть false)
        System.out.println("Тест 3: " + Are.areBothNonNull(null, null)); // false

        // ✅ Тест 4: Используем Integer (должно вернуть true)
        Integer num1 = 10;
        Integer num2 = 20;
        System.out.println("Тест 4: " + Are.areBothNonNull(num1, num2)); // true

        // ✅ Тест 5: Один Integer = null (должно вернуть false)
        Integer num3 = null;
        System.out.println("Тест 5: " + Are.areBothNonNull(num1, num3)); // false
    }
}
