package Module_3_java;

public enum jav {
    Junior(1, 1),
    Pleno(2, 4),
    Senior(3, 8);

    private int id;
    public int xp;
    jav(int id, int xp){
        this.id = id;
        this.xp = xp;
    }

    public int getId(){
        return this.id;
    }
}
