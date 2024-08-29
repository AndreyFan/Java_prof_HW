package de.telran.lesson_2.hw_3_23august_abstractClass;

public abstract class Translator {
    String name;
    int age;
    String gender;

    public Translator(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public abstract void abilityToTranslate();
    public void certificationApostille(){
        System.out.println("Переводчик "+name + "  имеет возможность заверения Апостилем");
    }
}
