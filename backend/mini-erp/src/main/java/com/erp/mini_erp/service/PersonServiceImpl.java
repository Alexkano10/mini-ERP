package com.erp.mini_erp.service;

import com.erp.mini_erp.exception.PersonNotFoundException;
import com.erp.mini_erp.model.Person;
import com.erp.mini_erp.repository.PersonRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;

    @Autowired
    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }




    @Override
    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }

    @Override
    public Optional<Person> getPersonById(Long id) {
        return personRepository.findById(id);
    }

    @Override
    public Person createPerson(Person person) {
        return personRepository.save(person);
    }

    @Override
    @Transactional
    public Person updatePerson(Long id, Person person) {
        return personRepository.findById(id)
                .map(existingPerson -> {
                    existingPerson.setFirstName(person.getFirstName());
                    existingPerson.setLastName(person.getLastName());
                    existingPerson.setIdNumber(person.getIdNumber());
                    existingPerson.setPhone(person.getPhone());
                    existingPerson.setEmail(person.getEmail());
                    existingPerson.setAddress(person.getAddress());
                    return personRepository.save(existingPerson);
                })
                .orElseThrow(() -> new PersonNotFoundException("Person not found with id: " + id));
    }

    @Override
    @Transactional
    public void deletePerson(Long id) {
        if (personRepository.existsById(id)) {
            personRepository.deleteById(id);
        } else {
            throw new PersonNotFoundException("Person not found with id: " + id);
        }
    }
}