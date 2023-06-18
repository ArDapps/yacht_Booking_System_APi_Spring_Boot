package com.mrbebo.yachtbooking.Services.Interfaces;

import com.mrbebo.yachtbooking.Entities.Owner;

import java.util.Collection;

public interface IOwnerService  {
    Owner create (Owner owner);
    Owner update (Owner owner);
    Boolean delete (Long ownerId);

    Collection<Owner> getAllOwners(int pageSize);
    Owner getSpecificOwner(Long ownerId);

}
