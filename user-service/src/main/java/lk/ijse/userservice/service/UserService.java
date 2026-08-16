package lk.ijse.userservice.service;

import lk.ijse.userservice.entity.User;
import lk.ijse.userservice.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class UserService {

    private final UserRepository userRepository;

    public User register(User user) {

        if (userRepository.findByName(user.getName()).isPresent()) {
            throw new RuntimeException("Username already exists");
        }

        return userRepository.save(user);
    }

    public String login(String username, String password) {

        User user = userRepository.findByName(username)
                .orElseThrow(() -> new RuntimeException("User not found"));

        if (!user.getPassword().equals(password)) {
            throw new RuntimeException("Invalid password");
        }

        return "Login successful";
    }

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // CREATE
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    // READ - All
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // READ - By ID
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    // READ - By Username
    public Optional<User> getUserByName(String name) {
        return userRepository.findByName(name);
    }

    // UPDATE
    public User updateUser(Long id, User user) {

        User existingUser = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));

        existingUser.setName(user.getName());
        existingUser.setPassword(user.getPassword());
        existingUser.setEmail(user.getEmail());

        return userRepository.save(existingUser);
    }

    // DELETE
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}