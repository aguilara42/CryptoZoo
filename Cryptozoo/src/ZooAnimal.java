/*******************************************************************************
 * Program Filename:    ZooAnimal.java
 * Author:              Aldo Aguilar
 * Date:                11/5/16
 * Description:         methods for sub classes
 * Output:              methods for subclasses
 ******************************************************************************/


/**
 *
 * @author aguilara42
 */
public interface ZooAnimal {

    /*  methods for animal */
    public void setFoodType(String food);
    public String getFoodType();
    public void setFoodAmt(int amt);
    public int getFoodAmt();
    public int foodPerWeek();
    public int getcage();
    public boolean getonTour();
}
