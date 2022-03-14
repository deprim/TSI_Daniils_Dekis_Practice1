package lv.tsi.practice1.ex7;

public class Cat implements lv.tsi.practice1.ex7.Animal, lv.tsi.practice1.ex7.Domestic {
    private final String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void sound() {
        System.out.println("Meow");
    }

    @Override
    public void printName() {
        System.out.println("Cat's name is " + name);
    }
}
