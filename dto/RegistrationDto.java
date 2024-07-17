package com.example.demo.dto;
//import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@Data
@NoArgsConstructor
public class RegistrationDto {
    private String name;
    private  String username;
    private String password;
    private  String email;
}