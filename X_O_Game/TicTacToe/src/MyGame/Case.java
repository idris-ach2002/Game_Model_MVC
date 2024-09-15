package MyGame;


public class Case {
    private int num;
    private String info;

    public Case(int _n,String _i) {
        num = _n;
        info = _i;
    }

    public int getNum() {
        return num;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String _i) {
        info = _i;
    }
}
