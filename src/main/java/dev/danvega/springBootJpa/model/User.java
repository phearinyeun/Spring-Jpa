package dev.danvega.springBootJpa.model;

import jakarta.persistence.*;
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
    @Column(name = "name", length = 50, nullable = false, unique = false)
    private String name;
    @Column(name = "age", length = 25, nullable = false, unique = false)
    private Integer age;
    @Column(name = "birthDate")
    private ZonedDateTime birthDate;
    @Column(name = "active", length = 15, nullable = false, unique = false)
    private Boolean active;
}
