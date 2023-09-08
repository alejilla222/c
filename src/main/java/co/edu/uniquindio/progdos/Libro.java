package co.edu.uniquindio.progdos;

import java.time.LocalDate;

public class Libro {
    
    private String ISBN;
    private String titulo;
    private String autor;
    private LocalDate fechaPublicacion;


    
    public Libro() { //Se crea un constructor por defecto
    }
    
    //Constructor con parametros 
    public Libro(String ISBN, String titulo, String autor, LocalDate fechaPublicacion) {
        ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.fechaPublicacion = fechaPublicacion;
    }
    // Método para modificar un libro
    public Libro ModificarLibro(Libro libro){
        return libro;
    }
    
    // Método para eliminar un libro 
    public boolean EliminarLibro(Libro libro){

        return true;
    }
     
    //Métodos getter y setter para los atributos
  
    public String getISBN() {
        return ISBN;
    }
    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public LocalDate  getFechaPublicacion() {
        return fechaPublicacion;
    }
    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    

}
