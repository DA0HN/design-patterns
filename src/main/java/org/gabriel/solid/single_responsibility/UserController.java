package org.gabriel.solid.single_responsibility;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

/**
 * @author daohn on 19/08/2020
 * @project design-pattern-course
 */

// Handles incoming JSON requests that work on User
class UserController {

    private final UserPersistenceService persistenceService = new UserPersistenceService();

    // Create new user
    public String createUser(String userJson) throws IOException {
        try {
            ObjectMapper mapper = new ObjectMapper();
            User user = mapper.readValue(userJson, User.class);
            var validator = new UserValidator();
            if(!validator.validateUser(user)) {
                return "ERROR";
            }

            persistenceService.saveUser(user);

            return "SUCCESS";
        }
        catch(JsonProcessingException e) {
            return "ERROR";
        }
    }
}
