package com.company;

import java.util.HashSet;
import java.util.Set;

public class HeavenlyBody {
    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;
    HeavenlyBody(String name,double orbitalPeriod)
    {
        this.name=name;
        this.orbitalPeriod=orbitalPeriod;
        satellites=new HashSet<HeavenlyBody>();
    }
    public String getName()
    {
        return this.name;
    }
    public double getOrbitalPeriod()
    {
        return this.orbitalPeriod;
    }
    public boolean addMoon(HeavenlyBody moon)
    {
        return this.satellites.add(moon);
    }
    public Set<HeavenlyBody> getSatellites()
    {
        return new HashSet<>(this.satellites);
    }
}
