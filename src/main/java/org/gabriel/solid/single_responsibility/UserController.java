package org.gabriel.solid.single_responsibility;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.regex.Pattern;

/**
 * @author daohn on 19/08/2020
 * @project design-pattern-course
 */

// Handles incoming JSON requests that work on User
public class UserController {

    private final Store store = new Store();

    // Create new user
    public String createUser(String userJson) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        User user = mapper.readValue(userJson, User.class);
        if(!isValidUser(user)) {
            return "ERROR";
        }
        store.store(user);
        return "SUCCESS";
    }

    // Validates the user object
    private boolean isValidUser(User user) {
        if(!isPresent(user.getName())) {
            return false;
        }
        user.setName(user.getName().trim());
        if(!isValidAlphaNumeric(user.getName())) {
            return false;
        }
        if(user.getEmail() == null || user.getEmail().trim().length() == 0) {
            return false;
        }
        user.setEmail(user.getEmail().trim());
        if(!isValidEmail(user.getEmail())) {
            return false;
        }
        return true;
    }

    // Simply checks if value is null or empty...
    private boolean isPresent(String value) {
        return value != null && value.trim().length() > 0;
    }

    // Check string for special characters
    private boolean isValidAlphaNumeric(String value) {
        var pattern = Pattern.compile("[^A-Za-z0-9]");
        var matcher = pattern.matcher(value);
        return !matcher.find();
    }

    // Check string for valid email address
    private boolean isValidEmail(String value) {
        var pattern = Pattern.compile(
                "^[\\\\w!#$%&’*+/=?`{|}~^-]+(?:\\\\.[\\\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\\\.)+[a-zA-Z]{2,6}$");
        var matcher = pattern.matcher(value);
        return !matcher.find();
    }
}
