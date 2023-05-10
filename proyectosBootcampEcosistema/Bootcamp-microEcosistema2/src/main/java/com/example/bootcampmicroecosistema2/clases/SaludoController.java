package com.example.bootcampmicroecosistema2.clases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoController {

    private final SaludoService saludoService;

    @Autowired
    public SaludoController(SaludoService saludoService) {
        this.saludoService = saludoService;
    }

    @GetMapping("/saludar")
    public String saludar(@RequestParam("idioma") String idioma) {
        return saludoService.miSaludo(idioma);
    }

}
