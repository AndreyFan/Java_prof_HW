package de.telran.lesson_3.statics.hw_7_Enum;

public class EnumManths {

    enum Month {
        JANUARY("Январь", "Зима"),
        FEBRUARY("Февраль", "Зима"),
        MARCH("Март", "Весна"),
        APRIL("Апрель", "Весна"),
        MAY("Май", "Весна"),
        JUNE("Июнь", "Лето"),
        JULY("Июль", "Лето"),
        AUGUST("Август", "Лето"),
        SEPTEMBER("Сентябрь", "Осень"),
        OCTOBER("Октябрь", "Осень"),
        NOVEMBER("Ноябрь", "Осень"),
        DECEMBER("Декабрь", "Зима");

        private final String rusName;
        private final String season;

        Month(String rusName, String season) {
            this.rusName = rusName;
            this.season = season;
        }

        public String getRusName() {
            return rusName;
        }

        public String getSeason() {
            return season;
        }

        // Метод, который возвращает рекомендации по питанию в зависимости от месяца и сезона
        public String getRecommendation() {
            switch (season) {
                case "Зима":
                    return "Больше теплого питья и пищи с высоким содержанием белков.";
                case "Весна":
                    return "Кушайте больше свежих овощей и фруктов , детям и пожилым людям можно дополнительно принимать витаминные комплексы.";
                case "Лето":
                    return "Питайтесь разнообразно : побольше каш и сезонных ягод и овощей.";
                case "Осень":
                    return "Побольше жирной рыбы , сезонных овощей. ";
                default:
                    return "Не корректный ввод.";
            }
        }
    }

}
