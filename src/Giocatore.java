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
        setNome(nome);
        setCapitano(capitano);
        setGoal(goal);
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

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCapitano(boolean capitano){
        this.capitano = capitano;
    }

    public void setGoal(int goal){
        this.goal = goal;
    }

    public static void AggiungiGiocatore(Giocatore squadra, String nome, boolean capitano, int goal, int count){
        squadra[count] = new Giocatore(nome, capitano, goal);
    }
    public static void VisualizzaRosa(String[]arrayGiocatore, String[]arrayCapitano, String[]arrayGoal){
        for (int i = 0; i < arrayGiocatore.length; i++){
            if (arrayGiocatore[i] == null){
                break;
            }
            else {
                System.out.println("Giocatore: " + arrayGiocatore[i]+ " Capitano:" + arrayCapitano[i] + " Goal:" + arrayGoal[i]);
            }
        }
    }
}
