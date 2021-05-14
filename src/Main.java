public class Main {
    public static void main(String[] args) {

        Point p1 = new Point(10,15);
        Point p2 = new Point(20,45);
        Point p3 = new Point(100,0);

        p3.setName("Oleftina");

        System.out.println(p1.getX() + " " + p1.getY());
        System.out.println(p2.getX() + " " + p2.getY());
        System.out.println(p3.getName() + " " + p3.getX() + " " + p3.getY());

        Line l1 = new Line(p1, p2);
        Line l2 = new Line(p3, p2);

        System.out.println(l1.getLength());
        System.out.println(l2.getLength());

        PolyLine polyLine = new PolyLine();

        polyLine.addPoint(p1);
        polyLine.addPoint(p2);
        polyLine.addPoint(p3);

        System.out.println(polyLine.getLength());
    }
}
