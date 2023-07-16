/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.avengerssimple;

/**
 *
 * @author Anička
 */
public class Avenger {
    private String name;
    private String civilName;
    private String nickname;
    private String movie;

    /**
    @param name Jméno Avengera
    * @param civilName Civilní jméno
    * @param nickname Přezdívka
    * @param movie První film
    */
    public Avenger (String name, String civilName, String nickname, String movie){
        this.name=name;
        this.civilName=civilName;
        this.nickname=nickname;
        this.movie=movie;
    }
    
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name=name;
    }
    
    public String getCivilName(){
        return civilName;
    }
    
    public void setCivilName(String civilName){
        this.civilName=civilName;
    }
    
    public String getNickname(){
        return nickname;
    }
    
    public void setNickname(String nickname){
        this.nickname=nickname;
    }
    
    public String getMovie(){
        return movie;
    }
    
    public void setMovie(String movie){
        this.movie = movie;
    }
    
    
    public void getAvengerInfo(){
        System.out.println("Jméno: "+getName());
        System.out.println("Civilní jméno: "+getCivilName());
        System.out.println("Přezdívka: "+getNickname());
        System.out.println("První výskyt: "+getMovie());
        //return "Jméno:" + getAvengerName() + "\n" + "Civilní jméno: "+ getAvengerCivilName() + "\n"+"Přezdívka: "+getAvengerNickname()+"\n"+"První výskyt: "+getAvengerMovie();

    }
    
}
