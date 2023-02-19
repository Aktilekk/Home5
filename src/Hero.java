public class Hero {
    private int Google;
    private int Heals;
    private String Super;

    public Hero(int Google, int Heals, String Super) {
        this.Heals = Heals;
        this.Google = Google;
        this.Super = Super;
    }

    public Hero(String Super, int Heals, int Google) {
        this.Super = Super;
        this.Heals = Heals;
        this.Google = Google;
    }

    public int getGoogle() {
        return Google;
    }


    public int getHeals() {
        return Heals;
    }


    public String getSuper() {
        return Super;
    }
}

