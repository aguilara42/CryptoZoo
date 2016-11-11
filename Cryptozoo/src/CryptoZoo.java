/*******************************************************************************
 * Program Filename:    CryptoZoo.java
 * Author:              Aldo Aguilar
 * Date:                11/5/16
 * Description:         Prints out animals and their characteristics from the 
 *                      virtual zoo
 * Input:               the user
 * Output:              Text detailing the creatures in the zoo and their info
 ******************************************************************************/


/**
 *
 * @author aguilara42
 */
public class CryptoZoo {

    public static void main(String[] args) {
        Zoo menagerie = new Zoo(); //zoo object for the zoo animals
        menagerie.init(); //creates the list
        menagerie.showAll(); //Prints animals and what they do
    }
    
}
