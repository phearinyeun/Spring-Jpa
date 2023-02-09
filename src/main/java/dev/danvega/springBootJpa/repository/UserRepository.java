package dev.danvega.springBootJpa.repository;

import dev.danvega.springBootJpa.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByActive(Boolean active);
    Page<User> findAll(Pageable pageable);
}
