package com.codecool.coolwarsbackend;

import com.codecool.coolwarsbackend.model.Dojo;
import com.codecool.coolwarsbackend.repository.DojoRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
@AllArgsConstructor
public class CoolwarsBackendApplication {

    DojoRepository dojoRepository;

    public static void main(String[] args) {
        SpringApplication.run(CoolwarsBackendApplication.class, args);
    }
}
