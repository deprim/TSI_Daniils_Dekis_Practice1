package lv.tsi.practice1.ex7;

public class Animals {
    public static void main(String[] args) {
        Dog dog = new Dog("Nika");
        dog.printName();
        dog.sound();

        Cat cat = new Cat("Alex");
        cat.printName();
        cat.sound();

        Fox fox = new Fox("Lyala");
        fox.printName();
        fox.sound();
    }
}
