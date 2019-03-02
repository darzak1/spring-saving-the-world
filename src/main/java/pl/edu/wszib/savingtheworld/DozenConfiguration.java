package pl.edu.wszib.savingtheworld;


import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DozenConfiguration {

    @Bean
    public Mapper mapper(){
        return new DozerBeanMapper();
    }
}