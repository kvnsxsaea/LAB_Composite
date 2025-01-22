package com.badbarghest.StrategieAffichage;

import com.badbarghest.Dessin.AbstractDessin;

import java.util.Iterator;

public class StrategieIndentation extends StrategieAffichage{

    protected String seperator = "\t";

    public void afficher(AbstractDessin dessin, int profondeur, String path) {
        Iterator it = dessin.createIterator();
        profondeur++;
        System.out.print(path + dessin.getNom());
        path += seperator.repeat(1);

        printChild(it, profondeur, path);
    }
}
