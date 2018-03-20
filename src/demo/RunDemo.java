package demo;

import java.util.Scanner;

public class RunDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Rectangle rectangle1 = new Rectangle(40 , 4);

        Rectangle rectangle2 = new Rectangle(35.9 , 3.5);

        System.out.println("Your Rectangle \n" + rectangle1.display());
        System.out.println("Perimeter of the Rectangle: " + rectangle1.getPerimeter());
        System.out.println("Area of the Rectangle: " + rectangle1.getArea());

        System.out.println("Your Rectangle \n" + rectangle2.display());
        System.out.println("Perimeter of the Rectangle: " + rectangle2.getPerimeter());
        System.out.println("Area of the Rectangle: " + rectangle2.getArea());
    }
}
