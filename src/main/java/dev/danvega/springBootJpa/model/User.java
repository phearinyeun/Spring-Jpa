package dev.danvega.springBootJpa.model;

import jakarta.persistence.*;
import jdk.jfr.DataAmount;
import lombok.*;

import java.time.ZonedDateTime;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Integer age;
    private ZonedDateTime birthDate;
    private Boolean active;
}
