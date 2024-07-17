package com.example.demo.security;

import com.example.demo.entity.UserSecurity;
import com.example.demo.repository.UserSecurityRepo;
import lombok.AllArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CustomUserDetailService implements UserDetailsService {
    private UserSecurityRepo userRepository;
    //Create User bu setting role authorize them
    @Override
    public UserDetails loadUserByUsername(String usernameEmail) throws UsernameNotFoundException {
        UserSecurity user= userRepository.findByUsernameOrEmail(usernameEmail,usernameEmail)
                .orElseThrow(()->new UsernameNotFoundException("User does not exist"));

        Set<GrantedAuthority> authority=user.getRoleSet().stream()
                .map(role->new SimpleGrantedAuthority(role.getName()))
                .collect(Collectors.toSet());

        return new org.springframework.security.core.userdetails.User(
                usernameEmail,user.getPassword(),authority
        );
    }
}