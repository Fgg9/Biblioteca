package SistemaDeBiblioteca;

public class Biblioteca {
    public static void main(String[] args) {
        IntroducirDatos in = new IntroducirDatos();
        CuartoEstantes CuartoEstante = new CuartoEstantes();
        int opcion = 0;
        do{
            System.out.println("\n----)Bienvenido A La Biblioteca Jiraya-Glenn(----");
            System.out.println("1. Agregar un libro");
            System.out.println("2. Buscar un libro");
            System.out.println("3. Modificar un libro");
            System.out.println("4. Eliminar un libro");
            System.out.println("5. Vaciar Estante");
            System.out.println("6. Ver libros existentes");
            System.out.println("7. Salir");

            opcion = in.ingresarOpcion();

            switch (opcion){
                case 1:
                    Libro libro = new Libro(in.introducirTitulo(), in.introducirAutor(), in.introducirCantPagina(), in.elegirCiencia());                    
                    CuartoEstante.agregarLibro(in.getOpcion(), libro);
                    break;
                case 2:
                    CuartoEstante.buscarLibro(in.introducirTitulo(), in.introducirAutor());                 
                    break;
                case 3:                    
                    CuartoEstante.modificarLibro(in.introducirTitulo(), in.introducirAutor());         
                    break;
                case 4:
                    CuartoEstante.eliminarLibro(in.introducirTitulo(), in.introducirAutor());                    
                    break;
                case 5:
                    CuartoEstante.mostrarEstantes();
                    CuartoEstante.vaciarEstante(in.introducirNombreEstante());
                    break;
                case 6:
                    CuartoEstante.verLibrosEsxistentes(in.opcionLibrosExistentes());
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Opcion no disponible.");
                    break;
            }
        }while(opcion != 7);
        
    }
}