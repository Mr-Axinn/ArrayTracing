public class Point
{
    private double x;
    private double y;
    private double z;
    public Point(double newX, double newY, double newZ)
    {
        x = newX;
        y = newY;
        z = newZ;
    }
    public double getDX()
    {
        return x;
    }
    public double getDY()
    {
        return y;
    }
    public double getDZ()
    {
        return z;
    }
    public Point add(Vector v)
    {
        return new Point(x+v.getDX(), y+v.getDY(), z+v.getDZ());
    }
    public Vector subtract(Point p)
    {
        return new Vector(x - p.getDX(), y - p.getDY(), z - p.getDZ());
    }
}
