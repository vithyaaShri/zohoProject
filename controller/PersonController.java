package com.example.demo.controller;

import com.example.demo.dto.PersonDto;
import com.example.demo.repository.PersonRepository;
import com.example.demo.service.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin
@RequestMapping("/api/person")
public class PersonController {
    @Autowired
    private PersonService personService;
    @Autowired
    private PersonRepository passengerRepository;
    //PostMapping is to add the passenger details to database
    @PostMapping
    public ResponseEntity<PersonDto> savePerson(@RequestBody PersonDto passengerDto)
    {
        PersonDto savedPassenger=personService.addPerson(passengerDto);
        return new ResponseEntity<>(savedPassenger, HttpStatus.CREATED);
    }
    //GetMapping is to get all the passengers details
    @GetMapping
    public ResponseEntity<List<PersonDto>> getAllPassenger()
    {
        List<PersonDto> allUser=personService.getAllPassenger();
        return new ResponseEntity<List<PersonDto>>(allUser,HttpStatus.OK);
    }
}
