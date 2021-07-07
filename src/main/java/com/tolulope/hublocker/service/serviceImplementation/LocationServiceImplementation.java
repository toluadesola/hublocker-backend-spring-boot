package com.tolulope.hublocker.service.serviceImplementation;

import com.tolulope.hublocker.model.Location;
import com.tolulope.hublocker.repository.LocationRepository;
import com.tolulope.hublocker.service.LocationService;
import org.springframework.stereotype.Component;

@Component
public record LocationServiceImplementation(
        LocationRepository locationRepository
) implements LocationService {

    @Override
    public Location addLocation(Location location) {
        return locationRepository.save(location);
    }
}
