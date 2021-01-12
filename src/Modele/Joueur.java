package Modele;

import java.awt.*;

/**
 * Joueur de la partie
 */
public class Joueur {

    /**
     * Symbole lié au joueur 'X' ou 'O'
     */
    public char symbole;

    /**
     * Couleur du joueur (Bleu ou Rouge)
     */
    public Color couleur;

    /**
     * @param symbole char
     * @param couleur Color
     */
    public Joueur(char symbole, Color couleur) {
        this.symbole = symbole;
        this.couleur = couleur;
    }

}
