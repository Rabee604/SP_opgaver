package com.company;

public class Elbil extends Bil{

    private double batterikapacitetKWh;
    private double maxKm;
    private double whPrKm;


    public Elbil(String registrationNumber, String brand, String model, int year, int numberDoors, double batterikapacitetKWh, double maxKm, double whPrKm) {
        super(registrationNumber, brand, model, year, numberDoors);
        this.batterikapacitetKWh = batterikapacitetKWh;
        this.maxKm = maxKm;
        this.whPrKm = whPrKm;
    }

    public double getBatterikapacitetKWh() {
        return batterikapacitetKWh;
    }

    public void setBatterikapacitetKWh(double batterikapacitetKWh) {
        this.batterikapacitetKWh = batterikapacitetKWh;
    }

    public double getMaxKm() {
        return maxKm;
    }

    public void setMaxKm(double maxKm) {
        this.maxKm = maxKm;
    }

    public double getWhPrKm() {
        return whPrKm;
    }

    public void setWhPrKm(double whPrKm) {
        this.whPrKm = whPrKm;
    }

    @Override
    public String toString() {
        return "Elbil{" +
                "registrationNumber='" + registrationNumber + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", numberDoors=" + numberDoors +
                ", batterikapacitetKWh=" + batterikapacitetKWh +
                ", maxKm=" + maxKm +
                ", whPrKm=" + whPrKm +
                '}';
    }
    @Override
    public double greenOwnershipTax(){
        double kmPrL= 100/(whPrKm / 91.25);
        double charges=0;
        if ( kmPrL>=20 && kmPrL<=50){
            charges=330;
        }else if ( kmPrL>=15 && kmPrL<20) {
            charges = 1050;
        }else if ( kmPrL>=10 && kmPrL<15) {
            charges = 2340;
        }else if ( kmPrL>=5 && kmPrL<10) {
            charges = 5500;
        }else if ( kmPrL<5) {
            charges = 10470;
        }

        return charges;
    }
}
