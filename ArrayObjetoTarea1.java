/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayobjetotarea1;

 /* @author ALEX BELTRAN*/

class Vehiculo{
    public int valor;
    public String dimension;
    Vehiculo(int valor, String dimension)
    {
        this.valor=valor;
        this.dimension=dimension;
    }
}

public class ArrayObjetoTarea1 {
    public static void main(String[] args) {
    
        System.out.println("\t\tUniversidad de las Fuerzas Armadas ESPE-L");
        System.out.println("\n\t\t\t   Ingeniería Automotriz");
        System.out.println("\t\t\t\tProgramación");
        System.out.println("\n\t\t\t Docente: Ing. Luis Guerra");
        System.out.println("\t\t\t Estudiante: Alex Beltran");
        
        System.out.println("\n");
        
        Vehiculo[]arreglo;
        
        arreglo=new Vehiculo[10];
        
        arreglo[0]=new Vehiculo(80,"longitud.");
        arreglo[1]=new Vehiculo(50,"ancho.");
        arreglo[2]=new Vehiculo(24,"alto.");
        arreglo[3]=new Vehiculo(16,"depresión interna.");
        arreglo[4]=new Vehiculo(70,"distancia entre ejes.");
        arreglo[5]=new Vehiculo(3,"grosor de la superficie delantera.");
        arreglo[6]=new Vehiculo(10,"grosor de la superficie posterior.");
        arreglo[7]=new Vehiculo(4,"diámetro de la llanta.");
        arreglo[8]=new Vehiculo(20,"ancho del arduino.");
        arreglo[9]=new Vehiculo(25,"longitud del arduino.");
        
        
        
        for(int i=0;i<arreglo.length;i++)
            System.out.println("Elemento en "+i+": El vehículo"
                    + " presenta "+arreglo[i].valor+" cm de "+arreglo[i].dimension);
    }}
