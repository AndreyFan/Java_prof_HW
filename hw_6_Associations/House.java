package de.telran.lesson_2.hw_6_Associations;

public class House {
//    задание 1:
//    Есть класс Дом и в нем живет много объектов типа Житель.
//    У Дома так же есть объекты Крыша, Стены, Окна, Двери.
//    Создайте класс для сущности Дом и ассоциированные с ни объекты, входящий в него.
//    Подумайте какие из них агрегируются с домом, а какие связаны отношением Композиция.
    private Roof roof; // композиция
    private Wall wall; // композиция
    private Door door; // композиция
    private Window window; // композиция
    private Resident[] residents;  // агрегация

    public House(Roof roof, Wall wall, Door door, Window window, Resident[] residents) {
        this.roof = roof;
        this.wall = wall;
        this.door = door;
        this.window = window;
        this.residents = residents;
    }

    public void printinfoOfHouse(){
        System.out.println("Дом с крышей типа: " + roof.getType());
        System.out.println("Материал стен: " + wall.getMaterial());
        System.out.println("Тип окон: " + window.getType());
        System.out.println("Тип двери: " + door.getDoorType());
        System.out.println("Жители дома:");
        for (Resident resident : residents) {
            System.out.println("- " + resident.getName());
        }
    }
}
