package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Exercise 1:
        System.out.println(" --- Exercise 1: --- ");
        Car myCar = new Car();
        myCar.honk();
        myCar.display();
        System.out.println();

        //Exercise 1 (Challenge):
        System.out.println(" --- Exercise 1 (Challenge): --- ");
        Bicycle bike = new Bicycle();
        System.out.print("Bicycle says: ");
        bike.honk();
        System.out.print("Bicycle says: ");
        bike.ringBell();
        System.out.println();

        //Exercise 2:
        System.out.println(" --- Exercise 2: --- ");
        Circle myCircle = new Circle();
        System.out.println(myCircle.display());

        Rectangle myRectangle = new Rectangle();
        System.out.println(myRectangle.display());
        System.out.println();

        //Exercise 2 (Challenge):
        System.out.println(" --- Exercise 2 (Challenge): --- ");
        Dog dog = new Dog();
        dog.breathe();
        dog.makeSound();
        System.out.println();

        //Exercise 3:
        System.out.println(" --- Exercise 3: --- ");
        Editor myEditor = new Editor();
        CodeEditor myCodeEditor = new CodeEditor();
        Editor polyEditor = new CodeEditor(); // Polymorphism

        System.out.println("--- Regular Editor ---");
        myEditor.openFile();

        System.out.println("\n--- Code Editor ---");
        myCodeEditor.openFile();

        System.out.println("\n--- Polymorphic Editor ---");
        polyEditor.openFile();
        System.out.println();

        //Exercise 3 (Challenge):
        System.out.println(" --- Exercise 3 (Challenge): --- ");
        GameCharacter civilian = new GameCharacter();
        ArmoredCharacter hero = new ArmoredCharacter();
        System.out.println("Civilian character takes " + civilian.takeDamage(100) + " damage. New health: " + civilian.getHealth());
        System.out.println("Hero character takes " + hero.takeDamage(100) + " damage. New health: " + hero.getHealth());
        System.out.println();

        //Exercise 4:
        System.out.println(" --- Exercise 4: --- ");
        CheckingAccount myChecking = new CheckingAccount(100.0);
        myChecking.deductMonthlyFee(); // This line cannot be run
        System.out.println();
    }
}