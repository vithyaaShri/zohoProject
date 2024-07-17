package com.example.demo.service;
import com.example.demo.dto.PersonDto;

import java.util.List;

public interface PersonService {
    PersonDto addPerson(PersonDto personDto);

    PersonDto getPersonById(Long id);

    List<PersonDto> getAllPassenger();

    PersonDto updatePassenger(PersonDto personDto, Long id);

    void deletePassenger(Long id);
}
