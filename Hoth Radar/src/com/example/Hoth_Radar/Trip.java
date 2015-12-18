package com.example.Hoth_Radar;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Iterator;

/**
 * Created by Bill on 12/18/2015.
 */
public class Trip implements Iterable<Loco>
{
    ArrayList<Loco> plan;
    String name;
    String details;
    public Trip(String nick, String details)
    {
        name = nick;
        this.details = details;
        plan = new ArrayList<Loco>();
    }

    public void addLocation(long xCoordinate, long yCoordinate, GregorianCalendar start, GregorianCalendar end)
    {
        plan.add(new Loco(xCoordinate, yCoordinate, start, end));
    }

    @Override
    public Iterator<Loco> iterator()
    {
        return plan.iterator();
    }
}
