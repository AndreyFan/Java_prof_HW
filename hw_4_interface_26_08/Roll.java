package de.telran.lesson_2.hw_4_interface_26_08;

public interface Roll {
    public default void rollAble(){
        System.out.println("перемещается по суше на колёсах");
    }
}
