package de.telran.lesson_2.hw_5_polimorfism;

public class Auto {
//  3*) Есть класс Авто со свои набором характеристик и поведения.
//   Подумайте, какие ресурсы класса Авто могут доступны только Автомеханику,
//   а какие простому Водителю.
//   Создайте интерфейсы Автомеханик и Водитель,
//   и с их помощью разделите доступ к методам класса Авто.

    private String title;
    private int yar;

    public Auto(String title, int yar) {
        this.title = title;
        this.yar = yar;
    }

    // Методы, доступные водителю
    public void drive() {
        System.out.println("Автомобиль марки  "+title+" "+ yar +" года выпуска едет");
    }

    // Методы, доступные автомеханику
    public void repair() {
        System.out.println("Автомобиль марки  "+title+" "+ yar +" года выпуска проходит Текущий ремонт");
    }

    public void oilChange() {
        System.out.println("Автомобиль марки  "+title+" "+ yar +" года выпуска проходит замену масла");
    }

    @Override
    public String toString() {
        return  title +"  " +yar + "  года выпуска";
    }
}

