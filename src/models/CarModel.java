package models;

import java.util.Arrays;

public class CarModel {

    private String name;
    private CarYear[] years;

    public CarModel(String name, CarYear[] years) {
        this.name = name;
        this.years = years;
    }

    public String getName() {
        return name;
    }

    public CarYear[] getYears() {
        return years;
    }


    @Override
    public String toString() {
        return "CarModel [name=" + name + ", years=" + Arrays.toString(years) + "]";
    }

    

}