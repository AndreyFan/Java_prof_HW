package de.telran.lesson_2.hw_3_23august_abstractClass;

public class EnglishRussishTranslator extends Translator {
    String diplom;
    public EnglishRussishTranslator(String name, int age, String gender, String diplom) {
        super(name, age, gender);
        this.diplom=diplom;
    }

    @Override
    public void abilityToTranslate() {
        System.out.println(name+" имеет  "+diplom+ " и  переводит с английского на русский");
    }
}
