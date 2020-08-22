package org.gabriel.patterns.builder.second_impl;

import org.gabriel.patterns.builder.shared_model.Address;
import org.gabriel.patterns.builder.first_impl.User;
import org.gabriel.patterns.builder.second_impl.UserDTO.UserDTOBuilder;

import java.time.LocalDate;

/**
 * @author daohn on 22/08/2020
 * @project design-pattern-course
 */
class Builder2ndImpl {

    public static void main(String[] args) {
        var user = createUser();
        var dto = directBuild(UserDTO.getBuilder(), user);
        System.out.println(dto);
    }

    /**
     * This method serves the role of director in builder pattern.
     *
     * @param builder A implementation of builder DTO
     * @param user    Entity to extract data to builder
     * @return A built UserDTO object
     */
    private static UserDTO directBuild(
            UserDTOBuilder builder, User user) {
        return builder.withFirstName(user.getFirstName())
                .withLastName(user.getLastName())
                .withBirthday(user.getBirthDay())
                .withAddress(user.getAddress())
                .build();
    }

    /**
     * Returns a sample user.
     *
     * @return User
     */
    @SuppressWarnings("Duplicates")
    public static User createUser() {
        var user = new User();

        user.setBirthDay(LocalDate.of(1960, 8, 22));
        user.setFirstName("Ron");
        user.setLastName("Swanson");
        var address = new Address();
        address.setHouseNumber("100");
        address.setStreet("State Street");
        address.setCity("Cuiabá");
        address.setState("Mato Grosso");
        address.setZipCode("12894");
        user.setAddress(address);
        return user;
    }

}
