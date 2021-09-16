import java.util.Scanner;
import java.lang.*;


public class MethodsProject {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int value;
        int side1;
        int side2;
        int side3;
        String valid;
        int num;
        //Task 1
        Methods.lowestNumber();
        //Task 2
        System.out.println("Please enter a number to check whether it is positive, negative or zero");
        value = s.nextInt();
        Methods.getValue(value);
        //Task 3
        Methods.middleChar("Java");
        Methods.middleChar("Ja a");
        Methods.middleChar("Jaa");
        //Task 4
        System.out.println("Please enter 3 sides for a triangle");
        side1 = s.nextInt();
        System.out.println("Please enter 1 more");
        side2 = s.nextInt();
        System.out.println("Please enter the last side of the triangle");
        side3 = s.nextInt();
        Methods.area(side1,side2,side3);
        //Task 5
        System.out.println("Please enter a valid password");
        valid = s.next();
        if (Methods.validPass(valid)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        //Task 6
        System.out.println("Please enter a number");
        num = s.nextInt();
        Methods.printNumbers(num);
    }
}
