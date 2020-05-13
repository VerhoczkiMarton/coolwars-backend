package com.codecool.coolwarsbackend.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class UserSolution {
    private Long dojoId;
    private String code;
    private Language language;
}
