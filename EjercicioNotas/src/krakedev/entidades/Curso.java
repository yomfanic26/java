package krakedev.entidades;

import java.util.ArrayList;

public class Curso {
	ArrayList<Estudiante> estudiantes;
	
	public Curso() {
        this.estudiantes = new ArrayList<>();
    }

	public Estudiante buscarEstudiantePorCedula(String cedula) {
		for (int i = 0; i < estudiantes.size(); i++) {
			Estudiante estudiante = estudiantes.get(i);
			if (estudiante.getCedula().equals(cedula)) {
				return estudiante; // Retorna el estudiante si se encuentra en el curso
			}
		}
		return null; // Retorna null si el estudiante no se encuentra en el curso
	}

	public void matricularEstudiante(Estudiante estudiante) {
		if (buscarEstudiantePorCedula(estudiante.getCedula()) == null) {
			estudiantes.add(estudiante);
			System.out.println("Estudiante matriculado exitosamente.");
		} else {
			System.out.println("El estudiante ya está matriculado en el curso.");
		}
	}

	public double calcularPromedioCurso() {
		double sumatoriaPromedios = 0;
		int cantidadEstudiantes = estudiantes.size();

		if (cantidadEstudiantes > 0) {
			for (int i = 0; i < cantidadEstudiantes; i++) {
				Estudiante estudiante = estudiantes.get(i);
				double sumatoriaCalificaciones = 0;
				int cantidadNotas = estudiante.getNotas().size();

				if (cantidadNotas > 0) {
					for (int j = 0; j < cantidadNotas; j++) {
						Nota nota = estudiante.getNotas().get(j);
						sumatoriaCalificaciones += nota.getCalificacion();
					}

					double promedioEstudiante = sumatoriaCalificaciones / cantidadNotas;
					sumatoriaPromedios += promedioEstudiante;
				}
			}

			// Calcular el promedio del curso
			double promedioCurso = sumatoriaPromedios / cantidadEstudiantes;
			return promedioCurso;
		} else {
			return 0;
		}
	}

	public void mostrar() {
		System.out.println("Información del Curso:");

		for (int i = 0; i < estudiantes.size(); i++) {
			Estudiante estudiante = estudiantes.get(i);
			System.out.println("Nombre: " + estudiante.getNombre());
			System.out.println("Apellido: " + estudiante.getApellido());
			System.out.println("Cédula: " + estudiante.getCedula());

			ArrayList<Nota> notas = estudiante.getNotas();

			if (notas.size() > 0) {
				System.out.println("Notas:");
				for (int j = 0; j < notas.size(); j++) {
					Nota nota = notas.get(j);
					System.out.println("Nombre= " + estudiante.getNombre() + "," + " Apellido="
							+ estudiante.getApellido() + "," + " Materia=" + nota.getMateria().getNombre()
							+ ", Calificación= " + nota.getCalificacion());
				}
			} else {
				System.out.println("El estudiante no tiene notas registradas.");
			}

			System.out.println("------------------------");
		}

		if (estudiantes.size() > 0) {
			double promedioCurso = calcularPromedioCurso();
			System.out.println("Promedio del Curso: " + promedioCurso);
		} else {
			System.out.println("No hay estudiantes en el curso.");
		}
	}

	public ArrayList<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}

}
