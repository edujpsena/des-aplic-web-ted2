package br.com.developer.ted.service;

import br.com.developer.ted.entity.User;
import br.com.developer.ted.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> getAll() {
        return repository.findAll();
    }

    public User getById(Long id) {
        return repository.findById(id).get();
    }

    public User save(User user) {
        return repository.save(user);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public void update(long id, User newUser) {
        repository.findById(id).map(u -> {
            newUser.setId(u.getId());
            return repository.save(newUser);
        });
    }

}
