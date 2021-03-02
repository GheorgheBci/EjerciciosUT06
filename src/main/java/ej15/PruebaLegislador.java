package ej15;

import java.util.ArrayList;

/**
 *
 * @author Jorge
 */
public class PruebaLegislador {

    public static void main(String[] args) {

        ArrayList<Legislador> listaLegisladores = new ArrayList<>();

        listaLegisladores.add(new Diputado(3, "Málaga", "PSOE", "Paco", "López"));
        listaLegisladores.add(new Senador(5.4, "Sevilla", "PP", "Sandra", "Romero"));
        listaLegisladores.add(new Diputado(1, "Málaga", "Podemos", "Silvia", "Sánchez"));

        for (Legislador listaLegisladore : listaLegisladores) {
            System.out.println(listaLegisladore.getCamaraEnQueTrabaja());

            if (listaLegisladore instanceof Diputado) {
                ((Diputado) listaLegisladore).getNumeroAsiento();
            }
        }

        for (Legislador listaLegisladore : listaLegisladores) {
            System.out.println(listaLegisladore);
        }
    }
}
