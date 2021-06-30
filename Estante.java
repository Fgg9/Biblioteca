package SistemaDeBiblioteca;

import java.util.ArrayList;
public class Estante {
    private String nombre;
    ArrayList<Libro> libros = new ArrayList<>(10);
    Libro libro;
    int indice;
    int num;
    
    public Estante(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    } 

    public void agregarLibro(Libro libro){
        this.libros.add(libro);
    }

    public Libro buscarLibro(String titulo, String autor) {
        for (int i=0; i<libros.size(); i++){
            if(libros.get(i).getTitulo().equalsIgnoreCase(titulo) && libros.get(i).getAutor().equals(autor)){
                this.libro = libros.get(i);
                break;
            }else{
                this.libro = null;
            }
        }
        return this.libro;
    }

    public int eliminarLibro(String titulo, String autor) {
        this.num = 0;
        for (int i=0; i<libros.size(); i++){
            if(libros.get(i).getTitulo().equalsIgnoreCase(titulo) && libros.get(i).getAutor().equals(autor)){
                libros.remove(libros.get(i));
                System.out.println("El libro ha sido eliminado");
                this.num = 0;
                break;
            }else{
                this.num = 1;
            }
        }
        return this.num;
    }

    public int buscarIndice(String titulo, String autor) {
        for (int i=0; i<libros.size(); i++){
            if(libros.get(i).getTitulo().equalsIgnoreCase(titulo) && libros.get(i).getAutor().equalsIgnoreCase(autor)){
                this.indice = libros.indexOf(libros.get(i));
                break;
            }else{
                this.indice = 11;
            }
        }
        return this.indice;
    }

    public void mostrarLibros() {
        for (int i=0; i<libros.size(); i++){
            System.out.println(libros.get(i));    
        }
        System.out.println("");
    }

    public int contarLibros() {
        this.num = libros.size();
        return this.num;        
    }
    
    @Override
    public String toString() {
        return "Estante = '" + getNombre() + "'";
    }

}
