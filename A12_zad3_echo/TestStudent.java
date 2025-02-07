package A12_zad3_echo;

public class TestStudent {
    public static void main(String[] args) {
        // ✅ Создаем объекты Student
        Student student1 = new Student("Alice", 20);
        Student student2 = new Student("Bob", 20);
        Student student3 = new Student("Charlie", 20);
        Student student4 = new Student("David", 21);

        // ✅ Тестируем echoIfEquivalent (все 3 студента с одинаковым age)
        System.out.println("Тест 1:");
        echo.echoIfEquivalent(student1, student2, student3); // Должно вывести сообщение

        // ✅ Тестируем с разным возрастом
        System.out.println("Тест 2:");
        echo.echoIfEquivalent(student1, student2, student4); // Не должно ничего вывести
    }
}
