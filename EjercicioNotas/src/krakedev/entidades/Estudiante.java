package krakedev.entidades;

import java.util.ArrayList;

public class Estudiante {
	private String nombre;
	private String apellido;
	private String cedula;
	private ArrayList<Nota> notas; // creo un array como atributo
	private ArrayList<Materia> materias;

	public Estudiante() {
		notas = new ArrayList<Nota>(); // intancio el array nota apunta a la varibale nota
		materias = new ArrayList<Materia>(); // intancio el array nota apunta a la varibale nota

	}

	public Estudiante(String cedula, String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		notas = new ArrayList<Nota>();
		materias = new ArrayList<Materia>();

	}

	public void agregarNota(Nota nuevaNota) {
	    Materia materia = nuevaNota.getMateria();
	    if (materia != null) {
	        double calificacion = nuevaNota.getCalificacion();
	        if (calificacion >= 0 && calificacion <= 10) {
	            boolean materiaEncontrada = false;
	            for (int i = 0; i < notas.size(); i++) {
	                if (notas.get(i).getMateria().equals(materia)) {
	                    materiaEncontrada = true;
	                    break;
	                }
	            }
	            if (!materiaEncontrada) {
	                notas.add(nuevaNota);
	            } else {
	                System.out.println("La materia ya tiene una nota registrada.");
	            }
	        } else {
	            System.out.println("La calificación debe estar entre 0 y 10.");
	        }
	    } else {
	        System.out.println("No se encontró la materia.");
	    }
	}

	
	
	public void modificarNota(String codigo, double nuevaNota) {
	    boolean materiaEncontrada = false;

	    for (int i = 0; i < notas.size(); i++) {
	        if (notas.get(i).getMateria().getCodigo().equals(codigo)) {
	            materiaEncontrada = true;

	            if (nuevaNota >= 0 && nuevaNota <= 10) {
	                notas.get(i).setCalificacion(nuevaNota);
	            } else {
	                System.out.println("La nota debe de estar entre 0 y 10");
	            }
	            break;
	        }
	    }

	    if (!materiaEncontrada) {
	        System.out.println("No se encontró la materia con el código proporcionado.");
	    }
	}

	public void calcularPromedioNotasEstudiante() {
	    double sumatoriaCalificaciones = 0;
	    int cantidadNotas = 0;

	    for (int i = 0; i < notas.size(); i++) {
	        Nota nota = notas.get(i);
	        sumatoriaCalificaciones += nota.getCalificacion();
	        cantidadNotas++;
	    }

	    if (cantidadNotas > 0) {
	        double promedio = sumatoriaCalificaciones / cantidadNotas;
	        System.out.println("El promedio del estudiante es: " + promedio);
	    } else {
	        System.out.println("El estudiante no tiene notas registradas.");
	    }
	}

	public String mostrar() {
		String infoEstudiante = "";

		infoEstudiante += "Nombre: " + nombre + "\n";
		infoEstudiante += "Apellido: " + apellido + "\n";
		infoEstudiante += "Cédula: " + cedula + "\n";

		infoEstudiante += "Notas: \n";
		for (int i = 0; i < notas.size(); i++) {
			Nota nota = notas.get(i);
			infoEstudiante += "Nombre= " + getNombre() + "," + " Apellido=" + getApellido() + "," + " Materia="
					+ nota.getMateria().getNombre() + ", Calificación= " + nota.getCalificacion() + "\n";
		}

		return infoEstudiante;
	}
	
	
	
	public ArrayList<Nota> getNotas() {
	    return notas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

}
