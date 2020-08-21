package org.gabriel.solid.single_responsibility;

import java.io.IOException;

/**
 * @author daohn on 19/08/2020
 * @project design-pattern-course
 */
class Main {

    private static final String VALID_USER_JSON =
            """
                {
                        "name": "Randy",
                        "email": "randy@gmail.com",
                        "address": "110 sugar lane"
                }
            """;
    private static final String INVALID_USER_JSON =
            """
                {
                    "name": "Randy",
                    "email": "randy@gmail.com",
                    "address": "110 sugar lane',
                }
            """;

    public static void main(String[] args) throws IOException {
        var controller = new UserController();
        var response = controller.createUser(VALID_USER_JSON);
        if(!response.equalsIgnoreCase("SUCCESS")) {
            System.err.println("Failed");
        }
        System.out.println("Valid JSON received response: " + response);
        response = controller.createUser(INVALID_USER_JSON);
        if(!response.equalsIgnoreCase("SUCCESS")) {
            System.err.println("Failed");
        }
        System.out.println("Valid JSON received response: " + response);
    }
}
