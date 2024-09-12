package de.telran.modul_2.lesson_7_Sets_11sept.hw_11_Sets;

import java.lang.annotation.Target;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Task_1 {
    public static void main(String[] args) {
//        Task_1. Вы приходите в гос.учреждение и регистрируетесь,
//                получив талон с номером в очереди. Обслуживание будет проводиться
//        строго по номеру в порядке возрастания. Какой тип Set вы будете
//        использовать при решении данной задачи? Напишите пример.

        //Оптимально использовать TreeSet так как в нем элементы сортируются по возрастанию
        Set<Integer> talonNumber = new TreeSet<>();
        talonNumber.addAll(Set.of(8, 7, 3, 4, 15, 6, 1)); // номера не подряд (допустим некоторые посетители не стали ожидать)
        System.out.println(talonNumber); // проверка, что все элементы хранятся упорядочено

        // Организуем обслуживание с помощью итератора ( начиная с максимального номера талона)
        Iterator itr = ((TreeSet<Integer>) talonNumber).descendingIterator();
        while (itr.hasNext()) {
            System.out.println("Обслуживание человека с талоном номер:  " + itr.next());
        }


    }

}
