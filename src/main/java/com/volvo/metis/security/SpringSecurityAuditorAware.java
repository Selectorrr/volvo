package com.volvo.metis.security;

import com.volvo.metis.config.Constants;
import com.volvo.metis.domain.User;
import com.volvo.metis.repository.UserRepository;
import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import java.util.Optional;

/**
 * Implementation of AuditorAware based on Spring Security.
 */
@Component
public class SpringSecurityAuditorAware implements AuditorAware<String> {

    @Inject
    private UserRepository userRepository;

    public String getCurrentAuditor() {
        String userName = SecurityUtils.getCurrentLogin();
        Optional<User> user = userRepository.findOneByLogin(userName);
        return (user != null ? user.get().getId() : Constants.SYSTEM_ACCOUNT);
    }
}
