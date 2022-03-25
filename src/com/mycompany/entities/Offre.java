/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.entities;

/**
 *
 * @author hbaie
 */
public class Offre {
    

    
    private String name;

    
    private String destination;
    
    private String image;
    
    private int place_dispo;

    private int price;
    
    private String description;

    
    private String vol;

    
    private String hotel;

    
    private String Guide;


    private String valablede;

    
    private String valablea;

    public Offre() {
    }

    public Offre(String name, String destination, String image, int place_dispo, int price, String description, String vol, String hotel, String Guide, String valablede, String valablea) {
        this.name = name;
        this.destination = destination;
        this.image = image;
        this.place_dispo = place_dispo;
        this.price = price;
        this.description = description;
        this.vol = vol;
        this.hotel = hotel;
        this.Guide = Guide;
        this.valablede = valablede;
        this.valablea = valablea;
    }

    public String getName() {
        return name;
    }

    public String getDestination() {
        return destination;
    }

    public String getImage() {
        return image;
    }

    public int getPlace_dispo() {
        return place_dispo;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getVol() {
        return vol;
    }

    public String getHotel() {
        return hotel;
    }

    public String getGuide() {
        return Guide;
    }

    public String getValablede() {
        return valablede;
    }

    public String getValablea() {
        return valablea;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setPlace_dispo(int place_dispo) {
        this.place_dispo = place_dispo;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setVol(String vol) {
        this.vol = vol;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    public void setGuide(String Guide) {
        this.Guide = Guide;
    }

    public void setValablede(String valablede) {
        this.valablede = valablede;
    }

    public void setValablea(String valablea) {
        this.valablea = valablea;
    }

    
   

    
    
}
