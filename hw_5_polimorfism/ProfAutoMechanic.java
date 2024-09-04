package de.telran.lesson_2.hw_5_polimorfism;

public class ProfAutoMechanic implements AutoMechanic{

        private Auto auto;
        private String firstName;

    public ProfAutoMechanic(Auto auto, String firstName) {
        this.auto = auto;
        this.firstName = firstName;
    }

    @Override
    public void repair() {
        System.out.println("Автомеханик  "+firstName+" проводит Текущий ремонт автомобиля"+ auto.toString());
    }

    @Override
    public void oilChange() {
        System.out.println("Автомеханик  "+firstName+" проводит  замену масла автомобилю" +auto.toString());
    }
}
