package com.company;

import java.util.ArrayList;

public class Garage {

    ArrayList<Bil> bils = new ArrayList<>();


    public void addCar(Bil b) {

        bils.add(b);

    }

    @Override
    public String toString() {
        String biler ="";
        for (Bil b : bils) {
            biler= biler+b.toString()+"\n";
        }
        return biler;
    }

    public double beregnGrønAfgiftForBilpark(){
        double sum =0;

        for(Bil s : bils){
            sum= sum+s.greenOwnershipTax();

        }
        return sum;
    }
}

