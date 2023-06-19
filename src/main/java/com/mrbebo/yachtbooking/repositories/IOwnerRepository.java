package com.mrbebo.yachtbooking.repositories;

import com.mrbebo.yachtbooking.entities.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IOwnerRepository  extends JpaRepository<Owner, UUID> {
    Owner findOwnerByEmail(String email);

}
