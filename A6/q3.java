class Circle {
    // protected double radius; is used to declare the radius variable in the Circle class. 
    //This means that the radius variable is accessible within the Circle class itself and any subclasses that may be derived from it.
    protected double radius;   
    protected String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public double getArea() {
        return Math.PI * (Math.pow(radius, 2));
    }

    // getters & setters
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
}

class Cylinder extends Circle {
    private double height = 1.0;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);  // inheiritance of radius from Circle class
        this.height = height;
    }
    public double getVolume() {
        return getArea() * height;
    }

    // getters & setters
    public void setHeight(double height) {
        this.height = height;
    }
    public double getHeight() {
        return height;
    }

    // Override the getArea() method to compute the surface area for Cylinder
    @Override
    public double getArea() {
        // Calculate the surface area of the cylinder
        return 2 * Math.PI * radius * height + 2 * super.getArea();
    }
}

public class q3 {
    public static void main(String[] args) {
        Circle circle1 = new Circle(2.0, "blue");
        System.out.println("Circle Area: " + circle1.getArea());
        Cylinder cylinder1 = new Cylinder(2.0, "blue", 1.0);
        System.out.println("Cylinder Volume: " + cylinder1.getVolume());
        System.out.println("Cylinder Surface Area: " + cylinder1.getArea());
    }
}