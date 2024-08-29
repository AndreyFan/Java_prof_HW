package de.telran.lesson_2.hw_3_23august_abstractClass;

public class MainTranslator {
    public static void main(String[] args) {
        Translator translator1 = new EnglishRussishTranslator(" Tom ", 23, " man ", " diplom garvard ");
        translator1.certificationApostille();
        translator1.abilityToTranslate();

        Translator translator2 = new RussischDeuschTransator(" Peter ", 60, " man ", " diplom mgimo ");
        translator2.certificationApostille();
        translator2.abilityToTranslate();
    }

    }

