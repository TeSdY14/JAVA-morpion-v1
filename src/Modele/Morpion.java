package Modele;

import java.awt.*;
import java.util.Random;

public class Morpion {

    /**
     * Case aléatoire de l'ordinateur
     */
    private static final Random RANDOM = new Random();

    /**
     * Grille du morpion 3x3 : 9 cases au total
     */
    private Case[][] grille;

    private Joueur humain;

    private Joueur ordinateur;

    private int nombreDeCasesOccupees;

    public Morpion(boolean ordinateurStart, char symbole, String couleur) {

        /* INITIALISATION DU JEU */
        /*
         * 1/ on créé les 9 cases
         */
        grille = new Case[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                grille[i][j] = new Case(this);
            }
        }

        /*
         * 2/ on instancie les 2 joueurs
         */
        ordinateur = new Joueur(symbole, Color.getColor(couleur));
        char cpuSymbole = symbole == 'X' ? 'O' : 'X';
        String cpuCouleur = !couleur.equals("RED") ? "RED" : "BLUE";
        ordinateur = new Joueur(symbole, Color.getColor(cpuCouleur));

    }



    public Case getCase(int x, int y) {
        return grille[x][y];
    }

}
