package Problema1_v2;

import java.util.Arrays;
import java.util.List;

class Validaciones {
    private static final List<String> PAISES_EUROPEOS = Arrays.asList(
        "España", "Francia", "Alemania", "Italia", "Portugal", "Países Bajos", "Bélgica", "Andorra", "Rusia", "Ucrania",
        "Polonia", "Rumanía", "Reino Unido"
    );

    public static boolean esEuropeo(String nacionalidad) {
        return PAISES_EUROPEOS.contains(nacionalidad);
    }

    public static boolean titulacionValidaParaDoctorado(String titulacion) {
        return titulacion.equalsIgnoreCase("Máster") || titulacion.equalsIgnoreCase("Doctorado");
    }
}