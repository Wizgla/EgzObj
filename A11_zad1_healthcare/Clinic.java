package A11_zad1_healthcare;

public class Clinic extends Hospital{
    double rating;
    public Clinic(String name, double capcity,double rating) {
        super(name, capcity);
        if(rating <0 || rating > 5.0){this.rating = 3.0;}
        else {this.rating = rating;}
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        if(rating <0 || rating > 5.0){this.rating = 3.0;}
        else {this.rating = rating;}
    }

    @Override
    public String toString() {
        return super.toString() + "\n"+"Rating: "+this.rating;
    }
    @Override
    public boolean equals(Object o){
        if(!super.equals(o)){return false;}
        Clinic clinic = (Clinic) o;
        return Double.compare(clinic.rating,rating) == 0;
    }
}
