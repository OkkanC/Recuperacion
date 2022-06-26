package examen;

import java.util.Scanner;

public class Examen{

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        Menus menuprincipal = new Menus();
        Menus vectores = new Menus();
        //Menus listas = new Menus();
        int opcion;
        
        System.out.print(menuprincipal.menuPrincipal()); opcion=entrada.nextInt();
        
         switch(opcion){
        
         //   case 1 -> listas.menuListas();
            
            case 2 -> vectores.menuVectores();
            
            default -> System.out.println("No es una opción válida");
        }  
    }
}