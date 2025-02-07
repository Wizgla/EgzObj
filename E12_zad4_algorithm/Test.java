package E12_zad4_algorithm;

public class Test {
    public static void main(String[] args) {
        // ✅ Создаем студентов
        Student student1 = new Student("Alice", 4.5f);
        Student student2 = new Student("Alice", 4.5f);
        Student student3 = new Student("Alice", 4.5f);
        Student student4 = new Student("Bob", 3.7f);

        // ✅ Тестируем compareThree() на объектах Student
        System.out.println("Тест 1 (все три равны): " + Alg.compareThree(student1, student2, student3)); // true
        System.out.println("Тест 2 (разные студенты): " + Alg.compareThree(student1, student2, student4)); // false

    }
}
