/*a game where players can raise and care for a virtual pet. 
The game could include different species of pets and different activities that players can do with their pets, such as feeding, playing, and training.*/

import java.util.Scanner;

class VirtualPet {
    private String name;
    private int hunger;
    private int thirst;
    private int happiness;
    private int tiredness;
    private int energy;
    public VirtualPet(String name) {
        this.name = name;
        hunger = 50;
        thirst = 50;
        happiness = 50;
        tiredness = 50;
        energy = 100;
    }
    public void feed() {
        hunger -= 10;
        thirst += 5;
        energy -= 5;
    }
    public void drink() {
        thirst -= 10;
        energy -= 5;
    }
    public void play() {
        happiness += 10;
        hunger += 5;
        thirst += 5;
        tiredness += 10;
    }
    public void sleep() {
        tiredness -= 10;
        energy += 10;
    }
    public void status() {
        System.out.println("Name: " + name);
        System.out.println("Hunger: " + hunger);
        System.out.println("Thirst: " + thirst);
        System.out.println("Happiness: " + happiness);
        System.out.println("Tiredness: " + tiredness);
        System.out.println("Energy: " + energy);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of your pet: ");
        String name = sc.nextLine();
        VirtualPet pet = new VirtualPet(name);
        while (true) {
            System.out.println("1. Feed\n2. Drink\n3. Play\n4. Sleep\n5. Status\n6. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    pet.feed();
                    break;
                case 2:
                    pet.drink();
                    break;
                case 3:
                    pet.play();
                    break;
                case 4:
                    pet.sleep();
                    break;
                case 5:
                    pet.status();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
