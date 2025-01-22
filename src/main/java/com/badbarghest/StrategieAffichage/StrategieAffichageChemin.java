package com.badbarghest.StrategieAffichage;

import com.badbarghest.Dessin.IDessin;

import java.util.Iterator;

public class StrategieAffichageChemin implements IStrategieAffichage {

    private final String SEPARATOR = "\t";

    public void afficher(IDessin dessin, int profondeur, String path) {
        Iterator it = dessin.createIterator();
        profondeur++;
        path += dessin.getNom();
        System.out.print(path);
        path += SEPARATOR.repeat(1);

        while (it != null && (it.hasNext() && profondeur <= 3)) {
            IDessin enfant = (IDessin) it.next();
            System.out.print("\n");
            afficher(enfant, profondeur, path);
        }
    }
}
