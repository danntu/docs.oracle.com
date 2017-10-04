/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_concepts;

/**
 *
 * @author DMyrzaka
 */
public class BicycleDemo {
    public static void main(String[] args) {
        Bicycle b1 = new Bicycle();
        Bicycle b2 = new Bicycle();
        
        b1.changeCadence(50);
        b1.speedUp(10);
        b1.changeGear(2);
        b1.printStates();

        b2.changeCadence(50);
        b2.speedUp(10);
        b2.changeGear(2);
        b2.changeCadence(40);
        b2.speedUp(10);
        b2.changeGear(3);
        b2.printStates();
    }
}
