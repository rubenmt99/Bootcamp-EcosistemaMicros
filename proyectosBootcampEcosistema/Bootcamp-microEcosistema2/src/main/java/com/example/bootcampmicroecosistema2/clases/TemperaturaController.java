package com.example.bootcampmicroecosistema2.clases;

import com.example.bootcampmicroecosistema1.clases.ConvertidorTemperatura;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.DecimalFormat;

@RestController
public class TemperaturaController {

    private final ConvertidorTemperatura convertidorTemperatura;

    @Autowired
    public TemperaturaController(ConvertidorTemperatura convertidorTemperatura) {
        this.convertidorTemperatura = convertidorTemperatura;
    }

    @GetMapping("/convertTemperature")
    public String convertTemperature(@RequestParam("temperature") double temperature) {
        double convertedTemperature = convertidorTemperatura.convertirTemperatura(temperature);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String formattedTemperature = decimalFormat.format(convertedTemperature);

        return "Converted temperature: " + formattedTemperature;
    }

}
