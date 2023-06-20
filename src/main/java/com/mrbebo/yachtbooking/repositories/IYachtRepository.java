package com.mrbebo.yachtbooking.repositories;

import com.mrbebo.yachtbooking.entities.Yacht;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface IYachtRepository extends JpaRepository<Yacht, UUID> {
    List<Yacht> findByOwnerId(UUID ownerId);

}
