package cajas.spring.petclinic.services;

import cajas.spring.petclinic.model.Owner;
import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
