package Problema1_v2;

import java.time.LocalDate;
import java.time.Period;

class Persona implements IPersona {
    private String nombre;
    private String apellidos;
    private LocalDate fechaNacimiento;
    private String nacionalidad;
    private String titulacion;
    private String certificacionIngles;
    private String telefono;
    private String correoElectronico;

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

    @Override
    public boolean esMayorDeEdad() {
        return Period.between(this.fechaNacimiento, LocalDate.now()).getYears() >= 18;
    }

    @Override
    public boolean esEuropeo() {
        return Validaciones.esEuropeo(this.nacionalidad);
    }

    @Override
    public boolean puedeMatricularseDoctorado() {
        return Validaciones.titulacionValidaParaDoctorado(this.titulacion);
    }

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
