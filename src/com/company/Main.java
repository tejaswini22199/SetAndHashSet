package com.company;

import java.util.*;

public class Main {
    private static Map<String,HeavenlyBody> solarSystem=new HashMap<>();
    private static Set<HeavenlyBody> planets=new HashSet<>();
    public static void main(String[] args) {
	// write your code here
       HeavenlyBody temp=new HeavenlyBody("Earth",365);
       solarSystem.put(temp.getName(), temp);
       planets.add(temp);
        temp=new HeavenlyBody("Mercury",80);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);
        temp=new HeavenlyBody("Venus",225);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);
        HeavenlyBody tempMoon=new HeavenlyBody("Moon",27);
        solarSystem.put(tempMoon.getName(), tempMoon);
        planets.add(tempMoon);
        solarSystem.get("Earth").addMoon(tempMoon);
        System.out.println("All the planets");
        for(HeavenlyBody planet:planets)
        {
            System.out.println(planet.getName());
        }
        String choice;
       // Boolean quit=false;
        while(true)
        {
            System.out.println("Enter the planet for which you need satellites\n If you want to quit enter quit");
            Scanner scanner=new Scanner(System.in);

            choice=scanner.nextLine();
           
            if(choice.equals("")) {
                System.out.println("Enter a non-empty string");
                continue;
            }
           if(choice.equals("quit"))
           {
              // quit=true;
               break;
           }
            HeavenlyBody findBody=solarSystem.get(choice);
            if(planets.contains(findBody))
            {
                System.out.println("The satellites of "+findBody.getName()+"are");
                for(HeavenlyBody satellite:findBody.getSatellites())
                {
                    System.out.println(satellite.getName());
                }
            }
            else{
                System.out.println("This planet is not there in solar system");
            }
           // scanner.close();
        }



    }
}
