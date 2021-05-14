import java.util.ArrayList;
import java.util.List;

public class PolyLine
{
    private  List<Point> listPoint = new ArrayList<>();

    public PolyLine()
    {
    }

    public void addPoint(Point p)
    {
        listPoint.add(p);
    }

    public double getLength()
    {
        double d =0;
        for (int i=1; i < listPoint.size(); i++)
        {
            d += new Line(listPoint.get(i-1), listPoint.get(i)).getLength();
        }
        return d;
    }
}
