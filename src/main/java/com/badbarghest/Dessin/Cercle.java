package com.badbarghest.Dessin;

import java.util.Iterator;

public class Cercle implements IDessin {
    private final String nom;

    public Cercle(String nom){
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
