package com.example.bootcampmicroecosistema1.clases;

import org.springframework.stereotype.Component;

@Component
public class Saludo {

    private String idioma;

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String saludar() {
        String mensaje;
        switch (idioma) {
            case "es":
                mensaje = "¡Bienvenido!";
                break;
            case "en":
                mensaje = "Welcome!";
                break;
            case "fr":
                mensaje = "Bienvenue!";
                break;
            default:
                mensaje = "Idioma no soportado.";
        }
        return mensaje;
    }

}
