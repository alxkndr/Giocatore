public class Giocatore {

    private String nome;

    private boolean capitano;

    private int goal;

    public Giocatore(String nome, boolean capitano, int goal) {
        this.nome = nome;
        this.capitano = capitano;
        this.goal = goal;
    }

    public Giocatore() {

    }


    public String getNome(){
        return nome;
    }

    public boolean getCapitano(){
        return capitano;
    }

    public int getGoal(){
        return goal;
    }

}
