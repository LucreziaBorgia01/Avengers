/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cz.itnetwork.avengerssimple;

import java.util.Scanner;

/**
 *
 * @author Anička
 */
public class AvengersSimple {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "Windows-1250");      
        AvengerFinder avengerFinder = new AvengerFinder();
        avengerFinder.printWelcome();
        avengerFinder.printActionMenu();
    }
}
