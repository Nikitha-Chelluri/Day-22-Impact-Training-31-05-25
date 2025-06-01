// Write a java program to create a class Shape with methods getArea() and getPerimeter(). 
// create three subclasses: Circle, Rectangle, and Triangle.
// Override the getArea() and getPerimeter() methods in each class to calculate
// return the area and perimeter of the respective shapes.  

import java.util.*;
class shape {
    public double getArea(double len, double width) {
        double area = len * width;
        return area;
    }
    public double getPerimeter(double len, double width) {
        double perimeter = len + width;
        return perimeter;
    }
}

class Circle extends shape {
    public double getArea(double radius) {
        double area = (22/7) * radius * radius;
        return area;
    }
    public double getPerimeter(double radius) {
        double perimeter = 2 * (22/7) * radius;
        return perimeter;
    }
}

class Rectangle extends shape {
    public double getArea(double len, double width) {
        double area = len * width;
        return area;
    }
    public double getPerimeter(double len, double width) {
        double perimeter = len + width;
        return perimeter;
    }
}

class Triangle extends shape {
    public double getArea(double len, double width) {
        double area = 0.5 * (len * width);
        return area;
    }
    public double getPerimeter(double a, double b, double c) {
        double perimeter = a+b+c;
        return perimeter;
    }
}

class Area {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double len = s.nextInt();
        double width = s.nextInt();
        Rectangle rec = new Rectangle();
        System.out.println("Area : "+rec.getArea(len, width));
        System.out.println("Peri : "+rec.getPerimeter(len, width));
    }
}
