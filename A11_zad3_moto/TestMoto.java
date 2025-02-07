package A11_zad3_moto;

public class TestMoto {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Vehicle("Tesla Model S", 250),
                new Vehicle("Bugatti Chiron", 420),
                new Vehicle("BMW M5", 305),
                new Vehicle("Porsche 911", 999),
                new Vehicle("Toyota Supra", 280)
        };

        // Используем метод maxValue для поиска самого быстрого автомобиля
        Vehicle fastestVehicle = MaxVal.maxValue(vehicles);

        // Выводим результат
        System.out.println("Самый быстрый автомобиль: " + fastestVehicle);
    }
}
