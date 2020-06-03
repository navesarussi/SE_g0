package primitives;

import java.util.Objects;

public class Point_2D
{
    private Coordinate x;
    private Coordinate y;

    public Point_2D(Coordinate x, Coordinate y)
    {
        this.x = x;
        this.y = y;
    }

    public Point_2D()
    {
        this.x = new Coordinate(0);
        this.y = new Coordinate(0);
    }

    public Point_2D(double x, double y)
    {
        this.x = new Coordinate(x);
        this.y = new Coordinate(y);
    }

    public Point_2D(Point_2D p2d)
    {
        this.x = p2d.x;
        this.y = p2d.y;
    }

    public Coordinate getX()
    {
        return x;
    }

    public void setX(Coordinate x)
    {
        this.x = x;
    }

    public Coordinate getY()
    {
        return y;
    }

    public void setY(Coordinate y)
    {
        this.y = y;
    }

    @Override
    public String toString()
    {
        return x.toString() + ", " + y.toString();
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) // self
        {
            return true;
        }

        if (o == null || getClass() != o.getClass()) // type || null
        {
            return false;
        }
        Point_2D point_2D = (Point_2D) o;
        return x.equals(point_2D.x) && x.equals(point_2D.y);
    }
}
