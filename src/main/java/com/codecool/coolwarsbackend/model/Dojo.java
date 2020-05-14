package com.codecool.coolwarsbackend.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Dojo {
    @Id
    @GeneratedValue
    Long id;

    String title;
    String description;
    String starterCode;
    String runnerCode;
    String solution;
    @Enumerated(EnumType.STRING)
    Language language;

}
