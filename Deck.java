import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Deck {
    public static void main(String[] args) throws IOException {

        Card card = new Card();
        int palos = card.palo.length;
        int valores = card.valor.length;




        ArrayList<String> deck = new ArrayList<String>();
        for (int i = 0; i < valores; i++) {
            for (int e = 0; e < palos; e++) {
                deck.add(card.palo[e] + "rojo " + card.valor[i]);
                deck.add(card.palo[e] + "negro " + card.valor[i]);
            }

            Iterator<String> nombreIterator = deck.iterator();
            while (nombreIterator.hasNext()) {
                String elemento = nombreIterator.next();

            }



            int menu;
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Seleccione una opcion: 1-shuffle 2-head 3-pick 4-hand 5-salir");
            menu = Integer.parseInt(in.readLine());


            if (menu == 1)
            {
                suffle(deck);
            }
            else
            {
                if (menu == 2)
                {
                    head(deck);
                }
                else
                {
                    if (menu == 3)
                    {
                        pick(deck);
                    }
                    else
                    {
                        if (menu == 4)
                        {
                            hand(deck);
                        }
                        else
                        {
                            if (menu == 5)
                            {
                                System.out.println("Fin de el programa");
                                break;
                            }
                            else
                            {
                                System.out.println("Error, seleccione una opcion valida");
                            }
                        }
                    }
                }
            }

        }
    }




    public static void suffle(ArrayList deck) {
        ArrayList<String> values = deck;
        Collections.shuffle(values);
        System.out.println("Se mezcló el deck. \n ");
        Iterator<String> nombreIterator2 = deck.iterator();
        while(nombreIterator2.hasNext()) {
            String elemento = nombreIterator2.next();

        }

    }
    public static void head (ArrayList deck) {
        System.out.println(deck.get(0));
        deck.remove(0);
        System.out.println("Quedan " + deck.size() + " cartas en el deck \n");
    }
    public static void pick(ArrayList deck) {
        Random aleatorio  = new Random();
        System.out.println(deck.get(aleatorio.nextInt(deck.size())));
        deck.remove(aleatorio.nextInt(deck.size()));
        System.out.println("Quedan " + deck.size() + " cartas \n");
    }

    public static void hand(ArrayList deck) {
        for (int i=0; i<=4; i++) {
            System.out.println(deck.get(i));
        }
        for (int i=0; i<=4; i++) {
            deck.remove(i);
        }
        System.out.println("Quedan " + deck.size() + " cartas");
    }
}


