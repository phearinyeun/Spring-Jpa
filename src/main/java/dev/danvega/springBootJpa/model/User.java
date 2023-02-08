package dev.danvega.springBootJpa.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name", length = 50, nullable = false, unique = false)
    private String name;
    @Column(name = "age", length = 25, nullable = false, unique = false)
    private Integer age;
    @Column(name = "birthDate", length = 50)
//    @DateTimeFormat(pattern = "dd-MM-yy")
    private String birthDate;
    @Column(name = "active", length = 15, nullable = false, unique = false)
    private Boolean active;
}
