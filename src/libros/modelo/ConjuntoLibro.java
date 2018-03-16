
package libros.modelo;

import java.util.ArrayList;
import java.util.Scanner;


public class ConjuntoLibro {
    private ArrayList<Libro> libros;
    
    Scanner lector = new Scanner(System.in);
    
    
    
    
    
    public ConjuntoLibro(ArrayList<Libro> libros){
        this.libros = new ArrayList<>();
    }
    
   
    public void anadirLibro(){
        Libro auxiliar;
        
        int n;
        
        do{
            System.out.println("Cuantos libros desea anadir? ");
            n = lector.nextInt();   
        }while ( n <= 0);
        lector.nextLine();
        
        for (int i = 1; i <= n; i++){
            System.out.println("Libro" + i);
            System.out.println("Titulo: ");
            String titulo = lector.next();
            System.out.println("Autor: ");
            String autor = lector.next();
            System.out.println("Numero de paginas: ");
            int numeroPaginas = lector.nextInt();
            System.out.println("Calificacion 1-10: ");
            int calificacion = lector.nextInt();
            lector.nextLine();
            
            auxiliar = new Libro(titulo, autor, numeroPaginas, calificacion);
            auxiliar.setTitulo(titulo);
            auxiliar.setAutor(autor);
            auxiliar.setNumeroPaginas(numeroPaginas);
            auxiliar.setCalificacion(calificacion);
            
            libros.add(auxiliar);
            
            
        }
        
        
    }    

    public Libro eliminarxAutor(){
        
        System.out.println("Escriba el autor para el cual desea eliminar libro(s): ");
        String eliminar = lector.next();
        Libro eliminarEste = libros.get(0);
        for(int i = 0; i < libros.size() ; i++){
            if(eliminar == eliminarEste.getAutor()){
                eliminar = eliminarEste.getAutor();
                libros.remove(eliminar);
            }
            
        }
        
        return eliminarEste;
    }
    
    public Libro mayorCalificado(){
        Libro mayorCalificado = libros.get(0);
        for(int i = 0; i < libros.size() ; i++){
            if( libros.get(i).getCalificacion() > mayorCalificado.getCalificacion() ){
                mayorCalificado = libros.get(i);
            }
        }
        System.out.println("El libro con mayor calificacion es: " + mayorCalificado.getTitulo());
        return mayorCalificado;
    }
    public Libro menorCalificado(){
        Libro menorCalificado = libros.get(0);
        for(int i = 0; i < libros.size();i++){
            if( libros.get(i).getCalificacion() < menorCalificado.getCalificacion() ){
                menorCalificado = libros.get(i);
            }
        }
        System.out.println("El libro con mayor calificacion es: " + menorCalificado.getTitulo());
        return menorCalificado;
    }
    
    
    
    
    
    
    
    
}
