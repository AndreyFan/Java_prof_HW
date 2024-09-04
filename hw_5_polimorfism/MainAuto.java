package de.telran.lesson_2.hw_5_polimorfism;

public class MainAuto {
        public static void main(String[] args) {
            Auto auto = new Auto("BMV", 2010);
            Auto auto1=new Auto("Nissan", 2011);

            Driver driver = new ProfessionalDriver(auto, "Peter");
            driver.drive();

            AutoMechanic autoMechanic = new ProfAutoMechanic(auto1, "Igor");
            autoMechanic.repair();
            autoMechanic.oilChange();

    }

}
