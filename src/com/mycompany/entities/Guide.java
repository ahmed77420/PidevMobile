/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.entities;

/**
 *
 * @author hbaie
 */
public class Guide {
    
    private int id;

    private String name;


    private String email;


    private int experience;


    private String description;

    public Guide(int id, String name, String email, int experience, String description) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.experience = experience;
        this.description = description;
    }

    public Guide() {
    }

    public Guide(String name, String email, int experience, String description) {
        this.name = name;
        this.email = email;
        this.experience = experience;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getExperience() {
        return experience;
    }

    public String getDescription() {
        return description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    
    
    
    
    
    
    
    
    
    
    
}
