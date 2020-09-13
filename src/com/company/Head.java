package com.company;
public class Head{
    private String clr;
    private String eyeclr;
    private String hairclr;
    public Head(String colour, String eyecolour, String haircolour){
        clr = colour;
        eyeclr = eyecolour;
        hairclr = haircolour;
    }
    public String Getcolour(){
        System.out.print(clr);
        return clr;
    }
    public String Geteyecolour(){
        System.out.print(eyeclr);
        return eyeclr;
    }
    public String Gethaircolour(){
        System.out.print(hairclr);
        return hairclr;
    }
}
