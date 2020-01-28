package com.versatile.spring.configuration;

import com.versatile.spring.uchiha.Sarada;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.versatile.spring")
@PropertySource("Configuration.properties")
@EnableAspectJAutoProxy
public class SpringConfig {

    @Bean("sarada")
    public Sarada getUchiha(){
        return new Sarada();
    }
}
