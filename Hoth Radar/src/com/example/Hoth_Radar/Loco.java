package com.example.Hoth_Radar;

import java.util.GregorianCalendar;

/**
 * Created by Bill on 12/18/2015.
 */
public class Loco
{
    long xCoordinate;
    long yCoordinate;
    GregorianCalendar start;
    GregorianCalendar end;

    public Loco(long xCoordinate, long yCoordinate, GregorianCalendar start, GregorianCalendar end)
    {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.start = start;
        this.end = end;
    }

    public long getxCoordinate()
    {
        return xCoordinate;
    }

    public long getyCoordinate()
    {
        return yCoordinate;
    }

    public GregorianCalendar getStart()
    {
        return start;
    }

    public GregorianCalendar getEnd()
    {
        return end;
    }
}
