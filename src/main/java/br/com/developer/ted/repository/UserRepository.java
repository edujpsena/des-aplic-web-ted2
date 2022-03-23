package br.com.developer.ted.repository;

import br.com.developer.ted.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
