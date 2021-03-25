package com.company;

public class Dieselbil extends Bil {

    private boolean particulateFilter;
    private double kmPrL;

    public Dieselbil(String registrationNumber, String brand, String model, int year, int numberDoors, boolean particulateFilter, double kmPrL) {
        super(registrationNumber, brand, model, year, numberDoors);
        this.particulateFilter = particulateFilter;
        this.kmPrL = kmPrL;
    }

    public boolean isParticulateFilter() {
        return particulateFilter;
    }

    public void setParticulateFilter(boolean particulateFilter) {
        this.particulateFilter = particulateFilter;
    }

    public double getKmPrL() {
        return kmPrL;
    }

    public void setKmPrL(double kmPrL) {
        this.kmPrL = kmPrL;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", kmPrL=" + kmPrL +
                '}';
    }

    @Override
    public double greenOwnershipTax() {
        double charges = 0;
        double tax=1000;
            if (kmPrL>= 20 && kmPrL <= 50) {
                charges = 330 + 130;
            } else if (kmPrL>= 15 && kmPrL <= 20) {
                charges = 1050 + 1390;
            } else if (kmPrL >= 10 && kmPrL <= 15) {
                charges = 2340 + 1850;
            } else if (kmPrL>= 5 && kmPrL <= 10) {
                charges = 5500 + 2770;
            } else if (kmPrL<5) {
                charges = 10470 + 15260;
            }
         if(!particulateFilter) {
            charges= charges+tax;
        }
        return charges;
        }


    }

