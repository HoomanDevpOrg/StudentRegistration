package ir.dpi.demo.student;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository){
        return args -> {

            Student alex = new Student(
                    1L,
                    "alex",
                    "alex@gmail.com",
                    LocalDate.of(2004, Month.JANUARY,5)
            );

            Student Maryam = new Student(
                    1L,
                    "Maryam",
                    "maryamJasms@gmail.com",
                    LocalDate.of(2000, Month.JANUARY,5)
            );



            repository.saveAll(List.of(alex,Maryam));
        };
    }
}
