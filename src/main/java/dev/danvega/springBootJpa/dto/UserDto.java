package dev.danvega.springBootJpa.dto;

import lombok.*;

import java.time.LocalDateTime;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private Long id;
    private String name;
    private Integer age;
    private LocalDateTime birthDate;
    private Boolean active;
}

