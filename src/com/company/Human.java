package com.company;
public class Human {
    public static void main(String[] args) {
        Leg Нога = new Leg(60, 10, "White");
        Hand Рука = new Hand(50, 8, "White");
        Head Голова = new Head("White", "Blue", "Brown");
        Нога.GetColour();
        System.out.println("");
        Нога.GetLength();
        System.out.println("");
        Нога.GetWide();
        System.out.println("");
        Рука.GetColour();
        System.out.println("");
        Рука.GetLength();
        System.out.println("");
        Рука.GetWide();
        System.out.println("");
        Голова.Getcolour();
        System.out.println("");
        Голова.Geteyecolour();
        System.out.println("");
        Голова.Gethaircolour();
    }
}
