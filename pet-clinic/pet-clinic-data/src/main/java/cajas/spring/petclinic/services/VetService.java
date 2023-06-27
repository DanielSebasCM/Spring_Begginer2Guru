package cajas.spring.petclinic.services;

import java.util.Set;

import cajas.spring.petclinic.model.Vet;

public interface VetService {

    Vet getById(Long id);

    Vet save(Vet vet);

    Set<Vet> getAll();
}