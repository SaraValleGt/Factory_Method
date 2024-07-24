package org.adaschool.api.service;

import org.adaschool.api.model.User;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserServiceImpl implements UserService {
    private final Map<Long, User> users = new HashMap<>();
    private long currentId = 1;

    @Override
    public User createUser(User user) {
        user.setId(currentId++);
        users.put(user.getId(), user);
        return user;
    }

    @Override
    public List<User> getAllUsers() {
        return new ArrayList<>(users.values());
    }

    @Override
    public Optional<User> getUserById(Long id) {
        return Optional.ofNullable(users.get(id));
    }

    @Override
    public User updateUser(Long id, User user) {
        if (users.containsKey(id)) {
            user.setId(id); // Asegura que el ID no cambie
            users.put(id, user);
            return user;
        } else {
            throw new NoSuchElementException("User not found");
        }
    }

    @Override
    public void deleteUser(Long id) {
        if (users.containsKey(id)) {
            users.remove(id);
        } else {
            throw new NoSuchElementException("User not found");
        }
    }
}
