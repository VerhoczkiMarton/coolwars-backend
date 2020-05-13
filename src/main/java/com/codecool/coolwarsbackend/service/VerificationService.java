package com.codecool.coolwarsbackend.service;

import com.codecool.coolwarsbackend.model.Dojo;
import com.codecool.coolwarsbackend.model.UserSolution;
import com.codecool.coolwarsbackend.repository.DojoRepository;
import lombok.AllArgsConstructor;
import org.json.JSONException;
import org.springframework.stereotype.Component;

import java.util.NoSuchElementException;
import java.util.Optional;

@Component
@AllArgsConstructor
public class VerificationService {
    DojoRepository dojoRepository;
    CompilerService compilerService;

    public boolean verifyUserSolution(UserSolution userSolution) throws JSONException {
        Optional<Dojo> correctSolution = dojoRepository.findById(userSolution.getDojoId());
        if (correctSolution.isPresent()) {
            String userCodeOutput = compilerService.get_output(userSolution);
            return userCodeOutput.strip().equalsIgnoreCase(correctSolution.get().getSolution());
        } else {
            throw new NoSuchElementException("Dojo not found");
        }
    }

}