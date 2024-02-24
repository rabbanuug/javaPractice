//package JavaClassesW3schools.Polymorphism; // face problem when tried to run code on Intellij idea
class Animal{
    public void animalSound(){
        System.out.println("Animal makes sound");
    }

}

class Pig extends Animal {
    public void animalSound() {
        System.out.println("Pig says : Wee wee");
    }
}

class Cat extends Animal{
    public void animalSound(){
        System.out.println("Cat says: meow");
    }
}

class Main{
    public static void main(String[] args){
        Animal animal = new Animal();
        Pig pig = new Pig();
        Cat cat = new Cat();

        animal.animalSound();
        pig.animalSound();
        cat.animalSound();
        
    }
}