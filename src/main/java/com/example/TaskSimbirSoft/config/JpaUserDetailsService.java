package com.example.TaskSimbirSoft.config;

import com.example.TaskSimbirSoft.DAO.ClientRepository;
import com.example.TaskSimbirSoft.models.Client;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JpaUserDetailsService implements UserDetailsService {

    private final ClientRepository userRepository;

    public JpaUserDetailsService(ClientRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository
                .findByEmail(username)
                .map(Client::new)
                .orElseThrow(() -> new UsernameNotFoundException("Username not found: " + username));
    }
}
