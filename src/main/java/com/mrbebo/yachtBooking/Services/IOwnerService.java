package com.mrbebo.yachtBooking.Services;

import com.mrbebo.yachtBooking.models.Owner;
import com.mrbebo.yachtBooking.repositories.IOwnerRepository;

import java.util.Collection;

public interface IOwnerService  {
    Owner create (Owner owner);
    Owner update (Owner owner);
    Boolean delete (Long ownerId);

    Collection<Owner> getAllOwners(int pageSize);
    Owner getSpecificOwner(Long ownerId);

}
