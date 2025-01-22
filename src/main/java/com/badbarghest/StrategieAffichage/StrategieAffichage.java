package com.badbarghest.StrategieAffichage;

import com.badbarghest.Dessin.AbstractDessin;
import java.util.Iterator;

public abstract class StrategieAffichage implements IStrategieAffichage {
    protected String seperator;

    protected void printChild(Iterator it, int profondeur, String path) {
        while (it.hasNext() && profondeur <= 3) {
            AbstractDessin enfant = (AbstractDessin) it.next();
            System.out.print("\n");
            afficher(enfant, profondeur, path);
        }
    }
}
