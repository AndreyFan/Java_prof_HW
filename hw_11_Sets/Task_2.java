package de.telran.modul_2.lesson_7_Sets_11sept.hw_11_Sets;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Task_2 {
    public static void main(String[] args) {
//        2 Вы приходите в больницу и получаете талончик,
//        в котором написана Ваши Ф.И.О. Но подойдя к кабинету врача,
//         Вы видите что обслуживание ведеться строго по живой очереди.
//        Кто первый пришел, тот первый и заходит к врачу и номер
//        талона не играет роли. Какой тип Set вы будете использовать
//        при решении данной задачи? Напишите пример.

// Будем использовать так как в нем данные хранятся с учетом ПОРЯДКА ДОБАВЛЕНИЯ элементов
        Set<Integer> talonNumber = new LinkedHashSet<>();
// Допустим , что с 9.00 до 10.00 были сгенерированы талоны с номерами 12....18,
// но пока люди нашли нужный кабинет в поликлинике, подошли к кабинету они уже в другой
// очередности.
        talonNumber.add(12);
        talonNumber.add(15);
        talonNumber.add(14);
        talonNumber.add(13);
        talonNumber.add(16);
        talonNumber.add(18);
        talonNumber.add(17);

        System.out.println("Живая очередь выглядит так:  " + talonNumber); // Убедимся что данные хранятся по мере их ввода

        // Организуем обслуживание с помощью итератора ,перебирая множество с первого элемента (т.е. в порядке заполнения)

        Iterator itr = talonNumber.iterator();
        while (itr.hasNext()) {
            System.out.println("Обслуживание человека с талоном номер:  " + itr.next());
        }
    }
}
