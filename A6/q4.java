class Shape {
    private String color;
    private boolean filled;

    public Shape() {
        this.color = "green";
        this.filled = true;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // Getters and Setters
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        if (filled == true) {
            return "A Shape with color of " + color + " and filled";
        } else {
            return "A Shape with color of " + color + " and not filled";
        }
    }
}

class Circle extends Shape {
    protected double radius; // protected variable radius is accessible within the Circle class itself and any subclasses that may be derived from it.

    // Constructors
    public Circle() {
        this.radius = 1.0;
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    // Getters and Setters
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Methods on Circle
    public double getArea() {
        return Math.PI * (Math.pow(radius, 2));
    }
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "A Circle with radius: " + radius + ", which is a subclass of " + super.toString();
    }
}

class Rectangle extends Shape {
    protected double width;
    protected double length;

    // Constructors
    public Rectangle() {
        this.width = 1.0;
        this.length = 1.0;
    }
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    // Getters and Setters
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }

    // Methods on Rectangle
    public double getArea() {
        return width * length;
    }
    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "A Rectangle with width: " + width + " and length: " + length + ", which is a subclass of " + super.toString();
    }
}

class Square extends Rectangle {
    public Square(double side) {
        this.width = side;
        this.length = side;
    }
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    // Getters and Setters
    public double getSide() {
        return width;
    }
    public void setSide(double side) {
        this.width = side;
        this.length = side;
    }

    // Methods on Square
    // Override the setWidth() and setLength() methods to set both width and length to the same value since square is same size all around
    @Override  
    public void setWidth(double side) {
        this.width = side;
        this.length = side;
    }
    @Override
    public void setLength(double side) {
        this.width = side;
        this.length = side;
    }

    @Override
    public String toString() {
        return "A Square with side: " + getSide() + ", which is a subclass of " + super.toString();
    }
}

public class q4 {
    public static void main(String[] args) {
        Shape shape1 = new Shape(); // color green and filled
        Shape shape2 = new Shape("red", false); //color red and not filled
        System.out.println(shape1);
        System.out.println(shape2);

        // //Testing Circle
        Circle circle1 = new Circle(); // radius 1.0, color green and filled
        Circle circle2 = new Circle(2.0, "yellow", true); // radius 2.0, color green and filled
        System.out.println(circle1);
        System.out.println(circle2);

        //Testing Rectangle
        Rectangle rectangle1 = new Rectangle(); // width 1.0, length 1.0, color green and filled
        Rectangle rectangle2 = new Rectangle(2.0, 3.0, "blue", false); // width 2.0, length 3.0, color blue and not filled
        System.out.println(rectangle1);
        System.out.println(rectangle2);

        //Testing Square
        Square square1 = new Square(4.0); // side 4.0, color green and filled
        Square square2 = new Square(5.0, "purple", true); // side 5.0, color purple and filled
        System.out.println(square1);
        System.out.println(square2);
    }
}