package Enum;

public enum Animal {
    Dog("собака"), Cat("кот"), Frog("жаба");

    private String translation;

    Animal(String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }
}
