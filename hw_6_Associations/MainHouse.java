package de.telran.lesson_2.hw_6_Associations;

public class MainHouse {
    public static void main(String[] args) {
        // создадим список жильцов дома
        Resident[] residents= new Resident[3];
        residents[0]= new Resident("Peter");
        residents[1]= new Resident("Seva");
        residents[2]= new Resident("Olga");

        // создаём компоненты дома
        Wall wall=new Wall("Пенобетон");
        Roof roof=new Roof("Металлочерепица");
        Door door=new Door("Дубовые двери");
        Window window=new Window("Металлопластик");

        House house=new House(roof, wall, door, window, residents);
        house.printinfoOfHouse();
    }
}
