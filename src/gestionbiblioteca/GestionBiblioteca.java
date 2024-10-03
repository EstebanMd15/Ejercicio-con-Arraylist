
package gestionbiblioteca;

import java.util.Scanner;

public class GestionBiblioteca{
    private Biblioteca b = new Biblioteca();
    Scanner in = new Scanner(System.in);

    public GestionBiblioteca() {
    }

    public Biblioteca getB() {
        return b;
    }

    public void setB(Biblioteca b) {
        this.b = b;
    }

    
    
    public static void main(String[] args) {
      Autor a1 = new Autor("1089478791", "Esteban Meneses", "Colombiano");
      Autor a2 = new Autor("27298260", "Rafael Lechowski", "Español");
      Autor a3 = new Autor("108150269", "Mario Mendoza", "Argentino");
      
      Libro l1 = new Libro("1512", "Cien años de soledad", a1, 200);
      Libro l2 = new Libro("1450", "Movidik", a2, 350);
      Libro l3 = new Libro("3690", "Juventud en Extasis", a3, 150);
      
      Biblioteca b = new Biblioteca();
      
      b.agregarLibro(l1);
      b.agregarLibro(l2);
      b.agregarLibro(l3);
      
      b.mostrarLibros();
        System.out.println("Buscando Libro...");
        System.out.println(b.buscarLibro("1512"));
        
        System.out.println("\nEliminando Libro...");
        System.out.println(b.eliminarLibro("1450\n"));
        b.mostrarLibros();
        
     
      
    }
   
      public void agregarLibro(){
        String libroRegistrado;
        System.out.println("DIGITE EL TITULO DEL LIBRO: ");
        for (Libro libro : libros) {
            libroRegistrado = in.next();
            
            
        }
              
    }
    
    void mostrarMenu(){
         int opcion;
         
         System.out.println("---MENU DE OPCIONES---");
         System.out.println("1.Agregar Libro");
         System.out.println("2.Mostrar Libro");
         System.out.println("3.Eliminar Libro");
         System.out.println("4.Salir");
         System.out.println("\n--DIGITE UNA OPCION--");
         opcion = in.nextInt();
         
         switch(opcion){
             case 1:b.agregarLibro(l);
                 
         }
         
        
     }
}
