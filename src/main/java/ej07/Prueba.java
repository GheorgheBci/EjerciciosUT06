package ej07;

import java.util.ArrayList;

/**
 *
 * @author Jorge
 */
public class Prueba {

    public static void main(String[] args) {

        ArrayList<Trabajador> listaTrabajadores = new ArrayList<>();

        listaTrabajadores.add(new Camarero("Novato", "Paco", "López", "44727426L"));
        listaTrabajadores.add(new Camarero("Jefe", "Victor", "Ruíz", "82952063p"));
        listaTrabajadores.add(new Programador(5, "Sandra", "Romero", "75210903k"));
        listaTrabajadores.add(new Programador(1, "Diego", "Sánchez", "00942487f"));

        for (Trabajador listaTrabajadore : listaTrabajadores) {
            listaTrabajadore.cotizar();
        }
    }
}
