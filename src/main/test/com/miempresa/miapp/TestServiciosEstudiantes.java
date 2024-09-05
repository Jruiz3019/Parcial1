package main.test.com.miempresa.miapp;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import main.java.com.miempresa.miapp.Estudiante;
import main.java.com.miempresa.miapp.EstudiantesRegistrados;
import main.java.com.miempresa.miapp.ServicioEstudiante;

class TestServiciosEstudiante {

    @Mock
    private EstudiantesRegistrados estudiantesRegistrados;

    private ServicioEstudiante servicioEstudiante;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        servicioEstudiante = new ServicioEstudiante(estudiantesRegistrados);
    }

    @Test
    void testContarTotalEstudiantes() {
        List<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("12345", 0, "Juan Pérez"));
        estudiantes.add(new Estudiante("67890", 0, "Ana Gómez"));

        when(estudiantesRegistrados.obtenerEstudiantes()).thenReturn(estudiantes);

        int total = servicioEstudiante.contarTotalEstudiantes();
        assertEquals(2, total);
    }

    @Test
    void testEsEstudianteRegistradoCuandoExiste() {
        when(estudiantesRegistrados.buscarPorMatricula("12345")).thenReturn(new Estudiante("12345", 0, "Juan Pérez"));

        assertTrue(servicioEstudiante.esEstudianteRegistrado("12345"));
    }

    @Test
    void testEsEstudianteRegistradoCuandoNoExiste() {
        when(estudiantesRegistrados.buscarPorMatricula("99999")).thenReturn(null);

        assertFalse(servicioEstudiante.esEstudianteRegistrado("99999"));
    }

    @Test
    void testEsEstudianteRegistradoConMatriculaNula() {
        assertThrows(IllegalArgumentException.class, () -> servicioEstudiante.esEstudianteRegistrado(null));
    }

    @Test
    void testEliminarEstudianteSeElimina() {
        when(estudiantesRegistrados.eliminarEstudiante("12345")).thenReturn(true);

        assertTrue(servicioEstudiante.eliminarEstudiante("12345"));
    }

    @Test
    void testEliminarEstudianteCuandoNoSeElimina() {
        when(estudiantesRegistrados.eliminarEstudiante("99999")).thenReturn(false);

        assertFalse(servicioEstudiante.eliminarEstudiante("99999"));
    }

    @Test
    void testObtenerHorariosAtencion() {
        assertTrue(servicioEstudiante.obtenerHorariosAtencion());
    }
}
