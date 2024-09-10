package de.telran.lesson_3.statics.hw_7_Enum;

import java.util.Scanner;

public class MainManths {
    public static void main(String[] args) {

        EnumManths.Month curMonth = EnumManths.Month.APRIL;
        System.out.println("Название месяца на русском языке: " + curMonth.getRusName());
        System.out.println("Сезон: " + curMonth.getSeason());
        System.out.println("Рекомендация: " + curMonth.getRecommendation());
    }
}
