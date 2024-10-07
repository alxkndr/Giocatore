import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Quanti giocatori vuoi nella tua squadra: ");
        int n = in.nextInt();
        Giocatore[] squadra;
        squadra = new Giocatore[n];

        int count = 0;
        boolean input = false;

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
                    for (int i = 0; i < count; i++) {
                        System.out.println("Aggiungi il nome del giocatore: ");
                        String nome = in.next();
                        System.out.println("Scegli se è capitano o meno (true/false): ");
                        boolean capitano = in.nextBoolean();
                        System.out.println("Goal: ");
                        int goal = in.nextInt();
                        Giocatore.AggiungiGiocatore(squadra, nome, capitano, goal, count);
                    }
                    count++;
                    break;
                case 0:
                    input = true;
                    System.out.println("Stai uscendo dal campo...");
                    break;
            }
        }while (!input);
    }
}

