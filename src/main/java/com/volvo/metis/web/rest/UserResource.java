package com.volvo.metis.web.rest;

import com.codahale.metrics.annotation.Timed;
import com.volvo.metis.domain.User;
import com.volvo.metis.repository.UserRepository;
import com.volvo.metis.security.AuthoritiesConstants;
import com.volvo.metis.translator.UserTranslator;
import com.volvo.metis.web.rest.dto.UserDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;
import javax.inject.Inject;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * REST controller for managing users.
 */
@RestController
@RequestMapping("/api")
public class UserResource {

    private final Logger log = LoggerFactory.getLogger(UserResource.class);

    @Inject
    private UserRepository userRepository;

    @Inject
    private UserTranslator userTranslator;

    /**
     * GET  /users -> get all users.
     */
    @RequestMapping(value = "/users",
        method = RequestMethod.GET,
        produces = MediaType.APPLICATION_JSON_VALUE)
    @Timed
    public List<UserDTO> getAll() {
        log.debug("REST request to get all Users");
        List<User> all = userRepository.findAll();
        List<UserDTO> result = all.stream().map(userTranslator::toDto).collect(Collectors.toList());
        return result;
    }

    /**
     * GET  /users/:login -> get the "login" user.
     */
    @RequestMapping(value = "/users/{login}",
        method = RequestMethod.GET,
        produces = MediaType.APPLICATION_JSON_VALUE)
    @Timed
    @RolesAllowed(AuthoritiesConstants.ADMIN)
    ResponseEntity<UserDTO> getUser(@PathVariable String login) {
        log.debug("REST request to get User : {}", login);
        Optional<User> userByLogin = userRepository.findOneByLogin(login);
        User user = userByLogin.get();
        if (user == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        UserDTO userDTO = userTranslator.toDto(user);
        return new ResponseEntity<>(userDTO, HttpStatus.OK);
    }

    /**
     * DELETE  /users/:login -> get the "login" user.
     */
    @RequestMapping(value = "/users/{id}",
        method = RequestMethod.DELETE,
        produces = MediaType.APPLICATION_JSON_VALUE)
    @Timed
    @RolesAllowed(AuthoritiesConstants.ADMIN)
    ResponseEntity<User> deleteUser(@PathVariable String id) {
        log.debug("REST request to delete User : {}", id);
        userRepository.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);

    }
}
