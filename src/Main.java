import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Giocatore g1 = new Giocatore("Cristiano Ronaldo", true, 900);
        Giocatore g2 = new Giocatore();
        Giocatore g3 = new Giocatore("Kylian Mbappè", false, 300);

        Scanner in = new Scanner(System.in);
        boolean input = false;
        String[] arrayGiocatore = new String[10];
        boolean[] arrayCapitano = new boolean[10];
        int[] arrayGoal = new int[10];
        int count = 0;
        do {

            System.out.println("1- Aggiungere un giocatore alla squadra, controllando che non ci sia più di un capitano");
            System.out.println("2- Visualizzare tutti i giocatori della squadra");
            System.out.println("3- Modificare i dati di un giocatore a scelta");
            System.out.println("4- Cancellare un giocatore dalla squadra ");
            System.out.println("5- Visualizzare i giocatori che hanno realizzato più di 5 goal.");
            System.out.println("6- Visualizzare il nome del capitano");
            System.out.println("7- Assegnare il ruolo di capitano in modo casuale se non ancora presente");
            System.out.println("0- Esci dal concessionario");

            int scelta = in.nextInt();

            switch (scelta) {
                case 1:
                    System.out.println("Aggiungi un giocatore... ");
                    System.out.println("Nome: ");
                    String nome = in.next();
                    System.out.println("Capitano (true/false): ");
                    boolean capitano = in.hasNext();
                    System.out.println("Goal: ");
                    int goal = in.nextInt();
                    Giocatore.AggiungiGiocatore(arrayGiocatore,arrayCapitano,arrayGoal,nome,capitano,goal, count);
                    count++;
                    break;
                case 0:
                    input = true;
                    System.out.println("Stai uscendo dal concessionario...");
                    break;
            }
        } while (!input);
    }
}

