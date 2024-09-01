package de.telran.lesson_2.hw_4_interface_26_08;

public class MainTransport {
    public static void main(String[] args) {
        Bus bus=new Bus("Автобус фирмы МАН", 2015);
        bus.service();
        bus.repair();
        bus.rollAble();
        bus.transportPassenger();
        System.out.println();

        Truck truck= new Truck("Грузовик фирмы Белаз", 2012);
        truck.service();
        truck.repair();
        truck.rollAble();
        truck.TransportCargoes();
        System.out.println();

        Car car=new Car("Кроссовер Тойота", 2020);
        car.service();
        car.repair();
        car.rollAble();
        car.TransportCargoes();
        car.transportPassenger();
        System.out.println();

        Ship ship=new Ship("Паром", 1997);
        ship.service();
        ship.repair();
        ship.swimAble();
        ship.TransportCargoes();
        System.out.println();

        Airpalne airpalne=new Airpalne("Грузовой самолёт Ан-124", 2012);
        airpalne.service();
        airpalne.repair();
        airpalne.flyAbly();
        airpalne.TransportCargoes();
    }
}
