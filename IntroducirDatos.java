package SistemaDeBiblioteca;

import java.util.Scanner;
public class IntroducirDatos {
    
    Scanner sc = new Scanner(System.in);
    String ciencia;
    int opcion = 0;  

    public String introducirTitulo(){
        System.out.print("Titulo: ");
        return sc.nextLine();
        
    }

    public String introducirAutor(){
        System.out.print("Autor: ");
        return sc.nextLine();
    }

    public String introducirNombreEstante(){
        System.out.print("Escriba el nombre del estante que desea eliminar:");
        return sc.nextLine();
    }

    public String elegirCiencia(){              
        do{                      
            System.out.println("De que ciencia es el libro?");
            System.out.println("1. Astronomia");
            System.out.println("2. Biologia");
            System.out.println("3. Geologia");
            System.out.println("4. Matematica");
            System.out.println("5. Medicina");
            System.out.println("6. Quimica");
            System.out.println("Eliga una opcion");
            
            opcion = Integer.parseInt(sc.nextLine());         

            if (opcion == 1) {
                this.ciencia = "Astronomia";                
            }else if (opcion == 2){
                this.ciencia = "Biologia";
            }else if (opcion == 3){
                this.ciencia = "Geologia";
            }else if (opcion == 4){
                this.ciencia = "Matematica";
            }else if (opcion == 5){
                this.ciencia = "Medicina";
            }else if (opcion == 6){
                this.ciencia = "Quimica";
            }else{
                System.out.println("Esa opcion no esta disponible");
            }
        }while(opcion < 1 || opcion > 6);    
        return this.ciencia;
    }

    public int opcionLibrosExistentes (){              
        do{                      
            System.out.println("Que desea realizar?");
            System.out.println("1. Ver todos los libros disponibles y su estante de ubicacion");
            System.out.println("2. Ver todos los libros de Astronomia");
            System.out.println("3. Ver todos los libros de Biologia");
            System.out.println("4. Ver todos los libros de Geologia");
            System.out.println("5. Ver todos los libros de Matematica");
            System.out.println("6. Ver todos los libros de Medicina");
            System.out.println("7. Ver todos los libros de Quimica");
            System.out.println("8. Saber el total de todos los libros y total por ciencia");            
            System.out.println("Eliga una opcion");
            
            this.opcion = Integer.parseInt(sc.nextLine());    

        }while(opcion < 1 || opcion > 8);    
        return this.opcion;    
    }

    public int introducirCantPagina(){
        System.out.print("Cantidad da paginas: ");
        return Integer.parseInt(sc.nextLine());
    }

    public int ingresarOpcion(){
        System.out.println("Ingrese una opcion");
        return Integer.parseInt(sc.nextLine());
    }

    public int getOpcion(){
        return this.opcion;
    }

    public int modificarPropiedad(){              
        do{                      
            System.out.println("Que desea modificar del libro?");
            System.out.println("1. Titulo");
            System.out.println("2. Autor");
            System.out.println("3. CantPaginas");
            System.out.println("4. No quiero modificar nada");
            System.out.println("Eliga una opcion");    
            
            opcion = Integer.parseInt(sc.nextLine());     
                  
                        
        }while(opcion < 1 || opcion > 4);    
        return this.opcion;
    }

}