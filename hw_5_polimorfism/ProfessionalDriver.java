package de.telran.lesson_2.hw_5_polimorfism;

public class ProfessionalDriver implements Driver {
    private Auto auto;
    private String firstName;

    public ProfessionalDriver(Auto auto, String firstName) {
        this.auto = auto;
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    @Override
    public void drive() {
        System.out.println("Водитель "+firstName+ " едет на автомобиле  "+ auto);
    }
}
