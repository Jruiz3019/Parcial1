package main.java.com.miempresa.miapp;

public class ServicioEstudiante {
private EstudiantesRegistrados estudiantesRegistrados;
private boolean atiendenSabados;
public ServicioEstudiante(EstudiantesRegistrados estudiantesRegistrados) {
this.estudiantesRegistrados = estudiantesRegistrados;
this.atiendenSabados = true;
}
public int contarTotalEstudiantes() {
return estudiantesRegistrados.obtenerEstudiantes().size();
}
public boolean esEstudianteRegistrado(String matricula) {
if (matricula == null || matricula.isEmpty()) {
throw new IllegalArgumentException("No se admiten matrículas nulas");
}
return estudiantesRegistrados.buscarPorMatricula(matricula) != null;
}
public boolean eliminarEstudiante(String matricula) {
return estudiantesRegistrados.eliminarEstudiante(matricula);
}
public boolean obtenerHorariosAtencion() {
return this.atiendenSabados;
}
}
