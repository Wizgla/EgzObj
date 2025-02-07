package A11_zad3_moto;

public class Vehicle implements Comparable<Vehicle>{
    String model;
    int speed;

    public Vehicle(String model, int speed) {
        if(model == null || model.isEmpty()){
            throw new IllegalArgumentException("Название не может быть пустым");
        }
        if(speed<0){
            throw new IllegalArgumentException("Скорость не может быть отрицательной");
        }
        this.model = model;
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", speed=" + speed +
                '}';
    }

    @Override
    public int compareTo(Vehicle o) {
        return Integer.compare(this.speed,o.speed);
    }
}
