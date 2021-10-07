import java.util.*;

public class Tamagochi {
    private static int mood;
    private static int age;
    private static String name;
    private static int energy;
    private static int hunger;

    public static void play() {
        if (energy >= 3 && hunger >= 4) {
            System.out.println("The pet had a fun time playing with you its is now happy");
            System.out.println("Its mood rose with 1");
            System.out.println("Its hunger fell with 1");
            mood++;
            hunger--;
        } else if (energy < 3 && hunger >= 4) {
            System.out.println("Your pet is too tired and didnt want to play");
            System.out.println("Its mood fell with 1");
            mood--;
        }  else if (energy >= 3 && hunger < 3) {
            System.out.println("Your pet is too hungry to play");
            System.out.println("Its mood fell with 1");
            mood--;
        } else
            System.out.println("Your pet needs sleep and food");
            System.out.println("Its mood fell with 1");
            mood--;
    }

    public static void feed() {
        System.out.println("You fed your pet some delicious food");
        System.out.println("Its hunger rose with 1");
        System.out.println("Its mood rose with 1");
        hunger++;
        mood++;
    }

    public static void sleep() {
        System.out.println("Your pet is now sleeping");
        System.out.println("Its mood rose with 1");
        System.out.println("Its hunger fell with 1");
        System.out.println("Your tamagochi aged up");
        mood++;
        hunger--;
        age++;

    }

    public Tamagochi(String name, int mood, int hunger, int age, int energy) {
        Tamagochi.name = name;
        Tamagochi.mood = mood;
        Tamagochi.hunger = hunger;
        Tamagochi.age = age;
        Tamagochi.energy = energy;
    }

    public static String getName() {
        return name;
    }

    public static int getMood() {
        return mood;
    }

    public static int getHunger() {
        return hunger;
    }

    public static int getAge() {
        return age;
    }

    public static int getEnergy() {
        return energy;
    }

    public static void animalMood() {
        if (getMood() >= 7) {
            System.out.println("Your pet is happy!");
        } else if (getMood() < 6 && getMood() >= 3) {
            System.out.println("Your pet is content");
        } else {
            System.out.println("Your pet is unhappy");
        }
    }
    public static void message() {
        System.out.println();
        System.out.println("Please enter action for your Tamagochi");
        System.out.println("Sleep,Feed,Play");
        System.out.println("Check its Mood by typing mood/Mood");
        System.out.println("Check all of its stats by typing check/Check");
        System.out.println("Or you can type exit to shutdown the program");
        System.out.println();
    }

    public static void createAnimal() {
        Random rd = new Random();
        Scanner s = new Scanner(System.in);
        int random = rd.nextInt(10) + 1;
        System.out.println("Please chose whether u want a Cat or a Dog as your Tamagochi");
        String userInput = s.nextLine();
        boolean loopChecker = false;
        while (!loopChecker) {
            boolean catCheck = userInput.equals("cat") || userInput.equals("Cat") || userInput.equals("CAT");
            boolean dogCheck = userInput.equals("dog") || userInput.equals("Dog") || userInput.equals("DOG");
            if (!catCheck && !dogCheck) {
                System.out.println("You have typed " + userInput);
                System.out.println("Please input Cat or Dog");
                userInput = s.nextLine();
            } else if (catCheck) {
                System.out.println("You have chosen a Cat");
                Cat.meow();
                System.out.println("Please enter your Cats name");
                String catName = s.nextLine();
                Cat animal = new Cat(catName, random, 10, 0,10);
                System.out.println(animal);
                animalMood();
                loopChecker = true;
            } else {
                System.out.println("You have chosen a Dog");
                Dog.bark();
                System.out.println("Please enter your Dogs name");
                String dogName = s.nextLine();
                Dog animal = new Dog(dogName, random, 10, 0, 10);
                System.out.println(animal);
                animalMood();
                loopChecker = true;
            }
        }
    }

    public static void checkAnimal(){
        System.out.println("Name: " + getName());
        System.out.println("Mood: " + getMood());
        System.out.println("Hunger: " + getHunger());
        System.out.println("Age: " + getAge());
        System.out.println("Energy: " + getEnergy());
    }

    public static void playing() {
        Scanner s = new Scanner(System.in);
        message();
        String userInput = s.nextLine();
        while (true) {
            boolean playCheck = userInput.equals("play") || userInput.equals("Play");
            boolean sleepCheck = userInput.equals("sleep") || userInput.equals("Sleep");
            boolean feedCheck = userInput.equals("feed") || userInput.equals("Feed");
            boolean moodCheck = userInput.equals("mood") || userInput.equals("Mood");
            boolean exitCheck = userInput.equals("exit") || userInput.equals("Exit");
            boolean animalCheck = userInput.equals("check") || userInput.equals("Check");
            if (exitCheck) {
                System.out.println("See ya next time");
                break;
            }
            if (!playCheck && !sleepCheck && !feedCheck && !moodCheck && !animalCheck) {
                System.out.println("You have entered " + userInput);
                System.out.println("Please select a valid action");
                userInput = s.nextLine();
            } else if (playCheck) {
                play();
                animalMood();
                message();
                userInput = s.nextLine();
            } else if (sleepCheck) {
                sleep();
                animalMood();
                message();
                userInput = s.nextLine();
            } else if (feedCheck) {
                feed();
                animalMood();
                message();
                userInput = s.nextLine();
            } else if (animalCheck) {
                checkAnimal();
                message();
                userInput = s.nextLine();
            }
            if (age >= 5) {
                System.out.println("Your pet got old and die");
                break;
            }
        }
    }
}



