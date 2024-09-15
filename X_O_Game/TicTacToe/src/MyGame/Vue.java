package MyGame;


import java.util.stream.IntStream;

public class Vue {

    public static void saut() {
        System.out.println();
        System.out.println();
        System.out.println();
    }
    private static String espace = IntStream
    .range(1, 6)
    .mapToObj(nb -> " ")
    .reduce("",(a,b) -> a + b);

    public static void ligneContinue(int n) {
        StringBuilder b = new StringBuilder();
        b.append(espace+espace);
        for(int i = 0; i < n; i++) {
            b.append("________"+espace);
        }
        b.append(espace);
       System.out.println(b.toString()); 
    }  

    public static void affichePlateau(Plateau p) {
        saut();
        
        for(int i = 0; i < p.getSize(); i++) {
            ligneContinue(p.getSize());
            System.out.print(espace + espace);
            for(int j = 0; j < p.getSize(); j++) {
                String content = p.getPlateau()[i][j].getInfo().equals("empty") ? 
                                 String.format("|  %2d  |", p.getPlateau()[i][j].getNum()) : 
                                 String.format("|  %s  |", p.getPlateau()[i][j].getInfo());
                System.out.print(content + espace);
            }
            System.out.println();
        }
        saut();
    }

    public static void afficherRegles(int n) {
        System.out.println("****************************************");
        System.out.println("*            Règles du jeu             *");
        System.out.println("****************************************");
        System.out.println("* 1. Le jeu se joue sur une grille 3x3. *");
        System.out.println("* 2. Deux joueurs participent :         *");
        System.out.println("*    - Joueur 1 : X                     *");
        System.out.println("*    - Joueur 2 : O                     *");
        System.out.println("* 3. Les joueurs placent leur symbole   *");
        System.out.println("*    (X ou O) sur la grille à tour de   *");
        System.out.println("*    rôle, en choisissant une case      *");
        System.out.println("*    libre de 1 à " + n*n + " .                    *");
        System.out.println("* 4. Le but du jeu est d'aligner 3      *");
        System.out.println("*    symboles identiques en ligne,      *");
        System.out.println("*    en colonne ou en diagonale.        *");
        System.out.println("* 5. Le jeu se termine quand :          *");
        System.out.println("*    - Un joueur aligne 3 symboles,     *");
        System.out.println("*      il est alors déclaré vainqueur.  *");
        System.out.println("*    - Toutes les cases sont remplies   *");
        System.out.println("*      sans qu'il y ait de gagnant,     *");
        System.out.println("*      c'est un match nul.              *");
        System.out.println("****************************************");
        System.out.println("Bonne chance et que le meilleur gagne !");
        System.out.println("________________________________________________________");
    }
}