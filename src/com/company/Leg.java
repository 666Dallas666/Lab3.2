package com.company;
public class Leg{
    private int lngth;
    private int wde;
    private String clr;
    public Leg(int length, int wide, String colour){
        lngth = length;
        wde = wide;
        clr = colour;
    }
    public int GetLength(){
        System.out.print(lngth);
        return lngth;
    }
    public int GetWide(){
        System.out.print(wde);
        return wde;
    }
    public String GetColour(){
        System.out.print(clr);
        return clr;
    }
}