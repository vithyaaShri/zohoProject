package com.example.demo.service;


import com.example.demo.dto.JwtAuthResponse;
import com.example.demo.dto.LoginDto;
import com.example.demo.dto.RegistrationDto;

public interface AuthService {
    String register(RegistrationDto registerDto);
    JwtAuthResponse login(LoginDto loginDto);
}
