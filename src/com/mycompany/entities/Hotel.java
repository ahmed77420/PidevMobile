/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.entities;

/**
 *
 * @author hbaie
 */
public class Hotel {
    
    private String  name;

    private String  localisation;

    private String description; 
    
    private int  nbr_chambre;

    public Hotel(String name, String localisation, String description, int nbr_chambre) {
        this.name = name;
        this.localisation = localisation;
        this.description = description;
        this.nbr_chambre = nbr_chambre;
    }

    public Hotel() {
    }

    public String getName() {
        return name;
    }

    public String getLocalisation() {
        return localisation;
    }

    public String getDescription() {
        return description;
    }

    public int getNbr_chambre() {
        return nbr_chambre;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setNbr_chambre(int nbr_chambre) {
        this.nbr_chambre = nbr_chambre;
    }

    
}
