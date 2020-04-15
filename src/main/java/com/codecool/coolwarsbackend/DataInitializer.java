package com.codecool.coolwarsbackend;

import com.codecool.coolwarsbackend.model.Dojo;
import com.codecool.coolwarsbackend.repository.DojoRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class DataInitializer implements CommandLineRunner {

        private DojoRepository dojoRepository;

        @Override
        public void run(String...args) {
            Dojo dojo1 = Dojo.builder()
                    .description("first desc")
                    .starterCode("first code")
                    .solution("first solution")
                    .build();
            dojoRepository.saveAndFlush(dojo1);

            Dojo dojo2 = Dojo.builder()
                    .description("second desc")
                    .starterCode("second code")
                    .solution("second solution")
                    .build();

            dojoRepository.saveAndFlush(dojo2);
        }
}
