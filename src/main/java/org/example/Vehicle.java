package org.example;

public class Vehicle extends Asset{
    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String description, String dateAcquired, double ogCost, String makeModel,
                   int year, int odometer) {
        super(description, dateAcquired, ogCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }
    //GETTER and SETTERS

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }
    @Override
    public double getValue(){
        //int currentYear =
        //int age = currentYear - year;

        double value = getOgCost();
//        if (age <= 3){
//            value -= value * (0.03 * age)
//        } else if (age <= 6) {
//            value -= * (0.06 * age);/
//        } else if (age <= 10) {
//            value -= value - *0.08 * age);
//        }else {
//            value = 1000;
//        }
        //mileage  reduction
        if (odometer > 10000 && !(makeModel.toLowerCase().contains("honda")
        || makeModel.toLowerCase().contains("toyota"))){
            value -= value * 0.25;
        }
        return value;
    }
}
