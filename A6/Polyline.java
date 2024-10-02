import java.util.ArrayList;

public class Polyline {
    private ArrayList<Point> points;    // arrayList holds the point

    public Polyline() {
        points = new ArrayList<>();
    }
    public void appendPoint(Point point) {
        points.add(point);
    }
    public void removePoint(Point point) {
        points.remove(point);
    }
    public void clearPoints() {
        points.clear();
    }
    public int getAmountOfPoints() {
        return points.size();
    }
    public ArrayList<Point> getPoints() {
        return points;
    }
    public double getLength() {
        double length = 0;
        for (int i = 0; i < points.size() - 1; i++) {
            Point currentPoint = points.get(i);
            Point nextPoint = points.get(i + 1);
            double distance = Math.sqrt(Math.pow(nextPoint.getX() - currentPoint.getX(), 2) + Math.pow(nextPoint.getY() - currentPoint.getY(), 2));
            length += distance;
        }
        return length;
    }
    public static void main(String[] args) {
        Polyline lines = new Polyline();
        lines.appendPoint(new Point(1, 5));
        lines.appendPoint(new Point(2, 6));
        lines.appendPoint(new Point(3, 7));
        System.out.println(lines.getAmountOfPoints());

        double length = lines.getLength();
        System.out.println("Length of the polyline: " + length);
        
        ArrayList<Point> listOfPoints = lines.getPoints();
        for (Point point : listOfPoints) {
            System.out.println("(" + point.getX() + ", " + point.getY() + ")");
        }
    }
}


class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
}