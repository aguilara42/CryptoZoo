/**
 * *****************************************************************************
 * Program Filename:	Zoo.java
 * Author:          	Aldo Aguilar
 * Date:            	11/5/16
 * Description:     	Creates a list of animal objects to make up the zoo and
 *                  	prints the zoo animals and their properties
 * Input:           	The call to create a new object and the properties of
 *                  	each animal specified in other classes
 * Output:          	Prints the animals and their information
 *****************************************************************************
 */


/**
 *
 * @author aguilara42
 */
import java.util.*;

public class Zoo {

    /*  Fills a list with new animal objects */
    static ArrayList<Animal> list = new ArrayList<Animal>();
    private static boolean vist = true;
    public static String name;
    public static String origin;
    public static int danger;
    public static int cages;
    public static  String food;
    public static int amt;
    public static int type;
    public static boolean valid = false;

    public static void init() {

        Mythical myth1 = new Mythical("Unicorn", "Greece", 8, "Children", 2);
        list.add(myth1);
        Mythical myth2 = new Mythical("Donald", "U.S", 100, "Large Animals", 40);
        list.add(myth2);
        Mythical myth3 = new Mythical("Griffin", "Hogwarts", 6, "Deer", 1);
        list.add(myth3);
        Paranormal para1 = new Paranormal("Big Foot", "Campsite Nationwide", 4, "Leftovers", 18);
        list.add(para1);
        Paranormal para2 = new Paranormal("Mothman", "Virginia", 6, "litle kids", 3);
        list.add(para2);
        Paranormal para3 = new Paranormal("Basilisk", "Europe", 8, "cockroach", 20);
        list.add(para3);
        LingerLing ling1 = new LingerLing("Nessie", "Scotland", 3);
        list.add(ling1);
        LingerLing ling2 = new LingerLing("Black Demon", "Pacific Ocean", 10);
        list.add(ling2);
        FossilRelative foss1 = new FossilRelative("T-Rex", "Noth America", 2);
        list.add(foss1);
        FossilRelative foss2 = new FossilRelative("Megalodon", "Pacific Ocean", 10);
        list.add(foss2);

    }

    public static void cages() {
        int a = 1;
        for (Animal i : list) {
            i.setcage(a);
            a++;
            cages = a;
        }
    }

    /**
     * *************************************************************************
     * Method: showAll() Description: Prints all the animals in the zoo and
     * their properties Parameters: N/A Pre-Conditions: zooList must be filled
     * with new animal objects, the program must be started Post-Conditions: A
     * list of the zoo animals and their properties is printed
     * ************************************************************************
     */
    public static void showAll() {
        while (vist) {
            /* Prints the properties of each animal object in the zooList */
            Scanner sc = new Scanner(System.in);
            valid = false;
            cages();
            System.out.println("1) Show all animals.");
            System.out.println("2) Show aniamls on tour.");
            System.out.println("3) Add aniaml.");
            System.out.println("4) Remove animal.");
            System.out.println("5) Take animals off tour.");
            System.out.println("6) Exit.");
            int choice = sc.nextInt();

            if (choice == 1) {

                for (Animal i : list) {

                    System.out.println(i.toString());
                    System.out.println("Cage: " + i.getcage());

                    if (i.getonTour()) {
                        System.out.println("This animal is on tour.");
                    }
                    System.out.println("Food Type: " + i.getFoodType());
                    System.out.println("Food Per Week: " + i.foodPerWeek());
                    System.out.println("Food Amount: " + i.getFoodAmt());
                    System.out.println("______________________________________");

                }
            }

            if (choice == 2) {
                for (Animal i : list) {
                    if (i.getonTour()) {

                        System.out.println(i.toString());
                        System.out.println("Cage: " + i.getcage());
                        if (i.getonTour()) {
                            System.out.println("This animal is on tour.");
                        }
                        System.out.println("Food Type: " + i.getFoodType());
                        System.out.println("Food Per Week: " + i.foodPerWeek());
                        System.out.println("Food Amount: " + i.getFoodAmt());
                        System.out.println("______________________________________");
                    }

                }
            }

            if (choice == 3) {

                System.out.println("What is the animals name?");
                name = sc.next();
                System.out.println("What is the animals origin?");
                origin = sc.next();
                System.out.println("What is its danger rating?");   
                danger = sc.nextInt();
                System.out.println("What does it eat?");
                food = sc.next();
                System.out.println("How much does it eat?");
                amt = sc.nextInt();
                System.out.println("is it 1.Mythical 2. Paranormal 3. Fossil 4. Linger Ling");
                type = sc.nextInt();
                if (type == 1) {
                    Mythical userAnimal = new Mythical(name, origin, danger, food, amt);
                    list.add(userAnimal);
                }
                if (type == 1) {
                    Paranormal userAnima2 = new Paranormal(name, origin, danger, food, amt);
                    list.add(userAnima2);
                }
                if (type == 1) {
                    FossilRelative userAnimal = new FossilRelative(name, origin, danger);
                    list.add(userAnimal);
                }
                if (type == 1) {
                    LingerLing userAnimal = new LingerLing(name, origin, danger);
                    list.add(userAnimal);
                }

            }

            if (choice == 4) {
                System.out.println("Which cage number of an animal would you like to remove?");
                int a = sc.nextInt();
                if (a > 0) {
                    list.remove(a - 1);
                }
            }

            if (choice == 5) {
                int a = 0;
                int cage = 0;
                boolean valid = false;
                while (valid != true) {
                    System.out.println("Which cage number would you like to change the tour status?");
                    cage = sc.nextInt() - 1;
                    if (cage < 0 || cage > cages) {
                        System.out.println("There is no such cage.");
                    } else {
                        valid = true;
                    }
                }

                for (Animal i : list) {
                    if (a == cage) {
                        valid = false;
                        while (valid != true) {
                            System.out.println("Would you like to 1. take off tour or 2. put on tour?");
                            int tour = sc.nextInt();
                            if (tour == 1) {
                                i.setonTour(false);
                                valid = true;
                            }
                            if (tour == 2) {
                                i.setonTour(true);
                                valid = true;
                            }
                        }
                    }
                    a++;
                }
            }
            
            if (choice == 6){
                vist = false;
            }

        }
    }
}
