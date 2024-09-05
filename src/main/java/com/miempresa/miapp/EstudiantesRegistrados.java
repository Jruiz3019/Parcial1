package main.java.com.miempresa.miapp;
import java.util.ArrayList;
import java.util.List;

	 public class EstudiantesRegistrados {
	 private List<Estudiante> estudiantes;
	 public EstudiantesRegistrados() {
	 this.estudiantes = new ArrayList<>();
	 }
	 public void agregarEstudiante(Estudiante estudiante) {
	 estudiantes.add(estudiante);
	 }
	 public List<Estudiante> obtenerEstudiantes() {
	 return estudiantes;
	 }
	 public Estudiante buscarPorMatricula(String matricula) {
	 for (Estudiante estudiante : estudiantes) {
	 if (estudiante.getMatricula().equalsIgnoreCase(matricula)) {
	 return estudiante;
	 }
	 }
	 return null;
	 }
	 public boolean eliminarEstudiante(String matricula) {
	 Estudiante estudiante = buscarPorMatricula(matricula);
	 if (estudiante != null) {
	 estudiantes.remove(estudiante);
	 return true;
	 }
	 return false;
	 }
}
