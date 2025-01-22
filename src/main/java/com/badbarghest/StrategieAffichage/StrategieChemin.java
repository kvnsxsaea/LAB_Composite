package com.badbarghest.StrategieAffichage;

import com.badbarghest.Dessin.IDessin;

import java.util.Iterator;

public class StrategieChemin implements IStrategieAffichage {

    private final String SEPARATOR = ".";

    public void afficher(IDessin dessin, String path, int profondeur) {
        Iterator it = dessin.createIterator();

        path += dessin.getNom();
        System.out.print(path);
        path += SEPARATOR;

        while (it != null && (it.hasNext() ) && profondeur < 5) {
            IDessin enfant = (IDessin) it.next();
            System.out.print("\n");
            afficher(enfant, path, profondeur);
            profondeur += 1;
        }
    }
}
