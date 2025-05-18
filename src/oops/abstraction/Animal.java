package oops.abstraction;

abstract class Animal {

    private String name;
    abstract void makeSound();
}

class Dog extends Animal {

    public String getName() {
        return name;
    }

    private String name;

    Dog(String name) {
        this.name = name;
    }

    @Override
    void makeSound() {

    }
}

class Cat extends Animal {

    private String name;

    public String getName() {
        return name;
    }

    Cat(String name) {
        this.name = name;
    }

    @Override
    void makeSound() {
        System.out.println("Meow!");
    }
}
