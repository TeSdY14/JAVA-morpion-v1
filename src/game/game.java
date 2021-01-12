package game;

import Modele.Morpion;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

class Main {
    Object message() {
        return "Hello";
    }
}
class Main2 extends Main {
    Object message() {
        return "Hello";
    }
}

public class game {

    static int count = 0;

    public static void main(String[] args) {

        if (count < 3) {
            count++;
            main(null);
        } else {
            return;
        }
        System.out.println("hello");

        Scanner in = new Scanner(System.in);
        char humanSymbole = ' ';
        String humanCouleur = "";
        int joueurUn;

        /* CHOIX DU SYMBOLE POUR JOUEUR 1 */
        do {
            System.out.println("Veuillez choisir votre symbole : entrez \"X\" pour 'X' ou \"0\" (zéro) pour '0'");
            humanSymbole = in.nextLine().toUpperCase().charAt(0);
            System.out.println(humanSymbole);
        } while (humanSymbole != 'X' && humanSymbole != '0');
        System.out.println("Vous avez choisi : " + humanSymbole);

        /* CHOIX DE LA COULEUR POUR JOUEUR 1 */
        do {
            System.out.println("Veuillez choisir votre couleur : blue, red, violet, black, pink, green!");
            humanCouleur = in.nextLine().toUpperCase();
        } while (!humanCouleur.equals("BLUE") && !humanCouleur.equals("RED") && !humanCouleur.equals("VIOLET") && !humanCouleur.equals("BLACK") && !humanCouleur.equals("PINK") && !humanCouleur.equals("GREEN"));
        System.out.println("Vous avez choisi : " + humanCouleur);

        /* QUI COMMENCE ? */
        System.out.println("Taper 1 pour commencer, autre pour laisser l'ordinateur commencer.");
        joueurUn = in.nextInt();



        /* Start GAME */
        Morpion morpion = new Morpion(joueurUn == 1, humanSymbole, humanCouleur);
    }


}
