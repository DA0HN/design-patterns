package org.gabriel.patterns.builder.second_impl;

import org.gabriel.patterns.builder.shared_model.Address;

import java.time.LocalDate;
import java.time.Period;
import java.util.StringJoiner;

/**
 * @author daohn on 22/08/2020
 * @project design-pattern-course
 */

// Entity class used to construct the DTO
class UserDTO {
    private String name;
    private String age;
    private String address;


    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    private void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    private void setAddress(String address) {
        this.address = address;
    }

    @Override public String toString() {
        return new StringJoiner(", ", UserDTO.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("age='" + age + "'")
                .add("address='" + address + "'")
                .toString();
    }

    // Get builder instance
    public static UserDTOBuilder getBuilder() {
        return new UserDTOBuilder();
    }

    // Builder
    public static class UserDTOBuilder {
        private String firstName;
        private String lastName;
        private String age;
        private String address;
        private UserDTO dto;

        public UserDTOBuilder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserDTOBuilder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserDTOBuilder withBirthday(LocalDate date) {
            age = Integer.toString(Period.between(date, LocalDate.now()).getYears());
            return this;
        }

        public UserDTOBuilder withAddress(Address address) {
            this.address = address.getHouseNumber() + ", " + address.getStreet()
                    + "\n" + address.getCity() + "\n" + address.getState()
                    + " " + address.getZipCode();
            return this;
        }

        public UserDTO build() {
            dto = new UserDTO();
            dto.setName(firstName + " " + lastName);
            dto.setAge(age);
            dto.setAddress(address);
            return dto;
        }

        public UserDTO getUserDTO() {
            return dto;
        }
    }
}
