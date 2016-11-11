/**
 * *****************************************************************************
 * Program Filename:    Animal.java
 * Author:              Aldo Aguilar
 * Date:                11/5/16
 * Description:         Produces objects with paranormal properties
 * Input:               Animal class, ZooAnimal interface, information used to
 *                      create a new paranormal object
 * Output:              New paranormal object, information about the object
 ***************************************************************************
 */


/**
 *
 * @author aguilara42
 */
public class Paranormal extends Animal {

    private String foodType; //Type of food eaten by the animal
    private int foodAmt; //Amount of food eaten by the animal

    /*  Constructor to create new Paranormal objects with animal properties 
        + food information */
    public Paranormal(String name, String origin, int danger, String food,
            int foodAmt) {
        /*  These properties of this object are defined the same as in the parent
            class */
        super(name, origin, danger);
        /* All paranormal aniamls will eat 5 meat */
        this.foodType = "meat";
        this.foodAmt = 5;
    }

    /**
     * *************************************************************************
     * Method: setFoodType() Description: Sets an object's food type to a
     * specified one Parameters: String foodType Pre-Conditions: An object with
     * a food type property Post-Conditions: An object with the new food type
     *************************************************************************
     */
    public void setFoodType(String foodType) {
        this.foodType = foodType; //The food type will be the specified one
    }

    /**
     * *************************************************************************
     * Method: getFoodType() Description: Returns an object's food type
     * Parameters: N/A Pre-Conditions: An object with a food type property
     * Post-Conditions: The food type of the object is returned
     *************************************************************************
     */
    public String getFoodType() {
        return foodType; //Returns the food type
    }

    /**
     * *************************************************************************
     * Method: setFoodAmount() Description: Sets an object's food amount to a
     * specified one Parameters: String foodAmt Pre-Conditions: An object with a
     * food amount property Post-Conditions: An object with the new food amount
     *************************************************************************
     */
    public void setFoodAmt(int foodAmt) {
        this.foodAmt = foodAmt; //The food amount will be the specified one
    }

    /**
     * *************************************************************************
     * Method: getFoodAmount() Description: Returns an object's food amount
     * Parameters: N/A Pre-Conditions: An object with a food amount property
     * Post-Conditions: The food amount of the object is returned
     *************************************************************************
     */
    public int getFoodAmt() {
        return foodAmt; //Returns the food amount
    }

    /**
     * *************************************************************************
     * Method: foodPerWeek() Description: Gives the food consumption per week
     * for an animal Parameters: N/A Pre-Conditions: An object with a food
     * amount property Post-Conditions: The amount of food consumed per week is
     * returned
     *************************************************************************
     */
    public int foodPerWeek() {
        return foodAmt * 3; //Returns the amount of food eaten per week
    }
}
