package com.example.demo.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonDto {
        private Long Id;
        private  String personName;
        private Long aadharId;
        private Long contactNo;
        private  String email;
        private int age;
}
