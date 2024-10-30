/*
Adrian Ricardo 

Urgiles Medina 

2005
 */
package ejemplo01;

/**
 *
 * @author reroes
 */
public class Ejemplo10 {
    public static void main(String[] args) {
        // Secuencia de escape \n y \t
        String nombreEstudiante = "Adrian Ricardo";
        String apellidoEstudiante = "Urgiles Medina";
        int nacimiento = 2005;
        int edad = 19; 
        
        /*System.out.println(nombreEstudiante+"\n"+apellidoEstudiante+ "\n"+ 
                nacimiento);
        
        System.out.println(nombreEstudiante+"\n\n"+apellidoEstudiante+ "\n\n"+ 
                nacimiento);
        
        System.out.println(nombreEstudiante+"\n"+"\n"+apellidoEstudiante+ "\n"+
                "\n"+ nacimiento); */
         System.out.println(nombreEstudiante+"\t"+apellidoEstudiante);   
        System.out.println(nombreEstudiante+"\n\n\t"+edad);   

    }
}
