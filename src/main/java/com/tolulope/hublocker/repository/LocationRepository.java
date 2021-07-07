package com.tolulope.hublocker.repository;

import com.tolulope.hublocker.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {
    Optional<Location> findByCity(String city);
    Optional<Location> findById(Long id);
}
