package com.mrbebo.yachtBooking.repositories;

import com.mrbebo.yachtBooking.models.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOwnerRepository  extends JpaRepository<Owner,Long> {
    Owner findOwnerByEmail(String email);

}
