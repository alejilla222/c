package co.edu.uniquindio.progdos;

public class Estudiante {
    
    //Atributos de la clase
    private String nombre;
    private String id;
    private String programaAcademico;
    private String telefono;



    //Constructor por defecto
    public Estudiante() {
    }

    //Constructor con parametros
    public Estudiante(String nombre, String id, String programaAcademico, String telefono) {
        this.nombre = nombre;
        this.id = id;
        this.programaAcademico = programaAcademico;
        this.telefono = telefono;
    }


    // Método para modificar un estudiante
    public Estudiante ModificarEstudiante(Estudiante estudiante){
        return estudiante;
    }

    // Método para eliminar un estudiante
    public boolean EliminarEstudiante(Estudiante estudiante){

        return true;

    }

    // Métodos getter y setter para los atributos
    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }


    public String getProgramaAcademico() {
        return programaAcademico;
    }


    public void setProgramaAcademico(String programaAcademico) {
        this.programaAcademico = programaAcademico;
    }


    public String getTelefono() {
        return telefono;
    }


    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    
    

    

}
