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
public class Bicycl_Interface_Release  implements  IBicycle{
    
    int cadence = 0;
    int speed = 0;
    int gear = 1;
    
    @Override
   public  void changeCadence(int newValue) {
         cadence = newValue;
    }
     
    @Override
    public void applyBrakes(int decrement) {
         speed = speed - decrement;
    }
    
    @Override
    public void speedUp(int increment) {
         speed = speed + increment;   
    }
    @Override
    public void changeGear(int newValue) {
         gear = newValue;
    }
    
    void printStates() {
         System.out.println("cadence:" +
             cadence + " speed:" + 
             speed + " gear:" + gear);
    }
    
    public static void main(String[] args) {
        Bicycl_Interface_Release b1 = new Bicycl_Interface_Release();
        Bicycl_Interface_Release b2 = new Bicycl_Interface_Release();
        
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
