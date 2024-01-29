/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.util.Scanner;

/**
 *
 * @author nhs
 */
public class InputUtils {
    public static Scanner sc = new Scanner (System.in);
    
    public static String inputId() {
        String id;
        while (true) {
            try {
                id = sc.nextLine().trim();
                if (!id.matches("[a-zA-Z0-9]+")) {
                    throw new IllegalArgumentException("Invalid code. Please enter a valid code.");
                }
                break;
            } catch (IllegalArgumentException e) {
                System.err.print(e.getMessage());
            }
        }
        return id;
    }
    
    public static String inputName() {
        String name;
        while (true) {
            try {
                name = sc.nextLine();

                if (!name.matches("[a-zA-Z0-9 -.]+")) {
                    throw new IllegalArgumentException("Invalid name. Please enter a valid name.");
                }
                break;
            } catch (IllegalArgumentException e) {
                System.err.println(e.getMessage());
            }
        }
        return name;
    }

    public static int inputInt() {
        int rs;
        while (true) {
            try {
                rs = Integer.parseInt(sc.nextLine());
                if (rs <= 0) {
                    throw new ArithmeticException("Not valid. Enter a positive number.");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Pls input a valid integer number.");
            } catch (ArithmeticException ex) {
                System.err.println(ex.getMessage());
            }
        }

        return rs;
    }

    public static int inputOption(int min, int max) {
        int rs;
        while (true) {
            try {
                rs = Integer.parseInt(sc.nextLine());
                if (rs < min || rs > max) {
                    throw new ArithmeticException("Not valid. Enter a valid number from " + min + " to " + max + ".");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Pls input a valid integer number.");
            } catch (ArithmeticException ex) {
                System.err.println(ex.getMessage());
            }
        }

        return rs;
    }
    
    public static float inputFloat() {
        float fl;
        while (true) {
            try {
                fl = Float.parseFloat(sc.nextLine());
                if (fl <= 0) {
                    throw new ArithmeticException("Not valid. Enter a positive number.");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Pls input a valid float number.");
            } catch (ArithmeticException ex) {
                System.err.println(ex.getMessage());
            }
        }
        return fl;
    }
    
    public static String inputString(){
        String str = sc.nextLine();
        return str;
    }
    
    public static float inputDecreaseSalary(float old){
        float fl;
        while (true) {
            try {
                fl = Float.parseFloat(sc.nextLine());
                if (fl <= 0 || fl >= old) {
                    throw new ArithmeticException("Not valid. Enter a positive number and smaller than old salary.");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Pls input a valid float number.");
            } catch (ArithmeticException ex) {
                System.err.println(ex.getMessage());
            }
        }
        return old - fl;
    }
    
    public static float inputIncreaseSalary(float old){
        float fl;
        while (true) {
            try {
                fl = Float.parseFloat(sc.nextLine());
                if (fl <= 0 ) {
                    throw new ArithmeticException("Not valid. Enter a positive number.");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Pls input a valid float number.");
            } catch (ArithmeticException ex) {
                System.err.println(ex.getMessage());
            }
        }
        return fl + old;
    }
    
}
