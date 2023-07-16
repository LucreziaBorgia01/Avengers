/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.avengerssimple;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Anička
 */
public class AvengerFinder {
    private Databaze databaze;
    private Scanner scanner = new Scanner(System.in, "Windows-1250");


    public AvengerFinder() {
        databaze = new Databaze();
    }
    
    private String getEntry(){
        System.out.print("Zadejte klíč k provedení akce: ");
        String entry = scanner.nextLine();
        return entry;
    }
    
    private String editEntry(String entry) {
        String[] entrySplit = entry.split(" ");
        String exit="";
        for (String word : entrySplit){
            word = word.trim().toLowerCase();     
            word=word.substring(0, 1).toUpperCase() + word.substring(1);
            exit = String.join(" ",exit,word);
        }
        return exit;
    }

    public void printAvenger(String entry) {
        ArrayList<Avenger> avengers = databaze.findAvenger(entry);
        for (Avenger a : avengers) {
            a.getAvengerInfo();
            System.out.println("");
        }
    }

    /**
     * Přidá Avengera do databáze ze vstupu
     */
    public void addAvengers() {
        
        System.out.print("Zadejte jméno Avengera: ");
        String name = editEntry(scanner.nextLine());
        System.out.print("Zadejte civilní jméno Avengera: ");
        String civilName = editEntry(scanner.nextLine());
        System.out.print("Zadejte přezdívku Avengera: ");
        String nickname = editEntry(scanner.nextLine());
        System.out.print("Zadejte první film Avengera: ");
        String movie = editEntry(scanner.nextLine());
        databaze.addAvenger(name,civilName,nickname,movie);
    }

    /**
     * Vyhledá Avengery dle vstupu
     */
    public void findAvengers() {
        //Zadání jména uživatelem
        String entry = editEntry(getEntry());

        ArrayList<Avenger> avengers = databaze.findAvenger(entry);

        if (avengers.size() > 0) {
            System.out.println("Nalezeni tito Avengers: ");
            for (Avenger a : avengers) {
                a.getAvengerInfo();
                System.out.println("");
            }
        } else {
            System.out.println("Nebyli nalezeni žádní Avengers odpovídající zadání.");
        }
    }

    /**
     * Odstraní Avengers dle jména
     */
    public void deleteAvengers() {
        System.out.println("Budou vymazáni Avengers dle zadaného jména");
        String entry = editEntry(getEntry());
        databaze.deleteAvenger(entry);
    }
    
    public void printAll(){
        System.out.println("Přehled všech Avengers v databázi:");
        databaze.printAll();        
    }

    /**
     * Vypíše úvodní obrazovku
     */
    public void printWelcome () {
        System.out.println();
        System.out.println("Vítejte v AvengersFinder!");

    }
    
    public void printActionMenu(){
        String choice= "";

        while (!choice.equals("5")) {
            System.out.println();
            System.out.println("1 - Přidat Avengera");
            System.out.println("2 - Vyhledat Avengera");
            System.out.println("3 - Vymazat Avengera");
            System.out.println("4 - Vypsat přehled Avengers");
            System.out.println("5 - Konec");
            System.out.print("Vyberte si akci: ");
            choice = scanner.nextLine();
            System.out.println();
            // reakce na volbu
            switch (choice) {
                case "1":
                    addAvengers();
                    break;
                case "2":
                    findAvengers();
                    break;
                case "3":
                    deleteAvengers();
                    break;
                case "4":
                    printAll();
                    break;
                case "5":
                    System.out.println("Děkujeme za použití AvengerFinder.");
                    break;
                default:
                System.out.println("Neplatná volba, stiskněte libovolnou klávesu a opakujte volbu.");
                    break;
            }
        }
    }

    
}
