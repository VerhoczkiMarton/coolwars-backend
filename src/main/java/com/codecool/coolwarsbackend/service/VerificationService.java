package com.codecool.coolwarsbackend.service;

import com.codecool.coolwarsbackend.model.Dojo;
import com.codecool.coolwarsbackend.model.UserSolution;
import com.codecool.coolwarsbackend.model.ValidityResponse;
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

    public ValidityResponse verifyUserSolution(UserSolution userSolution) throws JSONException {
        Optional<Dojo> correctSolutionOptional = dojoRepository.findById(userSolution.getDojoId());
        if (correctSolutionOptional.isPresent()) {
            Dojo correctSolution = correctSolutionOptional.get();
            userSolution.setCode(userSolution.getCode() + correctSolution.getRunnerCode());
            String userCodeOutput = compilerService.get_output(userSolution);

            ValidityResponse validityResponse = new ValidityResponse();
            validityResponse.setOutput(userCodeOutput.strip());
            validityResponse.setValid(userCodeOutput.strip().equalsIgnoreCase(correctSolutionOptional.get().getSolution()));
            return validityResponse;
        } else {
            throw new NoSuchElementException("Dojo not found");
        }
    }

}