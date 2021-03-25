package com.company;

public class Main {

    public static void main(String[] args) {
        Garage garage = new Garage();

        garage.addCar(new Benzinbil("CN1234","honda civic","TDI-1",2020,5,2,4));
        garage.addCar(new Dieselbil("RC89-01","Opel","Astra 1.2T 110HK Edition+",2021,4,false,4));
        garage.addCar(new Elbil("RD89-01","Mazda","MX-30",2022,2,2,20,900));
        System.out.println(garage.toString());
        System.out.println("Den samlede grønne afgift for alle bilerne i garagen "+ garage.beregnGrønAfgiftForBilpark());
    }
}
