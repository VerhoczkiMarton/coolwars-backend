package com.codecool.coolwarsbackend.controller;

import com.codecool.coolwarsbackend.model.UserSolution;
import com.codecool.coolwarsbackend.service.DojoService;
import com.codecool.coolwarsbackend.service.VerificationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/verify")
@AllArgsConstructor
public class VerificationController {
    VerificationService verificationService;

    @PostMapping
    boolean verify(@RequestBody UserSolution userSolution) {
        return verificationService.verifyUserSolution(userSolution);
    }
}
