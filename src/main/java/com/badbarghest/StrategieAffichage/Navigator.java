package com.badbarghest.StrategieAffichage;

import com.badbarghest.Dessin.IDessin;

import java.util.Iterator;

public class Navigator {
    private final IStrategieAffichage strategy;

    public Navigator(){
        this.strategy = new StrategieIndentation();
    }

    public Navigator(IStrategieAffichage strategy){
        this.strategy = strategy;
    }

    public void afficher(IDessin dessin, int profondeur){
        Iterator it = dessin.createIterator();
        String path = "";
        strategy.afficher(dessin, path, profondeur);
    }
}
