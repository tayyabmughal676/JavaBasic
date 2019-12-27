package com.gaalbaat;


//class Animal {
//    // overridden method
//    public void display(){
//        System.out.println("I am an animal");
//    }
//}
//class Dog extends Animal {
//    // overriding method
//    @Override
//    public void display(){
//        System.out.println("I am a dog");
//    }
//    public void printMessage(){
//        // this calls overriding method
//        display();
//        // this calls overridden method
//        super.display();
//    }
//}


//class Animal {
//
//    Animal(){
//        System.out.println("Animal");
//    }
//
//    String type="animal";
//    int age = 2;
//}
//class Dog extends Animal {
//
//    Dog(){
//        super();
//        System.out.println("Dog");
//    }
//    void printType() {
//        String type = "mammal";
//        System.out.println("I am a " + type);
//        System.out.println("I am an " + super.type + super.age);
//    }
//}

abstract class Animal {
    abstract void makeSound();
}
class Dog extends Animal {
    public void makeSound() {
        System.out.println("Bark bark.");
    }
}
class Cat extends Animal {
    public void makeSound() {
        System.out.println("Meows ");
    }
}


interface  Polygon {
    void getArea();
    default void getSides() {
        System.out.println("I can get sides of polygon.");
    }
}
class Rectangle implements Polygon {
    public void getArea() {
        int length = 6;
        int breadth = 5;
        int area = length * breadth;
        System.out.println("The area of the rectangle is "+area);
    }
    public void getSides() {
        System.out.println("I have 4 sides.");
    }
}
class Square implements Polygon {
    public void getArea() {
        int length = 5;
        int area = length * length;
        System.out.println("The area of the square is "+area);
    }
}




public class myApp {
    public static void main(String[] args) {
//        Dog d1 = new Dog();
//        d1.makeSound();
//        Cat c1 = new Cat();
//        c1.makeSound();

        Rectangle r1 = new Rectangle();
        r1.getArea();
        r1.getSides();

        Square s1 = new Square();
        s1.getArea();
    }
}
