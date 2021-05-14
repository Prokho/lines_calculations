public class Point
{
    private int x;
    private int y;
    private String name;

    public Point(int v1, int v2)
    {
        x = v1;
        y = v2;
    }

    public void setName(String n)
    {
        name = n;
    }

    public String getName()
    {
        return name;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
