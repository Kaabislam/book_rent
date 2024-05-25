package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.entity.UserPrincipal;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class MyOwnUserService implements UserDetailsService {
    @Autowired
    UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("username is ::" +username);
        User user = userRepository.findByUserName(username);
        System.out.println("User is :: "+user);
        if(user == null){
            throw new UsernameNotFoundException("User Not Found");
        }
        return new UserPrincipal(user);


    }
}
