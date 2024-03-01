package oop;

class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void speak() {
        System.out.println("Animal speakes");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("Dog says Woof!");
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("Cat says Meow!");
    }
}

class Duck extends Animal {
    public Duck(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("Duck says Quack!");
    }
}

public class Oop {
    public static void main(String[] args) {
        Dog dog = new Dog("Sparky");
        Cat cat = new Cat("Whiskers");
        Duck duck = new Duck("Donald");

        Animal[] animals = {dog, cat, duck};

        for (Animal animal : animals) {
            System.out.println(animal.getName() + " says");
            animal.speak();
        }
    }
}
