package application.service;

import application.model.UserModel;
import application.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.util.HtmlUtils;

import java.util.List;
import java.util.Optional;

@Service
public class UserServices {

    @Autowired
    private UserRepository userRepository;

    public UserModel saveUser(UserModel user) {
        // Sanitize inputs before saving to the database
        user.setFirstName(escapeHtml(user.getFirstName()));
        user.setLastName(escapeHtml(user.getLastName()));
        user.setEmail(escapeHtml(user.getEmail()));

        return userRepository.save(user);
    }

    public Optional<UserModel> getUserById(int id) {
        Optional<UserModel> user = userRepository.findById(id);
        return user.map(this::sanitizeUser);
    }


    public List<UserModel> getAllUsers() {
        List<UserModel> users = userRepository.findAll();
        // Sanitize each user in the list before returning
        users.forEach(this::sanitizeUser);
        return users;
    }

    private UserModel sanitizeUser(UserModel user) {
        // Sanitize or encode user data before returning
        user.setFirstName(escapeHtml(user.getFirstName()));
        user.setLastName(escapeHtml(user.getLastName()));
        user.setEmail(escapeHtml(user.getEmail()));
        return user;
    }

    private String escapeHtml(String input) {
        return HtmlUtils.htmlEscape(input); // Sanitize input to prevent XSS
    }
}
