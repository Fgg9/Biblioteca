package SistemaDeBiblioteca;

public class Libro{
    private String titulo;
    private String autor;
    private String ciencia;
    private int cantPaginas;
   
    public Libro(String titulo, String autor, int cantPaginas, String ciencia){
        this.titulo = titulo;
        this.autor = autor;
        this.ciencia = ciencia;
        this.cantPaginas = cantPaginas; 

    }    

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor(){
        return this.autor;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public String getCiencia() {
        return this.ciencia;
    }
    
    public int getCantPaginas() {
        return this.cantPaginas;
    }

    public void setCantPaginas(int cantPaginas) {
        this.cantPaginas = cantPaginas;
    }    

    @Override
    public String toString() {
        return "[" +
            " Titulo='" + this.getTitulo() + "'" +
            ", Autor='" + this.getAutor() + "'" +
            ", Ciencia='" + this.getCiencia() + "'" +
            ", CantPaginas='" + this.getCantPaginas() + "'" +
            "]";
    }

} 
