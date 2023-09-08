package co.edu.uniquindio.progdos;


public class Empleado {

	// Atributos de la clase Empleado
    private String nombre;
    private String id;
    private String cargo;
    private String telefono;

    // Constructor por defecto
    public Empleado() {
    }

    // Constructor con parámetros
    public Empleado(String nombre, String id, String cargo, String telefono) {
        this.nombre = nombre;
        this.id = id;
        this.cargo = cargo;
        this.telefono = telefono;
    }

    // Método para modificar un empleado
    public Empleado ModificarEmpleado(Empleado empleado){
        return empleado;
    }

    // Método para eliminar un empleado
    public boolean EliminarEmpleado(Empleado empleado){

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


    public String getCargo() {
        return cargo;
    }


    public void setCargo(String cargo) {
        this.cargo = cargo;
    }


    public String getTelefono() {
        return telefono;
    }


    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}