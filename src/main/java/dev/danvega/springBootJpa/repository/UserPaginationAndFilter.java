package dev.danvega.springBootJpa.repository;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
public class UserPaginationAndFilter {
    private int page;
    private int size;
    private Integer age, agemax, agemin;
    private String name;
}
