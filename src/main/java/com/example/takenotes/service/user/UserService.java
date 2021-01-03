package com.example.takenotes.service.user;

import com.example.takenotes.domain.User;
import com.example.takenotes.domain.UserCreateForm;

import java.util.Collection;
import java.util.Optional;


public interface UserService {

    Optional<User> getUserById(long id);

    Optional<User> getUserByEmail(String email);

    Collection<User> getAllUsers();

    User create(UserCreateForm form);

    User blockOrUnblockUser(long id) throws Exception;

}
