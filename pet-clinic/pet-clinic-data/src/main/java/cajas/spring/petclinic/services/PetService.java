package cajas.spring.petclinic.services;

import java.util.Set;

import cajas.spring.petclinic.model.Pet;

public interface PetService {
    Pet getById(Long id);

    Pet save(Pet pet);

    Set<Pet> getAll();
}
