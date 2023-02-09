package String;

public class ♦CatDog {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.catchCat(cat);

    }

public static class Cat {

    public void sayHello() {
        System.out.println("Мяу!");
    }
}

public static class Dog {

    public void sayHello() {
        System.out.println("Гав!");
    }

    public void catchCat(Cat d) {
        Dog dog = new Dog();

        System.out.println("Кошка поймана");
        dog.sayHello();
        d.sayHello();


    }
}
}

