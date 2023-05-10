package com.example.bootcampmicroactuator.clases;

import org.springframework.boot.actuate.endpoint.annotation.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Endpoint(id = "estados")
public class Estado {

    private List<String> listaEstado = new ArrayList<>();

    @ReadOperation
    public List<String> listarEstados(){
        return listaEstado;
    }

    @WriteOperation
    public void saveEstados(@Selector String estadoNuevo){
        listaEstado.add(estadoNuevo);
    }

    @DeleteOperation
    public void deleteEstado(@Selector String estadoBorrar){
        listaEstado.remove(estadoBorrar);
    }



}
