package com.codecool.coolwarsbackend.controller;

import com.codecool.coolwarsbackend.model.Dojo;
import com.codecool.coolwarsbackend.service.DojoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{id}")
    Dojo getDojoById(@PathVariable Long id) {
        return dojoService.getDojoById(id);
    }

}
