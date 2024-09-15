package MyGame;

public class Game {
    private static Plateau p = new Plateau(3);
    public static void main(String[] args) {
        Plateau.creation(p);
        Partie.jouer(p);
    }
}

