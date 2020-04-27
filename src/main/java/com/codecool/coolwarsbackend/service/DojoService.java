package com.codecool.coolwarsbackend.service;

import com.codecool.coolwarsbackend.model.Dojo;
import com.codecool.coolwarsbackend.repository.DojoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Component
@AllArgsConstructor
public class DojoService {

    DojoRepository dojoRepository;

    public List<Dojo> getDojos() {
        return dojoRepository.findAll();
    }

    public Dojo getDojoById(Long id) {
        Optional<Dojo> dojo = dojoRepository.findById(id);
        if (dojo.isPresent()) {
            return dojo.get();
        } else {
            throw new NoSuchElementException();
        }
    }
}

