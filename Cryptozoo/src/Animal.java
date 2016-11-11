/*******************************************************************************
 * Program Filename:    Animal.java
 * Author:              Aldo Aguilar
 * Date:                11/5/16
 * Description:         Parent class to specify object creation and the string
 *                      format
 * Input:               ZooAnimal interface
 * Output:              Variables/constructor, toString method, new Animal
 *                      object
 ******************************************************************************/


/**
 *
 * @author aguilara42
 */
public abstract class Animal implements ZooAnimal {
    private String name; //Name of the animal
    private String origin; //Animal's origin
    private int danger; //Animal's danger rating
    private int cage;
    private boolean onTour = true;
    
    /*  Animal object constructor (only to be inherited) */
    public Animal (String name, String origin, int danger){
        this.name = name; //The object name will be the specified one
        this.origin = origin; //The object origin  will be the specified one
        this.danger = danger; //The danger rating will be the specified one
    }
    /***************************************************************************
     * Method:              toString()
     * Description:         Print's an animal object's properties
     * Parameters:          N/A
     * Pre-Conditions:      An animal object must have a name origin and danger
     *                      rating
     * Post-Conditions:     Printed properties of an animal objects
     **************************************************************************/
    public String toString() {
        return "Name: " + name + "\nOrigin: " + origin + "\nDanger Rating: " + 
                danger;
    }
    
    public boolean getonTour(){
        return this.onTour;
    }
    
    public void setonTour(boolean a){
        this.onTour = a;
    }
    
    public int getcage(){
        return this.cage;
    }
    
    public void setcage(int a){
        this.cage = a;
    }
    
    public String getname(){
        return this.name;
    }
    public abstract int foodPerWeek();


}
