public class Circle {
    public double pi = 3.14;
    public double radius;
    public double xPos;
    public double yPos;

    // parameterized constructor
    public Circle(double xPos, double yPos, double radius) {

    }

    // Accessor (setters and getters)

    // Center of circle
    public void setPos(double xPos, double yPos) {

    }

    public void setRadius(double r) {
        radius = r;
    }

    public void setColor() {

    }


    public double getRadius() {
        return radius;
    }

    public double getXPos () {

        return 
    }

    public double getYPos () {

    }

    public double getColor () {

    }

    // Operators (Area, Diameter, and circumference)
    public double calculatePerimeter() { 
        double perimeter = 2 * pi * radius; // does this count as an operator? or a an accessor?
        return perimeter;
    }

    public double calculateArea () {
        double area = Math.pow(radius, 2) * pi;
        return area;

    }

    public double getArea() {
        double area = Math.pow(radius, 2) * 3.14;
        return area;
    }

    public double getDiameter() {
        double diameter = 2 * radius;
        return diameter;
    }

    public double getCircumference() {
        double circumference = 2 * pi * radius;
        return circumference;
    }

    public boolean equals(Object otherCircle) {
        Circle other = (Circle) otherCircle;
        return this.radius == other.radius;
    }

    // 

    public static void main() {
        Circle c = new Circle(22);
        Circle b = new Circle(22);
        System.out.println(c.getRadius());
        System.out.println(c.equals(b));
        c.setRadius(13);
        System.out.println(c.getRadius());
        System.out.println(c.equals(b));
        System.out.println(c.getArea());
        System.out.println(c.getDiameter());
        System.out.println(c.getCircumference());
    
    } 
}
