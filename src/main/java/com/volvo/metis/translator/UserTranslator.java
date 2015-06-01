package com.volvo.metis.translator;

import com.google.common.base.Strings;
import com.google.common.collect.Iterables;
import com.google.common.collect.Sets;
import com.volvo.metis.domain.Authority;
import com.volvo.metis.domain.User;
import com.volvo.metis.repository.AuthorityRepository;
import com.volvo.metis.web.rest.dto.UserDTO;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by Alex on 02/06/15.
 */
@Component
public class UserTranslator {

    @Inject
    private AuthorityRepository authorityRepository;

    public UserDTO toDto(User user){
        List<String> roles = new ArrayList<>();
        Set<Authority> authorities = user.getAuthorities();
        if (authorities != null && !authorities.isEmpty()) {
            roles.addAll(authorities.stream().map(Authority::getName).collect(Collectors.toList()));
        }
        UserDTO result = new UserDTO(user.getLogin(), null, user.getOrganizationName(), user.getFirstName(),
                user.getLastName(), user.getMiddleName(), user.getPhone(), user.getEmail(), user.getLangKey(),
                roles, user.getActivated(), user.getId());
        return result;
    }

    public User fromDto(UserDTO userDTO){
        User user = new User();
        user.setLogin(userDTO.getLogin());
        if (!Strings.isNullOrEmpty(userDTO.getPassword())) {
            user.setPassword(userDTO.getPassword());
        }
        user.setOrganizationName(userDTO.getOrganizationName());
        user.setFirstName(userDTO.getFirstName());
        user.setLastName(userDTO.getLastName());
        user.setMiddleName(userDTO.getMiddleName());
        user.setPhone(userDTO.getPhone());
        user.setEmail(userDTO.getEmail());
        user.setLangKey(userDTO.getLangKey());
        if (userDTO.getRoles() != null && !Iterables.isEmpty(userDTO.getRoles())) {
            user.setAuthorities(Sets.newHashSet(authorityRepository.findAll(userDTO.getRoles())));
        }
        user.setActivated(userDTO.getActivated());
        user.setId(userDTO.getId());
        return user;
    }
}
