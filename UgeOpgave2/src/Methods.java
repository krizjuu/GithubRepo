import java.lang.*;
import java.util.*;

public class Methods {
    //Task 1 metode
    public static void lowestNumber() {
        Scanner s = new Scanner(System.in);
        int number1;
        int number2;
        int number3;
        System.out.println("Please enter 3 numbers");
        number1 = s.nextInt();
        System.out.println("Thank you please enter 1 more");
        number2 = s.nextInt();
        System.out.println("And now enter the last number");
        number3 = s.nextInt();
        double smallestNumber = (Math.min(Math.min(number1, number2), number3));
        System.out.println("The smallest number of the entered values are " + smallestNumber);

    }

    //Task 2 metode
    public static void getValue(int value) {
        if (value > 0) {
            System.out.println("This is a positive number");
        } else if (value == 0) {
            System.out.println("This is zero");
        } else
            System.out.println("This is a negative number");
    }

    //Task 3 metode
    public static void middleChar(String string) {
        int position;
        int length;
        //if sætning til at checke om stringen indholde whitespace
        if (string.contains(" ")) {
            System.out.println("The string below contains whitespace");
        }
        //Vi bruger modolus til at se om stringen er even eller odd
        //Hvis den er even får de vi 2 miderste bogstaver. Hvis den er er odd får vi kun det miderste
        if (string.length() % 2 == 0) {
            position = string.length() / 2 - 1;
            length = 2;
        } else {
            position = string.length() / 2;
            length = 1;
        }
        String middle = string.substring(position, (position + length));
        System.out.println(middle);
    }

    public static void area(int side1, int side2, int side3) {
        double d;
        double area1;
        d = (side1 + side2 + side3) / 2;
        area1 = Math.sqrt(d * (d - side1) * (d - side2) * (d - side3));
        System.out.println("The area of the triangle is : " + area1);
    }

    public static boolean validPass(String valid) {
        if (valid.length() < 8) {
            return false;
        }
        if (valid.startsWith("-")) {
            return false;
        }
        if (valid.contains("secret")) {
            return false;
        } else {
            char c;
            int count = 1;
            for (int i = 0; i < valid.length(); i++) {
                c = valid.charAt(i);
                if (!Character.isLetterOrDigit(c)) {
                    return false;
                } else if (Character.isDigit(c)) {
                    count++;
                }
            }
        }
        return true;
    }

    public static void printNumbers(int num) {
        int counter = 0;
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < num; j++) {
                counter++;
                System.out.print("[" + counter + "]");
            }
        }
    }
}



