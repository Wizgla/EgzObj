package A11_zad4_university;

import java.util.ArrayList;
import java.util.List;

public class TestUniversity {
    public static void main(String[] args) {
        // ✅ Создаем список студентов
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 8.5));
        students.add(new Student("Bob", 9.0));
        students.add(new Student("Alice", 8.5)); // Дубликат
        students.add(new Student("Charlie", 7.5));
        students.add(new Student("Alice", 8.5)); // Еще один дубликат

        // ✅ Выбираем студента для поиска
        Student searchStudent = new Student("Alice", 8.5);

        //  Подсчитываем количество вхождений
        int count = CountElem.countElements(students, searchStudent);

        // ✅ Выводим результат
        System.out.println("Количество студентов " + searchStudent + " в списке: " + count);
    }
}
