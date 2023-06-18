package com.mrbebo.yachtbooking.repositories;

import com.mrbebo.yachtbooking.Entities.Yacht;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IYachtRepository extends JpaRepository<Yacht,Long> {
    List<Yacht> findYachtsByOwner(Long ownerId);

}
