package cajas.spring.petclinic.services;

import cajas.spring.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
