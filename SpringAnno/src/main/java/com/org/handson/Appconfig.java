package com.org.handson;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.org.handson")
public class Appconfig {
	@Bean(name="Email")
    public MessageService Email(){
         return new Email();
    }

    @Bean(name="Twitter")
    public MessageService Twitter(){
        return new Twitter();
    }

    @Bean(name="Sms")
    public MessageService Sms(){
        return new Sms();
    }

    @Bean
    public MessageProcesor messageProcessor(){
		return new Impl(Email());
        
    }

}
