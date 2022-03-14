package lv.tsi.practice1.ex6;

public class Animals {
    public static void main(String[] args) {
        lv.tsi.practice1.ex6.Animal cat = new lv.tsi.practice1.ex6.Cat();
        cat.sound();

        lv.tsi.practice1.ex6.Animal dog = new lv.tsi.practice1.ex6.Dog();
        dog.sound();

        lv.tsi.practice1.ex6.Animal fox = new lv.tsi.practice1.ex6.Fox();
        fox.sound();
    }
}
