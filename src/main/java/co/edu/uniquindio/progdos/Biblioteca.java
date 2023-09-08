package co.edu.uniquindio.progdos;

import java.util.List;
import java.time.LocalDate;
import java.util.Date;


public class Biblioteca {

    //Atributos de la clase 

    private List<Libro> listaLibros;
    private List<Empleado> listaEmpleados;
    private List<Estudiante> listaEstudiantes;
    
    // ---------------------------Inicio metodos clase libro-------------------------------------------

	// Metodo crear un Libro y agregarlo a la lista de libros
	
	public void AgregarLibro(String ISBN, String titulo, String autor, Date fechaPublicacion) {

		Libro libro = new Libro("01", "POO", "Daniel Ciro", LocalDate.of(2023, 8, 27));
		listaLibros.add(libro);

	}

	// Metodo para buscar libro en la lista de libros
	public Libro BuscarLibroPorISBN(String ISBN) {
		for (Libro libro : listaLibros) {
			if (libro.getISBN().equals(ISBN)) {
				return libro;
			}
		}
		return null; // Si no se encuentra el libro
	}
	// ------------------Fin metodos clase libro-------------------------------------------

	// -----------------Inicio metodos clase empleado-------------------------------------

	// Metodo crear un empleado y agregarlo a la lista de empleados
	public void AgregarEmpleado(String nombre, String id, String cargo, String telefono) {

		Empleado empleado = new Empleado("empleado1", "123456789", "cargo1", "3123003300");
		listaEmpleados.add(empleado);

	}

	// Metodo para buscar empleado en la lista de empleados
	public Empleado BuscarEmpleadoId(String id) {
		for (Empleado empleado : listaEmpleados) {
			if (empleado.getId().equals(id)) {
				return empleado;
			}
		}
		return null; 
	}
	// ------------------Fin metodos clase empleado-------------------------------------------

	// -----------------Inicio metodos clase Estudiante-------------------------------------

	// Metodo crear un Estudiante y agregarlo a la lista de estudiantes
	public void AgregarEstudiante(String nombre, String id, String programaAcademico, String telefono) {

		Estudiante estudiante = new Estudiante("estudiante1", "123123123", "programa1", "31231231233");
		listaEstudiantes.add(estudiante);

	}

	// Metodo para buscar Estudiante en la lista de estudiante
	public Estudiante BuscarEstudianteId(String id) {
		for (Estudiante estudiante : listaEstudiantes) {
			if (estudiante.getId().equals(id)) {
				return estudiante;
			}
		}
		return null; 
	}
	// ------------------Fin metodos clase estudiante-------------------------------------------
}
