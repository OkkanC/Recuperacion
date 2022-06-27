package examen;

import java.util.ArrayList;
import java.util.Scanner;

public class ClaseLista {
    
   ArrayList<ParaLista> TablasDeListas = new ArrayList();
   Scanner entrada= new Scanner(System.in);
   
   public void departamento(){
   
   System.out.println("\n-.-.-.-.-.-.-Registro de Departamentos-.-.-.-.-.-.-");    
   System.out.print("\nIngresa el Nombre del Departamento: "); String nombre = entrada.next();
   System.out.print("\nIngresa el Codigo del Departamento: "); String codigo = entrada.next();
   System.out.print("\nIngresa el Número de Municipios: "); String municipios = entrada.next();
   System.out.print("\nIngresa la Cabecera: "); String cabecera = entrada.next();
   System.out.print("\nIngresa la Region (Norte, Sur, Este, Oeste): "); String region = entrada.next();
   System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
    
    ParaLista lista = new ParaLista();
     lista.setNombre(nombre);
     lista.setMunicipios(municipios);
     lista.setRegion(region);
     lista.setCabecera(cabecera);
     lista.setCodigo(codigo);
     TablasDeListas.add(lista);
     
   }

    public void mostrarDepartamentos(){
   
        for(int i=0;i<TablasDeListas.size();i++){
          
          System.out.println("\n-----------Departamentos Ingresados------------");
          System.out.println("  Nombre: "+TablasDeListas.get(i).getNombre());
          System.out.println("  Código: "+TablasDeListas.get(i).getCodigo());
          System.out.println("  Municipios: "+TablasDeListas.get(i).getMunicipios());
          System.out.println("  Cabecera: "+TablasDeListas.get(i).getCabecera());
          System.out.println("  Región: "+TablasDeListas.get(i).getRegion());
          System.out.println("-----------------------------------------------");
        }
    }
   
    public void buscarDepartamentoPorNombre(){
      
      System.out.println("\n\n..-..-..-..-..-..-..-..-..-..-..-..-..-..-..-..-..-..--..--..--..");   
        for(int i=0;i<TablasDeListas.size();i++){
          
          System.out.print("Ingrese el Nombre del Departamento que Quiere Buscar: "); String BuscarDepartamento = entrada.next();
          boolean siEsta = TablasDeListas.get(i).getNombre().contains(BuscarDepartamento); 
          
          if (siEsta){
          System.out.println("El Departamento Buscado YA Ha Sido Ingresado");
          }else{
          System.out.println("El Departamento Buscado NO Ha Sido Ingresado");}
          
          break;  
        }
        System.out.println("..-..-..-..-..-..-..-..-..-..-..-..-..-..-..-..-..-..--..--..--..\n");
    }
}