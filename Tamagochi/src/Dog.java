public class Dog extends Tamagochi {


    public Dog(String name, int mood, int hunger, int age, int energy) {
        super(name, mood, hunger, age, energy);
    }

    public static void bark() {
        System.out.println("Wuf!");
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
