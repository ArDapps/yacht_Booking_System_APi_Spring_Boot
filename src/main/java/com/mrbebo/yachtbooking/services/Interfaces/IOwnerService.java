package com.mrbebo.yachtbooking.services.Interfaces;

import com.mrbebo.yachtbooking.entities.Owner;

import java.util.Collection;
import java.util.UUID;

public interface IOwnerService  {
    Owner create (Owner owner);
    Owner update (Owner owner);
    Boolean delete (UUID ownerId);

    Collection<Owner> getAllOwners(int pageSize);
    Owner getSpecificOwner(UUID ownerId);

}
