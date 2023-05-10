package com.example.bootscampmicroservicesgateway.filters;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
public class Filter {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Bean
    @Order(-1)
    public GlobalFilter a(){
        //chain = todos los filtros de la aplicacion
        //exchange = el siguiente paso que queremos hacer

        return (exchange, chain) -> {
            logger.info("Primer pre filter");
            return chain.filter(exchange).then(Mono.fromRunnable(() -> {
                logger.info("primer post filter");
            }));
        };
    }

    @Bean
    @Order(0)
    public GlobalFilter b(){
        //chain = todos los filtros de la aplicacion
        //exchange = el siguiente paso que queremos hacer

        return (exchange, chain) -> {
            logger.info("Segundo pre filter");
            return chain.filter(exchange);
        };
    }


}
