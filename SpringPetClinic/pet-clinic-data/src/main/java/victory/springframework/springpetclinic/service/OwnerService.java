package victory.springframework.springpetclinic.service;

import victory.springframework.springpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
