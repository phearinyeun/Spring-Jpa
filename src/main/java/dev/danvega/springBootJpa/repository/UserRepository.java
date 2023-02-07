package dev.danvega.springBootJpa.repository;

import dev.danvega.springBootJpa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByActiveTrue();
    List<User> findByActiveFalse();
}
