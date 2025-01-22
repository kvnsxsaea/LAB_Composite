package com.badbarghest.StrategieAffichage;

import com.badbarghest.Dessin.IDessin;

public interface IStrategieAffichage {
    public void afficher(IDessin dessin, int profondeur, String path);
}
