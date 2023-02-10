package dev.danvega.springBootJpa.repository;

import dev.danvega.springBootJpa.model.User;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.util.StringUtils;

import java.util.List;

public class CustomerSpecifications {
    public static Specification<User> searchByName(String name) {
        if (StringUtils.hasText(name)) {
            name = name.toLowerCase();
        }
        String finalName = name;
        return (root, query, criteriaBuilder) ->
                criteriaBuilder.like(
                        criteriaBuilder.lower(root.<String>get("name")), "%" + finalName + "%");
    }

    public static Specification<User> getAge(Integer age){
        return (root, query, criteriaBuilder) -> {
            return criteriaBuilder.lessThan(root.<Integer>get("age"), age);

        };
    }

    public static Specification<User> getAgeBetween(Integer ageMin, Integer ageMax){
        return (root, query, criteriaBuilder) -> criteriaBuilder
                .between(root.<Integer>get("age"), ageMax, ageMin);
    }

}