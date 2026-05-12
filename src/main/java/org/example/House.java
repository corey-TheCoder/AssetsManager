package org.example;

public class House extends Asset {
    private String address;
    private int condition;
    private int sqFoot;
    private int lotSize;

    public House(String description, String dateAcquired, double ogCost, String address, int condition, int sqFoot, int lotSize) {
        super(description, dateAcquired, ogCost);
        this.address = address;
        this.condition = condition;
        this.sqFoot = sqFoot;
        this.lotSize = lotSize;
    }

    //getters & setters
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSqFoot() {
        return sqFoot;
    }

    public void setSqFoot(int sqFoot) {
        this.sqFoot = sqFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }


    //annotation
    //the method being manipulated
    @Override
    public double getValue(){
        double pricePerSqFoot = 0;

        //multiple options
        switch(condition){
            case 1:
                pricePerSqFoot = 180;break;
            case 2:
                pricePerSqFoot = 130;break;
            case 3:
                pricePerSqFoot = 90;break;
            case 4:
                pricePerSqFoot = 80;break;
            default:
                System.out.println("././/./././/");
        }
        return (sqFoot * pricePerSqFoot) + (lotSize * .25);
    }

}
