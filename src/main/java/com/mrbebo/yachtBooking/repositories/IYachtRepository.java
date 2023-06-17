package com.mrbebo.yachtBooking.repositories;

import com.mrbebo.yachtBooking.models.Owner;
import com.mrbebo.yachtBooking.models.Yacht;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IYachtRepository extends JpaRepository<Yacht,Long> {

}
