package examen;

import java.util.Scanner;

public class Menus{
    
    public String menuPrincipal(){
        System.out.println("-----Programa para el registro de departamentos -----");
        System.out.println("| Este Programa Utiliza:                           | ");
        System.out.println("| 1. Listas                                        |");
        System.out.println("| 2. Vectores                                      |");
        System.out.println("_____________________________________________________");
        return "Ingresa el número de la opción que quieras utilizar: ";
        }

    public void menuVectores(){
    ClaseVector TablaVector = new ClaseVector();
    Scanner entrada = new Scanner (System.in);
    int opcion;
    char opcion2 = 0;
    do{

    System.out.println("\n\n--------------------------Ingresaste a la Tabla con Vectores--------------------------------");
    System.out.println("| ¿Qué quieres hacer?                                                                      |");
    System.out.println("| 1. Ingresar Departamento                                                                 |");
    System.out.println("| 2. Mostrar Todos los Departamentos Ingresados                                            |");
    System.out.println("| 3. Buscar Departamento por Nombre e Indicar su Posición                                  |");
    System.out.println("| 4. Buscar Departamento por su Inicial                                                    |");
    System.out.println("| 5. Buscar Departamentos Registrados en una Posición Par y que tenga más de 4 municipios) |");
    System.out.println("| 6. Mostrar Cabecera del Departamento Ingresado                                           |");
    System.out.println("| 7. Mostrar los Departamentos Ingresados en las Posiciones Impares del Vector             |");
    System.out.println("| 0. Salir                                                                                 |");
    System.out.println("--------------------------------------------------------------------------------------------");
    System.out.print("Ingresa el número de la opción que quieras utilizar: "); opcion=entrada.nextInt();

    switch(opcion){

        case 1 -> {
            System.out.println("\n\n-.-.-.-.-.-.-Registro de Departamentos-.-.-.-.-.-.-");
            System.out.print("\nIngresa el Nombre del Departamento: "); String nombre = entrada.next();
            System.out.print("\nIngresa el Código del Departamento: "); int codigo = entrada.nextInt();
            System.out.print("\nIngresa la Cantidad de Municipios: "); int municipio = entrada.nextInt();
            System.out.print("\nIngresa la Cabecera: "); String cabecera = entrada.next();
            System.out.print("\nIngresa la Región (Norte, Sur, Este, Oeste): "); String region = entrada.next();
            System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
            System.out.print(TablaVector.departamento(municipio,codigo, nombre, cabecera,region));
            }      

        case 2 -> TablaVector.mostrarTodosLosDatos();

        case 3 -> TablaVector.departamentoPorNombre();

        case 4 -> TablaVector.departamentoPorInicial();

        case 5 -> TablaVector.mostrarEnPar();

        case 6 -> TablaVector.departamentoPorCabecera();

        case 7 -> TablaVector.mostrarEnImpar();

        default -> System.out.println("No es una opción válida");

    }
     System.out.print("\n¿Quieres Repetir la Tabla? S/N (Si/No) ó 0=Salir: "); opcion2=entrada.next().charAt(0);
     }while(opcion2 == 'S' ||opcion2 == 's'|| opcion2 == '1' || opcion2 ==0);
     System.out.println("\nGracias Por Utilizar Este Programa");
    }

    public void menuListas(){

    ClaseLista TablaLista = new ClaseLista();
    Scanner entrada = new Scanner (System.in);
    int opcion;
    char opcion2 = 0;
    do{

    System.out.println("\n\n---------------------Ingresaste a la Tabla con Listas-------------------------");
    System.out.println("| ¿Qué quieres hacer?                                                        |");
    System.out.println("| 1. Ingresar Departamento.                                                  |");
    System.out.println("| 2. Mostrar todos los Departamentos Registrados                             |");
    System.out.println("| 3. Verificar si un Departamento fue o no Registrado                        |");
    System.out.println("| 4. Buscar un Departamento por el Número de Lista en el que fue Registrado. |");
    System.out.println("| 0. Salir                                                                   |");
    System.out.println("------------------------------------------------------------------------------");
    System.out.print("Ingresa el número de la opción que quieras utilizar: "); opcion=entrada.nextInt();

    switch(opcion){

        case 1 -> TablaLista.departamento();      

        case 2 -> TablaLista.mostrarDepartamentos(); 

        default -> System.out.println("No es una opción válida");

    }
     System.out.print("\n¿Quieres Repetir la Tabla? S/N (Si/No) ó 1/0 (Si/No): "); opcion2=entrada.next().charAt(0);
     }while(opcion2 == 'S' ||opcion2 == 's' || opcion2 == '1' || opcion2 ==0);
     System.out.println("\nGracias Por Utilizar Este Programa");
    }
}