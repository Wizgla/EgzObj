package A14_zad2_geography;


import java.awt.*;
import java.util.ArrayList;

public class Mountain implements Cloneable{
    String name;
    ArrayList<Double> heights;

    public Mountain(String name, ArrayList<Double> heights) {
        this.name = name;
        this.heights = new ArrayList<>(heights);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Double> getHeights() {
        return heights;
    }

    public void setHeights(ArrayList<Double> heights) {
        this.heights = new ArrayList<>(heights);
    }

    @Override
    protected Mountain clone() {
        try{Mountain cloned = (Mountain) super.clone();
            cloned.heights = new ArrayList<>(this.heights);
            return cloned;}
        catch (CloneNotSupportedException e){throw new RuntimeException("Ошибка клонирования");}

    }

    @Override
    public String toString() {
        return "Mountain{" +
                "name='" + name + '\'' +
                ", heights=" + heights +
                '}';
    }
}