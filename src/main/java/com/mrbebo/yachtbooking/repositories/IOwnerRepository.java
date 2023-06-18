package com.mrbebo.yachtbooking.repositories;

import com.mrbebo.yachtbooking.Entities.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOwnerRepository  extends JpaRepository<Owner,Long> {
    Owner findOwnerByEmail(String email);

}
