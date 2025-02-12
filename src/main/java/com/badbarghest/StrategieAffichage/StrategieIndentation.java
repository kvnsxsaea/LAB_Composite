package com.badbarghest.StrategieAffichage;

import com.badbarghest.Dessin.IDessin;

import java.util.Iterator;

public class StrategieIndentation implements IStrategieAffichage{

    private final String SEPARATOR = "\t";

    public void afficher(IDessin dessin, String path, int profondeur) {
        Iterator it = dessin.createIterator();

        System.out.print(path + dessin.getNom());
        path += SEPARATOR;

        while (it != null && (it.hasNext() ) && profondeur < 5) {
            IDessin enfant = (IDessin) it.next();
            System.out.print("\n");
            afficher(enfant, path, profondeur);
            profondeur += 1;
        }
    }
}
