package Problema1;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.List;

public class Persona {
    private String nombre;
    private String apellidos;
    private LocalDate fechaNacimiento;
    private String nacionalidad;
    private String titulacion;
    private String certificacionIngles;
    private String telefono;
    private String correoElectronico;

    // Lista de países europeos
    private static final List<String> PAISES_EUROPEOS = Arrays.asList(
        "España", "Francia", "Alemania", "Italia", "Portugal", "Países Bajos", "Bélgica", "Andorra", "Rusia", "Ucrania",
        "Polonia", "Rumaníá", "Reino Unido"
    );

    // Constructor
    public Persona(String nombre, String apellidos, LocalDate fechaNacimiento, String nacionalidad,
                   String titulacion, String certificacionIngles, String telefono, String correoElectronico) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.nacionalidad = nacionalidad;
        this.titulacion = titulacion;
        this.certificacionIngles = certificacionIngles;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
    }

    // Método para determinar si es mayor de edad
    public boolean esMayorDeEdad() {
        return Period.between(this.fechaNacimiento, LocalDate.now()).getYears() >= 18;
    }

    // Método para determinar si es europeo
    public boolean esEuropeo() {
        return PAISES_EUROPEOS.contains(this.nacionalidad);
    }

    // Método para determinar si puede matricularse en un doctorado
    public boolean puedeMatricularseDoctorado() {
        return this.titulacion.equalsIgnoreCase("Máster") || this.titulacion.equalsIgnoreCase("Doctorado");
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public String getCertificacionIngles() {
        return certificacionIngles;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }
}
