package com.codecool.coolwarsbackend.repository;

import com.codecool.coolwarsbackend.model.Dojo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface DojoRepository extends JpaRepository<Dojo, Long> {
}
