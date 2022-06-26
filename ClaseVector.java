package examen;

import java.util.Scanner;

public class ClaseVector {
    
    private String[] paraDatos, tablaDepartamento, Cabecera;
    private int indice, IndiceDepartamentos;
    private int IndiceCabecera;
    private int[] Municipio;
    private int indiceMunicipio;
    private int[] Codigo;
    private int indiceCodigo;
 
    
     public ClaseVector(){
        paraDatos= new String[1000];
        this.indice=0;
        Cabecera= new String[1000];
        this.indice=0;
        tablaDepartamento= new String[1000];
        this.IndiceDepartamentos=0; 
        Municipio= new int[1000];
        this.indiceMunicipio=0;
        Codigo= new int[1000];
        this.indiceCodigo=0;
     }
    
    public String departamento (int municipio, int codigo, String nombre, String cabecera, String region){
    String resultado = "";
    this.tablaDepartamento(" ",nombre, resultado, municipio," ", cabecera, region,codigo);
    return "";
    } 
    
    private void tablaDepartamento(String haytexto, String nombre, String resultado, int municipio, String haytexto2, String cabecera, String region, int codigo) {
    indice= indice+1;
    indiceMunicipio= indiceMunicipio+1;
    indiceCodigo= indiceCodigo+1;
    IndiceDepartamentos= IndiceDepartamentos+1;
    IndiceCabecera= IndiceCabecera+1;
    paraDatos[indice]= "\n___________________________________________\n       Tabla del Departamento        \nNombre de Departamento: "+nombre+". \nCodigo: "+codigo+". \nMunicipios: "+municipio+   ". \nCabecera: "+cabecera+". \nRegion: "+region+". \n___________________________________________";
    tablaDepartamento[IndiceDepartamentos]= nombre;
    Municipio[indiceMunicipio]= municipio;
    Codigo[indiceCodigo]= codigo;
    Cabecera[IndiceCabecera]= cabecera;
    }
    
    public void mostrarTodosLosDatos(){
        try{       
            for (int i=0; i<paraDatos.length;i++){
                if(paraDatos[i]  != null){
                 System.out.println(paraDatos[i]);
                }
            }
            for(String registro : paraDatos){
                if(registro != null){}   
            } 
        }catch(Exception repeticion){
            System.out.println(repeticion.getMessage());       
        }
    }
    
     public void departamentoPorNombre(){
        
        int contador=-1;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("\nIngresa el Departamento que Quieres Buscar: "); String nombre=entrada.next();
        for (int i=0; i<tablaDepartamento.length;i++){
            
            if(tablaDepartamento[i] == null ? nombre == null : tablaDepartamento[i].equals(nombre)){
            contador=i;
            }
        }
        
        if(contador==-1){
        System.out.println("\n");
        System.out.println(".-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.");
        System.out.println("| El Departamento NO ha sido Ingresado.|");
        System.out.println(".-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.");
        
        }else{
        System.out.println("\n");
        System.out.println(".-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.");
        System.out.println("| El Departamento SÍ está Ingresado, se encuentra en la Posición ["+contador+"] |");
        System.out.println(".-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-..-");
        } 

      }
}
