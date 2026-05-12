package org.example;

public class Asset {
    private String description;
    private String dateAcquired;
    private double ogCost;

    public Asset(String description, String dateAcquired, double ogCost) {
        this.description = description;
        this.dateAcquired = dateAcquired;
        this.ogCost = ogCost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDateAcquired() {
        return dateAcquired;
    }

    public void setDateAcquired(String dateAcquired) {
        this.dateAcquired = dateAcquired;
    }

    public double getOgCost() {
        return ogCost;
    }

    public void setOgCost(double ogCost) {
        this.ogCost = ogCost;
    }
    //base
    public double getValue(){
        return ogCost;
    }
}
