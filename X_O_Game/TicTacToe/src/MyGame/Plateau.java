package MyGame;


public class Plateau {
    private int size;
    private Case[][] plateau;

    public Plateau(int _s) {
        size = _s;
        plateau = new Case[size][size];
    }

    public Case[][] getPlateau() {
        return plateau;
    }

    public void mettreAjourCase(Plateau p, int n, String choix) {
        for(int i = 0; i < p.getSize(); i++) {
            for(int j = 0; j < p.getSize(); j++) {
                if(p.getPlateau()[i][j].getNum() == n && p.getPlateau()[i][j].getInfo().equals("empty"))
                    p.getPlateau()[i][j].setInfo(choix);
            }
        }
    }

    public boolean caseOccupee(Plateau p, int n) {
        for(int i = 0; i < p.getSize(); i++) {
            for(int j = 0; j < p.getSize(); j++) {
                if(p.getPlateau()[i][j].getNum() == n && p.getPlateau()[i][j].getInfo().equals("empty"))
                    return false;
            }
        }
        return true;
    }

    public int getSize() {
        return size;
    }

    public static void creation(Plateau p) {
        int c = 1;
        for(int i = 0; i < p.getSize(); i++) {
            for(int j = 0; j < p.getSize(); j++) {
                    p.getPlateau()[i][j] = new Case(c, "empty");
                    c++;
            } 
        }
    }
}