package A11_zad1_healthcare;

public class TestHospital {
    public static void main(String[] args) {
        // Создание объектов Hospital
        Hospital hospital1 = new Hospital("City Hospital", 200);
        Hospital hospital2 = new Hospital("General Hospital", 300);
        Hospital hospital3 = new Hospital(null, -10);

        // Создание объектов Clinic
        Clinic clinic1 = new Clinic("City Clinic", 100, 4.5);
        Clinic clinic2 = new Clinic("Health Clinic", 150, 5.0);
        Clinic clinic3 = new Clinic("", 120, -1.0);

        // Вывод информации
        System.out.println(hospital1);
        System.out.println(hospital2);
        System.out.println(hospital3);
        System.out.println(clinic1);
        System.out.println(clinic2);
        System.out.println(clinic3);

        // Проверка метода equals
        System.out.println("hospital1 equals hospital2: " + hospital1.equals(hospital2));
        System.out.println("clinic1 equals clinic2: " + clinic1.equals(clinic2));
    }

}
