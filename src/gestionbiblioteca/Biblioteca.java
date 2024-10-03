
package gestionbiblioteca;
import java.util.ArrayList;

public class Biblioteca {
    
    private ArrayList<Libro> libros;
    
    public Biblioteca(){
        libros = new ArrayList<Libro>();
    }  

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }
    
  
    
    
    public boolean eliminarLibro(String isbn){
        for(Libro libro : libros){
            if(libro.getIsbn().equals(isbn)){
                return libros.remove(libro);
            }
        }
        return false;
    }
    
    public Libro buscarLibro(String isb){
        for(Libro libro : libros){
            if(libro.getIsbn().equals(isb)){
                return libro;
            }
        }
        return null;
    }
    
    public void mostrarLibros(){
        for(Libro libro : libros){
            System.out.println(libro);
            
        }
    }
    
} 
        
   
    

