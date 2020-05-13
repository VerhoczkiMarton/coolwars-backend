package com.codecool.coolwarsbackend;

import com.codecool.coolwarsbackend.model.Dojo;
import com.codecool.coolwarsbackend.model.Language;
import com.codecool.coolwarsbackend.repository.DojoRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class DataInitializer implements CommandLineRunner {

    private DojoRepository dojoRepository;

    @Override
    public void run(String... args) {
        Dojo dojo1 = Dojo.builder()
                .language(Language.PYTHON)
                .description("Write a function that adds two numbers (a, b), and returns the sum.")
                .starterCode("def add(a, b):\n" +
                        "   \n" +
                        "print(add(5,6))")
                .solution("11")
                .title("Basic calculator")
                .build();
        dojoRepository.saveAndFlush(dojo1);

        Dojo dojo2 = Dojo.builder()
                .language(Language.PYTHON)
                .description("Complete the method that takes a boolean value and return a \"Yes\" string for true, or a \"No\" string for false.")
                .starterCode("def boolToWord(bool):\n" +
                        "    return None\n" +
                        "\n" +
                        "print(boolToWord(False))")
                .solution("yes")
                .title("Boolean to Human")
                .build();

        dojoRepository.saveAndFlush(dojo2);
    }
}
