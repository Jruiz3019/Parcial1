package main.java.com.miempresa.miapp;

public class Estudiante {
	 private String nombre;
	 private int edad;
	 private String matricula;
	 public Estudiante(String nombre, int edad, String matricula) {
	 this.nombre = nombre;
	 this.edad = edad;
	 this.matricula = matricula;
	 }
	 public String getNombre() {
	 return nombre;
	 }
	 public void setNombre(String nombre) {
	 this.nombre = nombre;
	 }
	 public int getEdad() {
	 return edad;
	 }
	 public void setEdad(int edad) {
	 this.edad = edad;
	 }
	 public String getMatricula() {
	 return matricula;
	 }
	 public void setMatricula(String matricula) {
	 this.matricula = matricula;

}
}