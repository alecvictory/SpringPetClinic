package victory.springframework.springpetclinic.services;

import victory.springframework.springpetclinic.models.Owner;


public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
