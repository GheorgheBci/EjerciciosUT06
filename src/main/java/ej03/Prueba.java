package ej03;

/**
 *
 * @author Jorge
 */
public class Prueba {
    
    public static void main(String[] args) {
        
        Persona p1 = new Persona("Paco", "B34674346L", 34);
        
        Empleado e1 = new Empleado(1500, "Luis", "E87342953K", 29);
        
        Programador pro1 = new Programador(TipoCategoria.ANALISTA, 1300, "Pepe", "T49258244W", 28);
        
        System.out.println(p1);
        
        System.out.println(e1);
        
        System.out.println(pro1);
        
        e1.aumentarSalario(500);
        
        pro1.aumentarSalario(200);
        
        System.out.println("");
        
        System.out.println(e1);
        
        System.out.println(pro1);
    }
}
