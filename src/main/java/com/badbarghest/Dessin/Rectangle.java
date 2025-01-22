package com.badbarghest.Dessin;

import java.util.Iterator;

public class Rectangle implements IDessin {
    private final String nom;

    public Rectangle(String nom){
        this.nom = nom;
    }

    public String getNom(){
        return nom;
    }

    @Override
    public Iterator createIterator() {
        return null;
    }
}
