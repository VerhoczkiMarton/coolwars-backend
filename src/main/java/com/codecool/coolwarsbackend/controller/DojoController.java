package com.codecool.coolwarsbackend.controller;

import com.codecool.coolwarsbackend.model.Dojo;
import com.codecool.coolwarsbackend.service.DojoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/dojo")
@AllArgsConstructor
public class DojoController {

    DojoService dojoService;

    @GetMapping
    List<Dojo> getDojos() {
        return dojoService.getDojos();
    }

}
