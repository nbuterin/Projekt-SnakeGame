package com.company;

public class PointKlasa {
    private int x;
    private int y;

    /*konstruktor*/

    public PointKlasa()
    {
        x=0;
        y=0;
    }

    public PointKlasa(int x, int y)
    {
        this.x=x;
        this.y=y;
    }

    public void xOs()
    {
        this.x=x;
    }

    public void yOs()
    {
        this.y=y;
    }

    public int dohvatiX()
    {
        return x;
    }

    public int dohvatiY()
    {
        return y;
    }
}
