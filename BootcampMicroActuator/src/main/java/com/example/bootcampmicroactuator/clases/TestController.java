package com.example.bootcampmicroactuator.clases;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private Counter counter;

    public TestController(MeterRegistry registry){
        this.counter = Counter.builder("invocaciones.hello")
                .description("invocaciones totales de hello world")
                .register(registry);
    }

    @GetMapping("/hello")
    public String helloWorld(){
        counter.increment();
        return "Hello World";
    }

}
