package com.codecool.coolwarsbackend.service;

import com.codecool.coolwarsbackend.model.Dojo;
import com.codecool.coolwarsbackend.repository.DojoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class DojoService {

    DojoRepository dojoRepository;

    public List<Dojo> getDojos() {
        return dojoRepository.findAll();
    }
}
