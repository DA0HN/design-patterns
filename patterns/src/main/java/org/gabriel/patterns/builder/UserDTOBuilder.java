package org.gabriel.patterns.builder;

import java.time.LocalDate;

/**
 * @author daohn on 22/08/2020
 * @project design-pattern-course
 */

// Abstract builder
public interface UserDTOBuilder {
    // Methods to build "parts" of product at a time
    UserDTOBuilder withFirstName(String firstName);
    UserDTOBuilder withLastName(String lastName);
    UserDTOBuilder withBirthday(LocalDate date);
    UserDTOBuilder withAddress(Address address);

    // Method to "assemble" final product
    UserDTO build();
    // (Optional) Method to fetch already build object
    UserDTO getUserDTO();
}
