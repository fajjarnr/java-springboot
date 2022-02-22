package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
           Student fajar = new Student(
                    "Fajar",
                    "fajjarnr@gmail.com",
                    LocalDate.of(1999, Month.MARCH, 17)
            );

            Student fahrur = new Student(
                    "Fahrur",
                    "fahrur@gmail.com",
                    LocalDate.of(2008, Month.MAY, 13)
            );


            repository.saveAll(
                    List.of(fajar, fahrur)
            );
        };
    }
}
