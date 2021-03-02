public class Ray
{
    private Point p; 
    private Vector v;
    public Ray(Point P, Vector V)
    {
        p = P;
        v = V.normalize();
    }
    public Point getPosition()
    {
        return p;
    }
    public Vector getDirection()
    {
        return v;
    }
    public Point evaluate(double dist)
    {
        return p.add(v.scale(dist));
    }
}
