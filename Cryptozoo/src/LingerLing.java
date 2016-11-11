/*******************************************************************************
 * Program Filename:    Animal.java
 * Author:              Aldo Aguilar
 * Date:                11/5/16
 * Description:         Produces objects with lingerling properties
 * Input:               Animal class, ZooAnimal interface, information used to 
 *                      create a new lingerling object
 * Output:              New lingerling object, information about the object, and
 *                      object properties for subclasses-
 ******************************************************************************/


/**
 *
 * @author aguilara42
 */
public class LingerLing extends Animal {
    /*  Constructor to create new LingerLing objects with animal properties 
        + food information */
    public LingerLing (String name, String origin, int danger) {
        /*  These properties of this object are defined the same as in the parent
            class */
        super(name, origin, danger);
    }
    /***************************************************************************
     * Method:              setFoodType()
     * Description:         Is here to satisfy ZooAnimal interface
     * Parameters:          String foodType
     * Pre-Conditions:      An object with a food type property
     * Post-Conditions:     N/A
     **************************************************************************/
    public void setFoodType(String foodType) {
    }
    /***************************************************************************
     * Method:              getFoodType()
     * Description:         Returns an object's food type
     * Parameters:          N/A
     * Pre-Conditions:      An object with a food type property
     * Post-Conditions:     The food type of the object is returned
     **************************************************************************/
    public String getFoodType() {
        return "none";
    }
    /***************************************************************************
     * Method:              setFoodAmt()
     * Description:         Is here to satisfy ZooAnimal interface
     * Parameters:          String foodAmt
     * Pre-Conditions:      An object with a food amount property
     * Post-Conditions:     N/A
     **************************************************************************/
    public void setFoodAmt(int foodAmt) {
    }
    /***************************************************************************
     * Method:              setFoodAmount()
     * Description:         Sets an object's food amount to a specified one
     * Parameters:          String foodAmt
     * Pre-Conditions:      An object with a food amount property
     * Post-Conditions:     An object with the new food amount
     **************************************************************************/
    public int getFoodAmt() {
        return 0;
    }
    /***************************************************************************
     * Method:              foodPerWeek()
     * Description:         Gives the food consumption per week for an animal
     * Parameters:          N/A
     * Pre-Conditions:      An object with a food amount property
     * Post-Conditions:     The amount of food consumed per week is returned
     **************************************************************************/
    public int foodPerWeek() {
        return 0; //Returns the amount of food eaten per week
    }
}
