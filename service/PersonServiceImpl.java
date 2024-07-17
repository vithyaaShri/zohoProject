package com.example.demo.service;
import com.example.demo.dto.PersonDto;
import com.example.demo.entity.Person;
import com.example.demo.repository.PersonRepository;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;
public class PersonServiceImpl {
    private ModelMapper modelMapper;
    private PersonRepository personRepository;
    //To Add passenger Detail at repository
    @Override
    public PersonDto addPerson(PersonDto personDto) {
        Person person=modelMapper.map(personRepository, Person.class);
        Person savePerson=personRepository.save(person);
        return modelMapper.map(savePerson, PersonDto.class);
    }
    @Override
    public PersonDto getPassengerById(Long id) {
        Person person = personRepository.findById(id).get();
        return modelMapper.map(person,PersonDto.class);
    }
}
