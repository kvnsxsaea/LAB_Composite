package com.badbarghest.StrategieAffichage;

import com.badbarghest.Dessin.AbstractDessin;

import java.util.Iterator;

public class StrategieAffichageChemin extends StrategieAffichage {

    protected String seperator = ".";

    public void afficher(AbstractDessin dessin, int profondeur, String path) {
        Iterator it = dessin.createIterator();
        profondeur++;
        path += dessin.getNom();
        System.out.print(path);
        path += seperator.repeat(1);

        printChild(it, profondeur, path);
    }
}
