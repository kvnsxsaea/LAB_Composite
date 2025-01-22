package com.badbarghest;

import com.badbarghest.Dessin.Dessin;
import com.badbarghest.Dessin.Formes.*;
import com.badbarghest.StrategieAffichage.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StrategieAffichage strat = null;

        System.out.println(promptProfondeur());
        int profondeur = scanner.nextInt();

        System.out.println(promptStrategieAffichage());
        switch (scanner.nextInt()) {
            case 1:
                strat = new StrategieIndentation();
                break;
            case 2:
                strat = new StrategieAffichageChemin();
                break;
            default:
                System.out.println("Choix invalide");
        }

        System.out.println("Affichage du dessin :");
        strat.afficher(new Main().createDessins(), profondeur-1, "");
    }

    public static String promptProfondeur() {
        return"Entrez le dessin à tester :\n" +
                "1- Dessin avec 3 niveaux\n" +
                "2- Dessin avec 2 niveaux\n" +
                "3- Dessin avec 1 niveau (une forme seulement)";
    }

    public static String promptStrategieAffichage() {
        return "Entrez la stratégie d'affichage à utiliser :\n" +
                "1- Indentation\n" +
                "2- Chemin complet";
    }

    public Dessin createDessins() {
        Dessin dessin1 = new Dessin("Dessin1"),
                dessin2 = new Dessin("Dessin2"),
                dessin3 = new Dessin("Dessin3"),
                dessin4 = new Dessin("Dessin4");

        Cercle cercle1 = new Cercle("Cercle1"),
                cercle2 = new Cercle("Cercle2"),
                cercle3 = new Cercle("Cercle3");

        Triangle triangle1 = new Triangle("Triangle1"),
                triangle2 = new Triangle("Triangle2");

        Rectangle rectangle1 = new Rectangle("Rectangle1");

        dessin4.addEnfant(triangle1);
        dessin4.addEnfant(triangle2);

        dessin3.addEnfant(cercle2);
        dessin3.addEnfant(cercle3);

        dessin2.addEnfant(dessin3);
        dessin2.addEnfant(dessin4);
        dessin2.addEnfant(rectangle1);

        dessin1.addEnfant(cercle1);
        dessin1.addEnfant(dessin2);

        return dessin1;
    }
}





