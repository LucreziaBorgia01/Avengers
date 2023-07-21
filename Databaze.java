/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.avengerssimple;

import java.util.ArrayList;

/**
 *
 * @author Anička
 */
public class Databaze {
    
    private ArrayList<Avenger> avengers;
    
    public Databaze(){
        avengers = new ArrayList<>();
    }

   
    /**
     * Přidá Avengera
     * @param name Jméno
     * @param civilName Civilní jméno
     * @param nickname Přezdívka
     * @param movie První film
     */
    public void addAvenger(String name, String civilName, String nickname, String movie) {
        avengers.add(new Avenger(name, civilName, nickname, movie));
    }
    /**
     * Najde Avengera dle klíče
     * @param key Jméno/Civilní jméno/přezdívka hledaného Avengera
     * @return Kolekce nalezených Avengerů
     */
    public ArrayList<Avenger> findAvenger(String key) {
        ArrayList<Avenger> found = new ArrayList<>();
        for (Avenger a : avengers) {
            if (a.getName().contains(key)){
                found.add(a);
            }
            else if (a.getCivilName().contains(key)){
                found.add(a);
            }
            else if (a.getNickname().contains(key)){
                found.add(a);
            }
        }
        return found;
    }
    
    /**
     * Vymaže Avengera dle jména
     * @param name Jméno
     */
    public void deleteAvenger(String name) {
        ArrayList<Avenger> found = findAvenger(name);
        for (Avenger a : found) {
            avengers.remove(a);
        }
    }
    
    public void printAll(){
        for (Avenger a:avengers){
            a.getAvengerInfo();
            System.out.println("");
        }
    }
    
}
