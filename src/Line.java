public class Line
{
    private Point pStart;
    private Point pEnd;

    public Line(Point point1, Point point2)
    {
        pStart = point1;
        pEnd = point2;
    }

    public Point getpStart() {
        return pStart;
    }

    public Point getpEnd() {
        return pEnd;
    }

    public double getLength()
    {
        return Math.sqrt(Math.pow(pStart.getX() - pEnd.getX(),2)+Math.pow(pStart.getY() - pEnd.getY(),2));
    }
}
