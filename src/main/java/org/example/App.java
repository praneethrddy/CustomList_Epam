package org.example;

import org.example.custom.ArrayList;
public class App 
{
    public static void main( String[] args ) throws Exception
    {

        ArrayList Android = new ArrayList();
        Android.add("X-start");
        Android.add("Y-start");
        Android.add("Z-start");
        System.out.println(Android.get(0));
        System.out.println("Length:"+Android.length());
        Android.remove(0);
        System.out.println(Android.get(0));
    }
}
