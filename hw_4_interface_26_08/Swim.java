package de.telran.lesson_2.hw_4_interface_26_08;

public interface Swim {
    public default void swimAble(){
        System.out.println("плавает по морям и океанам");
    }
}
