package E12_zad1_sports;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.OptionalDouble;

public class Athlete {
    String name;
    String nationality;
    double[] record;

    public Athlete(String name, String nationality, double[] record) {
        this.name = name;
        this.nationality = nationality;
        this.record = Arrays.copyOf(record,record.length);
    }

    public double getRecordMinVal(){
        double minVal = this.record[0];
        for(int i = 0; i< Array.getLength(this.record);i++){
            if(this.record[i]<minVal){
                minVal = this.record[i];
            }
        }
        return minVal;
    }

    public String getNationality() {
        return nationality;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Athlete{" +
                "name='" + name + '\'' +
                ", nationality='" + nationality + '\'' +
                ", record=" + this.getRecordMinVal() +
                '}';
    }
}
