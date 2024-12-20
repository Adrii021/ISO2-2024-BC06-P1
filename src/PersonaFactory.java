package Problema1_v2;

import java.time.LocalDate;

class PersonaFactory {
    public static IPersona crearPersona(String nombre, String apellidos, LocalDate fechaNacimiento, String nacionalidad,
                                        String titulacion, String certificacionIngles, String telefono, String correoElectronico) {
        return new Persona(nombre, apellidos, fechaNacimiento, nacionalidad, titulacion, certificacionIngles, telefono, correoElectronico);
    }
}
