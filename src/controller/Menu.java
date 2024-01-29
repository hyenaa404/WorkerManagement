
package controller;

import util.InputUtils;

/**
 *
 * @author nhs
 */
public class Menu {
    public static int chooseInputOption(){
        System.out.println("1. Add worker.");
        System.out.println("2. Decrease salary.");
        System.out.println("3. Increase salary.");
        System.out.println("4. Display informationsalary .");
        System.out.println("5. Exit.");
        int option = InputUtils.inputOption(1, 5);
        return option;
    }
}
