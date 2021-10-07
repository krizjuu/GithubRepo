public class Cat extends Tamagochi {


    public Cat(String name, int mood, int hunger, int age, int energy) {
        super(name, mood, hunger, age, energy);
    }

    public static void meow(){
        System.out.println("Meow!");
    }
    @Override
    public String toString(){
        return "Name: " + getName() + "\n" +
                "Energy: " + getEnergy() + "\n" +
                "Hunger: " + getHunger() + "\n" +
                "Age: " + getAge() + "\n" +
                "Mood: " + getMood();
    }
}
