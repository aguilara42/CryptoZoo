/*******************************************************************************
 * Program Filename:    Animal.java
 * Author:              Aldo Aguilar
 * Date:                11/5/16
 * Description:         Produces objects with fossil-relative properties
 * Input:               Animal class, ZooAnimal interface, Lingerling class, 
 *                      information used to create a new fossil-relative object
 * Output:              New fossil-relative object, information about the object
 ******************************************************************************/


/**
 *
 * @author aguilara42
 */
public class FossilRelative extends LingerLing {
    public FossilRelative (String name, String origin, int danger) {
        /*  These properties of this object are defined the same as in the parent
            class */
        super(name, origin, danger); 
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
