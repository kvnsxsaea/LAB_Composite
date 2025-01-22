package com.badbarghest.Dessin;

import java.util.ArrayList;
import java.util.Iterator;

public class Dessin implements IDessin {
    private final String NOM;
    private ArrayList<IDessin> enfants = new ArrayList<>();

    public Dessin(String nom) {
       this.NOM = nom;
    }

    @Override
    public Iterator createIterator() {
        return this.enfants.iterator();
    }

    public String getNom() {
        return NOM;
    }

    public void addEnfant(IDessin enfant) {
        enfants.add(enfant);
    }
}
