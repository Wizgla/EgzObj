package A11_zad1_healthcare;

import java.util.Objects;

public class Hospital {
    String name;
    double capcity;

    public Hospital(String name,double capcity) {
            if(name == null){this.name = "";}
            else {this.name = name;}
            if(capcity <0){this.capcity = 50.0;}
            else {this.capcity = capcity;}
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ": Name: "+this.name+". Capacity: "+this.capcity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null){this.name = "";}
        else {this.name = name;}
    }

    public double getCapcity() {
        return capcity;
    }

    public void setCapcity(double capcity) {
        if(capcity <0){this.capcity = 50.0;}
        else {this.capcity = capcity;}
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hospital hospital = (Hospital) o;
        return Double.compare(capcity, hospital.capcity) == 0 && Objects.equals(name, hospital.name);
    }

    @Override
    public int hashCode() {
        return 31 * name.hashCode()+ Double.hashCode(capcity);
    }
}
