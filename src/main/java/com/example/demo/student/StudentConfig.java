package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            // Functional Interface in plain Java
            Student shree=new Student(
                    "Shree",
                    LocalDate.of(1985, 4, 2),
                    "shree21@gmail.com"
            );
            Student john=new Student(
                    "John",
                    LocalDate.of(2002, 4, 1),
                    "john4521@gmail.com"
            );

            repository.saveAll(List.of(shree,john));

        };
    }
}
