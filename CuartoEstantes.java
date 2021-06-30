package SistemaDeBiblioteca;

import java.util.ArrayList;

public class CuartoEstantes {
    ArrayList<Estante> Astronomia = new ArrayList<>();
    ArrayList<Estante> Biologia = new ArrayList<>();
    ArrayList<Estante> Geologia = new ArrayList<>();
    ArrayList<Estante> Matematica = new ArrayList<>();
    ArrayList<Estante> Medicina = new ArrayList<>();
    ArrayList<Estante> Quimica = new ArrayList<>(); 

    IntroducirDatos in = new IntroducirDatos();
    int num;
    Libro libro;
    int indiceLibro;
    int indiceEstante;
    int opcion;
    //variables para contabilizar los libros totales y por ciencia
    int contGeneral, contAstronomia, contBiologia, contGeologia, contMatematica, contMedicina, contQuimica, contador;
    
    //"bloque de inicializacion no estatico", es valido porque solo creare
    //una instancia de esta clase.
    //y con este bloque tengo mi primer estante de cada materia por default
    {
        Astronomia.add(new Estante("Astronomia 1"));
        Biologia.add(new Estante("Biologia 1"));
        Geologia.add(new Estante("Geologia 1"));
        Matematica.add(new Estante("Matematica 1"));
        Medicina.add(new Estante("Medicia 1"));
        Quimica.add(new Estante("Quimica 1"));
    }

    public void agregarLibro(int opcion, Libro libro){        
        switch (opcion){
            case 1:
                for (int i=0; i<Astronomia.size(); i++){
                    if (Astronomia.get(i).libros.size() < 10){
                        Astronomia.get(i).agregarLibro(libro);
                        num = 1;
                        break;
                    }else{
                        num = 0;
                    }
                }
                if (num == 0){
                    NuevoEstante(opcion, libro);
                    System.out.println("El libro se ha guardado de manera exitosa");
                }else{
                    System.out.println("El libro se ha guardado de manera exitosa");
                }               
                break;
            case 2:
                for (int i=0; i<Biologia.size(); i++){
                    if (Biologia.get(i).libros.size() < 10){
                        Biologia.get(i).agregarLibro(libro);
                        num = 1;
                        break;
                    }else{
                        num = 0;
                    }
                }
                if (num == 0){
                    NuevoEstante(opcion, libro);
                    System.out.println("El libro se ha guardado de manera exitosa");
                }else{
                    System.out.println("El libro se ha guardado de manera exitosa");
                }                 
                break;
            case 3:
                for (int i=0; i<Geologia.size(); i++){
                    if (Geologia.get(i).libros.size() < 10){
                        Geologia.get(i).agregarLibro(libro);
                        num = 1;
                        break;
                    }else{
                        num = 0;
                    }
                }
                if (num == 0){
                    NuevoEstante(opcion, libro);
                    System.out.println("El libro se ha guardado de manera exitosa");
                }else{
                    System.out.println("El libro se ha guardado de manera exitosa");
                }                 
                break;
            case 4:
                for (int i=0; i<Matematica.size(); i++){
                    if (Matematica.get(i).libros.size() < 10){
                        Matematica.get(i).agregarLibro(libro);
                        num = 1;
                        break;
                    }else{
                        num = 0;
                    }
                }
                if (num == 0){
                    NuevoEstante(opcion, libro);
                    System.out.println("El libro se ha guardado de manera exitosa");
                }else{
                    System.out.println("El libro se ha guardado de manera exitosa");
                }                 
                break;
            case 5:
                for (int i=0; i<Medicina.size(); i++){
                    if (Medicina.get(i).libros.size() < 10){
                        Medicina.get(i).agregarLibro(libro);
                        num = 1;
                        break;
                    }else{
                        num = 0;
                    }
                }
                if (num == 0){
                    NuevoEstante(opcion, libro);
                    System.out.println("El libro se ha guardado de manera exitosa");
                }else{
                    System.out.println("El libro se ha guardado de manera exitosa");
                }                 
                break;
            case 6:
                for (int i=0; i<Quimica.size(); i++){
                    if (Quimica.get(i).libros.size() < 10){
                        Quimica.get(i).agregarLibro(libro);
                        num = 1;
                        break;
                    }else{
                        num = 0;
                    }
                }
                if (num == 0){
                    NuevoEstante(opcion, libro);
                    System.out.println("El libro se ha guardado de manera exitosa");
                }else{
                    System.out.println("El libro se ha guardado de manera exitosa");
                }                 
                break;
        }
    }

    public void NuevoEstante(int opcion, Libro libro){        
        switch (opcion){
            case 1:
                num = Astronomia.size()+1;
                Estante aux = new Estante("Astronomia "+num);
                Astronomia.add(aux);
                aux.agregarLibro(libro);
                break;
            case 2:
                num = Biologia.size()+1;
                Estante aux1 = new Estante("Biologia "+num);
                Biologia.add(aux1);  
                aux1.agregarLibro(libro); 
                break;
            case 3:
                num = Geologia.size()+1;
                Estante aux2 = new Estante("Geologia "+num);
                Geologia.add(aux2);
                aux2.agregarLibro(libro); 
                break;                
            case 4:
                num = Matematica.size()+1;
                Estante aux3 = new Estante("Matematica "+num);
                Matematica.add(aux3);  
                aux3.agregarLibro(libro);    
                break;
            case 5:
                num = Medicina.size()+1;
                Estante aux4 = new Estante("Medicina "+num);
                Medicina.add(aux4);   
                aux4.agregarLibro(libro);   
                break;
            case 6:
                num = Quimica.size()+1;
                Estante aux5 = new Estante("Quimica "+num);
                Quimica.add(aux5);   
                aux5.agregarLibro(libro); 
        } 
        
    }

    public void buscarLibro(String titulo, String autor){
        num = 0;
        for(int i = 0; i < Astronomia.size(); i++){
            this.libro = Astronomia.get(i).buscarLibro(titulo, autor);
            if (this.libro != null){
                System.out.println("Se encuentra en el estante: " +Astronomia.get(i).getNombre());
                System.out.println(this.libro);
                num = 1;
                break;
            }
        }
        if (num != 1){
            for(int i = 0; i < Biologia.size(); i++){
                this.libro = Biologia.get(i).buscarLibro(titulo, autor);
                if (this.libro != null){
                    System.out.println("Se encuentra en el estante: " +Biologia.get(i).getNombre());
                    System.out.println(this.libro);
                    num = 1;
                    break;
                }
            }
        }
        if (num != 1){
            for(int i = 0; i < Geologia.size(); i++){
                this.libro = Geologia.get(i).buscarLibro(titulo, autor);
                if (this.libro != null){
                    System.out.println("Se encuentra en el estante: " +Geologia.get(i).getNombre());
                    System.out.println(this.libro);
                    num = 1;
                    break;
                }
            }
        }    
        if (num != 1){
            for(int i = 0; i < Matematica.size(); i++){
                this.libro = Matematica.get(i).buscarLibro(titulo, autor);
                if (this.libro != null){
                    System.out.println("Se encuentra en el estante: " +Matematica.get(i).getNombre());
                    System.out.println(this.libro);
                    num = 1;
                }
            }
        }
        if (num != 1){
            for(int i = 0; i < Medicina.size(); i++){
                this.libro = Medicina.get(i).buscarLibro(titulo, autor);
                if (this.libro != null){
                    System.out.println("Se encuentra en el estante: " +Medicina.get(i).getNombre());
                    System.out.println(this.libro);
                    num = 1;
                }
            }
        }
        if (num != 1){
            for(int i = 0; i < Quimica.size(); i++){
                this.libro = Quimica.get(i).buscarLibro(titulo, autor);
                if (this.libro != null){
                    System.out.println("Se encuentra en el estante: " +Quimica.get(i).getNombre());
                    System.out.println(this.libro);
                    num = 1;
                }
            }
        }
        if (num != 1){
            System.out.println("El libro que busca no se encuentre en esta Biblioteca");
        }
    }

    public void obtenerIndice(String titulo, String autor){
        num = 0;
        this.indiceLibro = 0;
        this.indiceEstante = 0;
        this.opcion =0;
        for(int i = 0; i < Astronomia.size(); i++){
            this.indiceLibro = Astronomia.get(i).buscarIndice(titulo, autor);
            if (this.indiceLibro != 11){
                this.indiceEstante = Astronomia.indexOf(Astronomia.get(i));
                this.opcion = 1;
                num = 1;
                break;
            }
        }
        if (num != 1){
            for(int i = 0; i < Biologia.size(); i++){
                this.indiceLibro = Biologia.get(i).buscarIndice(titulo, autor);
                if (this.indiceLibro != 11){
                    this.indiceEstante = Biologia.indexOf(Biologia.get(i));
                    this.opcion = 2;
                    num = 1;
                    break;
                }
            }
        }
        if (num != 1){
            for(int i = 0; i < Geologia.size(); i++){
                this.indiceLibro = Geologia.get(i).buscarIndice(titulo, autor);
                if (this.indiceLibro != 11){
                    this.indiceEstante = Geologia.indexOf(Geologia.get(i));
                    this.opcion = 3;
                    num = 1;
                    break;
                }
            }
        }    
        if (num != 1){
            for(int i = 0; i < Matematica.size(); i++){
                this.indiceLibro = Matematica.get(i).buscarIndice(titulo, autor);
                if (this.indiceLibro != 11){
                    this.indiceEstante = Matematica.indexOf(Matematica.get(i));
                    this.opcion =4;
                    num = 1;
                    break;
                }
            }
        }
        if (num != 1){
            for(int i = 0; i < Medicina.size(); i++){
                this.indiceLibro = Medicina.get(i).buscarIndice(titulo, autor);
                if (this.indiceLibro != 11){
                    this.indiceEstante = Medicina.indexOf(Medicina.get(i));
                    this.opcion = 5;
                    num = 1;
                    break;
                }
            }
        }
        if (num != 1){
            for(int i = 0; i < Quimica.size(); i++){
                this.indiceLibro = Quimica.get(i).buscarIndice(titulo, autor);
                if (this.indiceLibro != 11){
                    this.indiceEstante = Quimica.indexOf(Quimica.get(i));
                    this.opcion = 6;
                    num = 1;
                    break;
                }
            }
        }
        if (num != 1){
            System.out.println("El libro que quiere modificar no se encuentra en esta Biblioteca");
        }
    }
    
    public void modificarLibro(String titulo, String autor){
        obtenerIndice(titulo, autor);
        switch (opcion){
            case 1:
                do{
                    opcion = in.modificarPropiedad();
                    switch (opcion){
                        case 1:
                            Astronomia.get(this.indiceEstante).libros.get(this.indiceLibro).setTitulo(in.introducirTitulo());
                            break;
                        case 2:
                            Astronomia.get(this.indiceEstante).libros.get(this.indiceLibro).setAutor(in.introducirAutor());
                            break;
                        case 3:
                            Astronomia.get(this.indiceEstante).libros.get(this.indiceLibro).setCantPaginas(in.introducirCantPagina());
                            break;
                        case 4:
                            break;
                        default:
                            System.out.println("Opcion no disponible.");
                            break;
                    }                   
                }while (opcion != 4); 
                break;
            case 2:
                do{
                    opcion = in.modificarPropiedad();
                    switch (opcion){
                        case 1:
                            Biologia.get(this.indiceEstante).libros.get(this.indiceLibro).setTitulo(in.introducirTitulo());
                            break;
                        case 2:
                            Biologia.get(this.indiceEstante).libros.get(this.indiceLibro).setAutor(in.introducirAutor());
                            break;
                        case 3:
                            Biologia.get(this.indiceEstante).libros.get(this.indiceLibro).setCantPaginas(in.introducirCantPagina());
                            break;
                        case 4:
                            break;
                        default:
                            System.out.println("Opcion no disponible.");
                            break;
                    }
                }while (opcion != 4); 
                break;
            case 3:
                do{
                    opcion = in.modificarPropiedad();
                    System.out.println("");
                    switch (opcion){
                        case 1:
                            Geologia.get(this.indiceEstante).libros.get(this.indiceLibro).setTitulo(in.introducirTitulo());
                            break;
                        case 2:
                            Geologia.get(this.indiceEstante).libros.get(this.indiceLibro).setAutor(in.introducirAutor());
                            break;
                        case 3:
                            Geologia.get(this.indiceEstante).libros.get(this.indiceLibro).setCantPaginas(in.introducirCantPagina());
                            break;
                        case 4:
                            break;
                        default:
                            System.out.println("Opcion no disponible.");
                            break;
                    }
                }while (opcion != 4); 
                break;            
            case 4:
                do{
                    opcion = in.modificarPropiedad();
                    switch (opcion){
                        case 1:
                            Matematica.get(this.indiceEstante).libros.get(this.indiceLibro).setTitulo(in.introducirTitulo());
                            break;
                        case 2:
                            Matematica.get(this.indiceEstante).libros.get(this.indiceLibro).setAutor(in.introducirAutor());
                            break;                        
                        case 3:
                            Matematica.get(this.indiceEstante).libros.get(this.indiceLibro).setCantPaginas(in.introducirCantPagina());
                            break;
                        case 4:
                            break;
                        default:
                            System.out.println("Opcion no disponible.");
                            break;
                    }
                }while (opcion != 4); 
                break;            
            case 5:
                do{
                    opcion = in.modificarPropiedad();
                    switch (opcion){
                        case 1:
                            Medicina.get(this.indiceEstante).libros.get(this.indiceLibro).setTitulo(in.introducirTitulo());
                            break;
                        case 2:
                            Medicina.get(this.indiceEstante).libros.get(this.indiceLibro).setAutor(in.introducirAutor());
                            break;                        
                        case 3:
                            Medicina.get(this.indiceEstante).libros.get(this.indiceLibro).setCantPaginas(in.introducirCantPagina());
                            break;
                        case 4:
                            break;
                        default:
                            System.out.println("Opcion no disponible.");
                            break;
                    }
                }while (opcion != 4); 
                break;            
            case 6:
                do{
                    opcion = in.modificarPropiedad();
                    switch (opcion){
                        case 1:
                            Quimica.get(this.indiceEstante).libros.get(this.indiceLibro).setTitulo(in.introducirTitulo());
                            break;
                        case 2:
                            Quimica.get(this.indiceEstante).libros.get(this.indiceLibro).setAutor(in.introducirAutor());
                            break;                        
                        case 3:
                            Quimica.get(this.indiceEstante).libros.get(this.indiceLibro).setCantPaginas(in.introducirCantPagina());
                            break;
                        case 4:
                            break;
                        default:
                            System.out.println("Opcion no disponible.");
                            break;
                    }
                }while (opcion != 4); 
                break;            
        }        
    }   
    
    public void eliminarLibro(String titulo, String autor){
        this.num = 0;
        for(int i = 0; i < Astronomia.size(); i++){
            this.num = Astronomia.get(i).eliminarLibro(titulo, autor);
        }
        if (this.num == 1){
            for(int i = 0; i < Biologia.size(); i++){
                this.num = Biologia.get(i).eliminarLibro(titulo, autor);                
            }
        }
        if (this.num == 1){
            for(int i = 0; i < Geologia.size(); i++){
                this.num = Geologia.get(i).eliminarLibro(titulo, autor);
                
            }
        }    
        if (this.num == 1){
            for(int i = 0; i < Matematica.size(); i++){
                this.num = Matematica.get(i).eliminarLibro(titulo, autor);
            }
        }
        if (this.num == 1){
            for(int i = 0; i < Medicina.size(); i++){
                this.num = Medicina.get(i).eliminarLibro(titulo, autor);                
            }
        }
        if (this.num == 1){
            for(int i = 0; i < Quimica.size(); i++){
                this.num = Quimica.get(i).eliminarLibro(titulo, autor);                
            }
        }
        if (num == 1){
            System.out.println("El libro no se encuentre en esta Biblioteca");
        }
    }

    public void vaciarEstante(String nombreEstante){
        this.num = 0;
        for(int i = 0; i < Astronomia.size(); i++){
            if(Astronomia.get(i).getNombre().equalsIgnoreCase(nombreEstante)){
                Astronomia.get(i).libros.clear();
                break;
            }else{
                this.num = 1;
            }
        }
        if (this.num == 1){
            for(int i = 0; i < Biologia.size(); i++){
                if(Biologia.get(i).getNombre().equalsIgnoreCase(nombreEstante)){
                    Biologia.get(i).libros.clear();
                    this.num =0;
                }
            }
        }
        if (this.num == 1){
            for(int i = 0; i < Geologia.size(); i++){
                if(Geologia.get(i).getNombre().equalsIgnoreCase(nombreEstante)){
                    Geologia.get(i).libros.clear();
                    this.num =0;
                }
            }
        }
        if (this.num == 1){
            for(int i = 0; i < Matematica.size(); i++){
                if(Matematica.get(i).getNombre().equalsIgnoreCase(nombreEstante)){
                    Matematica.get(i).libros.clear();
                    this.num =0;
                }
            }
        }
        if (this.num == 1){
            for(int i = 0; i < Medicina.size(); i++){
                if(Medicina.get(i).getNombre().equalsIgnoreCase(nombreEstante)){
                    Medicina.get(i).libros.clear();
                    this.num =0;
                }
            }
        }
        if (this.num == 1){
            for(int i = 0; i < Quimica.size(); i++){
                if(Quimica.get(i).getNombre().equalsIgnoreCase(nombreEstante)){
                    Quimica.get(i).libros.clear();
                    this.num =0;
                }
            }
        }
        if (num == 1){
            System.out.println("El estante no existe en esta Biblioteca");
        }
    }

    public void mostrarEstantes(){
        System.out.println("--)Estantes de Astronomia(--");
        for(int i = 0; i < Astronomia.size(); i++){
            System.out.println(Astronomia.get(i));
        }
        System.out.println("--)Estantes de Biologia(--");
        for(int i = 0; i < Biologia.size(); i++){
            System.out.println(Biologia.get(i));
        }
        System.out.println("--)Estantes de Geologia(--");
        for(int i = 0; i < Geologia.size(); i++){
            System.out.println(Geologia.get(i));
        }
        System.out.println("--)Estantes de Matematica(--");
        for(int i = 0; i < Matematica.size(); i++){
            System.out.println(Matematica.get(i));
        }
        System.out.println("--)Estantes de Medicina(--");
        for(int i = 0; i < Medicina.size(); i++){
            System.out.println(Medicina.get(i));
        }
        System.out.println("--)Estantes de Quimica(--");
        for(int i = 0; i < Quimica.size(); i++){
            System.out.println(Quimica.get(i));
        }
    }

    public void verLibrosEsxistentes(int opcion){        
        switch (opcion){
            case 1:
                System.out.println("--)Estantes de Astronomia(--");
                for(int i = 0; i < Astronomia.size(); i++){
                    System.out.println(Astronomia.get(i));
                    Astronomia.get(i).mostrarLibros();
                }
                System.out.println("--)Estantes de Biologia(--");
                for(int i = 0; i < Biologia.size(); i++){
                    System.out.println(Biologia.get(i));
                    Biologia.get(i).mostrarLibros();
                }
                System.out.println("--)Estantes de Geologia(--");
                for(int i = 0; i < Geologia.size(); i++){
                    System.out.println(Geologia.get(i));
                    Geologia.get(i).mostrarLibros();
                }
                System.out.println("--)Estantes de Matematica(--");
                for(int i = 0; i < Matematica.size(); i++){
                    System.out.println(Matematica.get(i));
                    Matematica.get(i).mostrarLibros();
                }
                System.out.println("--)Estantes de Medicina(--");
                for(int i = 0; i < Medicina.size(); i++){
                    System.out.println(Medicina.get(i));
                    Medicina.get(i).mostrarLibros();
                }
                System.out.println("--)Estantes de Quimica(--");
                for(int i = 0; i < Quimica.size(); i++){
                    System.out.println(Quimica.get(i));
                    Quimica.get(i).mostrarLibros();
                }
                break;
            case 2:
                System.out.println("--)Estantes de Astronomia(--");
                for(int i = 0; i < Astronomia.size(); i++){
                    System.out.println(Astronomia.get(i));
                    Astronomia.get(i).mostrarLibros();
                }                
                break;
            case 3:
                System.out.println("--)Estantes de Biologia(--");
                for(int i = 0; i < Biologia.size(); i++){
                    System.out.println(Biologia.get(i));
                    Biologia.get(i).mostrarLibros();
                }                
                break;
            case 4:
                System.out.println("--)Estantes de Geologia(--");
                for(int i = 0; i < Geologia.size(); i++){
                    System.out.println(Geologia.get(i));
                    Geologia.get(i).mostrarLibros();
                }                
                break;
            case 5:
                System.out.println("--)Estantes de Matematica(--");
                for(int i = 0; i < Matematica.size(); i++){
                    System.out.println(Matematica.get(i));
                    Matematica.get(i).mostrarLibros();
                }
                
                break;
            case 6:
                System.out.println("--)Estantes de Medicina(--");
                for(int i = 0; i < Medicina.size(); i++){
                    System.out.println(Medicina.get(i));
                    Medicina.get(i).mostrarLibros();
                }
                break;
            case 7:
                System.out.println("--)Estantes de Quimica(--");
                for(int i = 0; i < Quimica.size(); i++){
                    System.out.println(Quimica.get(i));
                    Quimica.get(i).mostrarLibros();
                }       
                break;
            case 8:
                this.contAstronomia = 0;
                this.contBiologia = 0;
                this.contGeologia = 0;
                this.contMatematica = 0;
                this.contMedicina = 0;
                this.contQuimica = 0;
                this.contGeneral = 0;
                for(int i = 0; i < Astronomia.size(); i++){
                    this.contador = 0;
                    this.contador = Astronomia.get(i).libros.size();
                    this.contAstronomia = this.contAstronomia + this.contador;
                }                
                for(int i = 0; i < Biologia.size(); i++){
                    this.contador = 0;
                    this.contador = Biologia.get(i).libros.size();
                    this.contBiologia = this.contBiologia + this.contador;
                }                
                for(int i = 0; i < Geologia.size(); i++){
                    this.contador = 0;
                    this.contador = Geologia.get(i).libros.size();
                    this.contGeologia = this.contGeologia + this.contador;
                }                
                for(int i = 0; i < Matematica.size(); i++){
                    this.contador = 0;
                    this.contador = Matematica.get(i).libros.size();
                    this.contMatematica = this.contMatematica + this.contador;
                }                
                for(int i = 0; i < Medicina.size(); i++){
                    this.contador = 0;
                    this.contador = Medicina.get(i).libros.size();
                    this.contMedicina = this.contMedicina + this.contador;
                }                
                for(int i = 0; i < Quimica.size(); i++){
                    this.contador = 0;
                    this.contador = Quimica.get(i).libros.size();
                    this.contQuimica = this.contQuimica + this.contador;
                }
                this.contGeneral = this.contAstronomia+this.contBiologia+this.contGeologia+this.contMatematica+this.contMatematica+this.contMedicina+this.contQuimica;
                System.out.println("Hay "+this.contGeneral+" libors en total.");
                System.out.println("Hay "+this.contAstronomia+" libros de Astronomia.");
                System.out.println("Hay "+this.contBiologia+" libros de Biologia.");
                System.out.println("Hay "+this.contGeologia+" libros de Geologia.");
                System.out.println("Hay "+this.contMatematica+" libros de Matematica.");
                System.out.println("Hay "+this.contMedicina+" libros de Medicina.");
                System.out.println("Hay "+this.contQuimica+" libros de Quimica.");
                break;  

        }
    }












}
    
    


















