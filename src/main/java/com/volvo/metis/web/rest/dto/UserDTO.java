package com.volvo.metis.web.rest.dto;

import org.hibernate.validator.constraints.Email;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

public class UserDTO {

    @Size(max = 50)
    private String id;

    @Pattern(regexp = "^[a-z0-9]*$")
    @NotNull
    @Size(min = 1, max = 50)
    private String login;

    @Size(min = 5, max = 100)
    private String password;

    @Size(max = 100)
    private String organizationName;

    @Size(max = 50)
    private String firstName;

    @Size(max = 50)
    private String lastName;

    @Size(max = 50)
    private String middleName;

    @Size(min = 1, max = 50)
    private String phone;

    @Email
    @Size(min = 5, max = 100)
    private String email;

    @Size(min = 2, max = 5)
    private String langKey;

    private Boolean activated;

    private List<String> roles = new ArrayList<>();

    public UserDTO() {
    }

    public UserDTO(String login, String password, String organizationName, String firstName, String lastName, String middleName,
                   String phone, String email, String langKey, List<String> roles, Boolean activated, String id) {
        this.login = login;
        this.password = password;
        this.organizationName = organizationName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.phone = phone;
        this.email = email;
        this.langKey = langKey;
        this.roles = roles;
        this.activated = activated;
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public String getLogin() {
        return login;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getLangKey() {
        return langKey;
    }

    public List<String> getRoles() {
        return roles;
    }

    public Boolean getActivated() {
        return activated;
    }

    public void setActivated(Boolean activated) {
        this.activated = activated;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
            "login='" + login + '\'' +
            ", password='" + password + '\'' +
            ", firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", email='" + email + '\'' +
            ", langKey='" + langKey + '\'' +
            ", roles=" + roles +
            ", activated=" + activated +
            ", id=" + id +
            '}';
    }
}
