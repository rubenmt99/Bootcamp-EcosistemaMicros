package com.example.bootcampmicroecosistema2.clases;

import com.example.bootcampmicroecosistema1.clases.Saludo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaludoService{

    public String  miSaludo(String idioma){
        String mensaje = "";
        Saludo saludo = new Saludo();
        saludo.setIdioma(idioma);
        mensaje = saludo.saludar();
        return mensaje;
    }


}