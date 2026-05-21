package models;

public class CarYear {

    private int year;
    private boolean valid;

    public CarYear(int year, boolean valid) {
        this.year = year;
        this.valid = valid;
    }

    public int getYear() {
        return year;
    }

    public boolean isValid() {
        return valid;
    }

}