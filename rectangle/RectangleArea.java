package rectangle;

import java.util.Scanner;

class Rectangle {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area() {
        return this.length * this.width;
    }
}

class RectangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double length = sc.nextDouble();
        double width = sc.nextDouble();
        sc.close();

        Rectangle rectangle = new Rectangle(length, width);

        System.out.println(rectangle.area());
    }
}