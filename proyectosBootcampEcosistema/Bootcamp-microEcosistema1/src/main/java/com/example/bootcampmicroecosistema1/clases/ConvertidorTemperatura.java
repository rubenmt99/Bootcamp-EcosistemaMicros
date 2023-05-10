package com.example.bootcampmicroecosistema1.clases;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ConvertidorTemperatura {

    @Value("celsius")
    private String origin;

    @Value("farenheit")
    private String target;


    public double convertirTemperatura(Double temperatura){
        double temperaturaConvertida;

        // Se verifica la unidad de temperatura de origen y se realiza la conversión adicional si es necesario
        if (origin.equals("celsius")){
            temperaturaConvertida = celsiusAFarenheit(temperatura);
        } else if (origin.equals("farenheit")) {
            temperaturaConvertida = farenheitACelsius(temperatura);
        }else {
            throw new IllegalArgumentException("Unidad de medida incorrecta de origen");
        }

        // Se verifica la unidad de temperatura de destino y se realiza la conversión adicional si es necesario
        if (target.equals("celsius")) {
            return farenheitACelsius(temperaturaConvertida);
        } else if (target.equals("farenheit")) {
            return temperaturaConvertida;
        } else {
            throw new IllegalArgumentException("Unidad de medida incorrecta de destino");
        }
    }

    private double celsiusAFarenheit(Double celsius){
        return (celsius * 9 / 5) + 32;
    }

    private double farenheitACelsius(Double farenheit){
        return (farenheit - 32) * 5 / 9;
    }

}
