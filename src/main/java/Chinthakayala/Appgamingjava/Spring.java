package Chinthakayala.Appgamingjava;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Spring {
    @Bean
    public String name()
    {
        return "Chinthakayala";
    }
}
