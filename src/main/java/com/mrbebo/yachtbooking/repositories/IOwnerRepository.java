package com.mrbebo.yachtbooking.repositories;

import com.mrbebo.yachtbooking.entities.Owner;
import com.mrbebo.yachtbooking.entities.Yacht;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface IOwnerRepository  extends JpaRepository<Owner, UUID> {
    Owner findOwnerByEmail(String email);
}
