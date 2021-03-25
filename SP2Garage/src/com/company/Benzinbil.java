package com.company;

public class Benzinbil extends Bil{
    private int octaneNumber;
    private double kmPrL;

    public Benzinbil(String registrationNumber, String brand, String model, int year, int numberDoors, int octaneNumber, double kmPrL) {
        super(registrationNumber, brand, model, year, numberDoors);
        this.octaneNumber = octaneNumber;
        this.kmPrL = kmPrL;
    }

    public int getOctaneNumber() {
        return octaneNumber;
    }

    public void setOctaneNumber(int octaneNumber) {
        this.octaneNumber = octaneNumber;
    }

    public double getKmPrL() {
        return kmPrL;
    }

    public void setKmPrL(int kmPrL) {
        this.kmPrL = kmPrL;
    }

    @Override
    public String toString() {
        return "Benzinbil{" +
                "kmPrL=" + kmPrL +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", numberDoors=" + numberDoors +
                '}';
    }

    @Override
    public double greenOwnershipTax(){
        double charges=0;
        if ( kmPrL>=20 && kmPrL<50){
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


