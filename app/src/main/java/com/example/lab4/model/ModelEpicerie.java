package com.example.lab4.model;

public class ModelEpicerie {
    private String nom;
    private String description;
    private int icon;

    public ModelEpicerie(String nom, String description, int icon) {
        this.nom = nom;
        this.description = description;
        this.icon = icon;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }
}
