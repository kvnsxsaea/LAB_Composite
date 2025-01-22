package com.badbarghest.Dessin;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class AbstractDessin implements IDessin {
    protected String nom;
    protected ArrayList<AbstractDessin> enfants = new ArrayList<>();

    public AbstractDessin(String nom) {
        this.nom = nom;
    }

    @Override
    public Iterator createIterator() {
        return this.enfants.iterator();
    }

    public String getNom() {
        return nom;
    }

    public void addEnfant(AbstractDessin enfant) {
        enfants.add(enfant);
    }

    public void removeEnfant() {
        enfants.removeFirst();
    }

    public void removeEnfant(int index) {
        enfants.remove(index);
    }


}
