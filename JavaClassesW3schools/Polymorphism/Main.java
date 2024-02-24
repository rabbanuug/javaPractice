package JavaClassesW3schools.Polymorphism;
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
        System.out.println("Hello");
    }
}