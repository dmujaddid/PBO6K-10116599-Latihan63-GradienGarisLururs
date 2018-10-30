/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6k.pkg10116599.latihan53.rabbit;

/**
 *
 * @author eka
 */
public class Rabbit extends Animal {

    private String color;
    private String name;
    private boolean veg;
    private String food;

    public Rabbit(boolean vegetarian, String food, int legs) {
        super(vegetarian, food, legs);
    }

   

    

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    
}
