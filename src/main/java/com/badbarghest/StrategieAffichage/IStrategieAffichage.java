package com.badbarghest.StrategieAffichage;

import com.badbarghest.Dessin.AbstractDessin;

public interface IStrategieAffichage {
    public void afficher(AbstractDessin dessin, int profondeur, String path);
}
