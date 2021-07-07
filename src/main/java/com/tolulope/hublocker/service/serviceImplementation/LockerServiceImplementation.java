package com.tolulope.hublocker.service.serviceImplementation;

import com.tolulope.hublocker.model.Location;
import com.tolulope.hublocker.model.Locker;
import com.tolulope.hublocker.model.LockerRequest;
import com.tolulope.hublocker.repository.LocationRepository;
import com.tolulope.hublocker.repository.LockerRepository;
import com.tolulope.hublocker.service.LockerService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public record LockerServiceImplementation(
        LockerRepository lockerRepository,
        LocationRepository locationRepository) implements LockerService {
    @Override
    public Locker saveLocker(LockerRequest lockerRequest) {
        Location location = locationRepository.findById(lockerRequest.getLocation()).get();
        Locker locker = new Locker(
                null,
                location.getCity() + " locker",
                lockerRequest.getPrice(),
                lockerRequest.getNoOfSlot(),
                null
        );
        locker.setLocation(location);
        return lockerRepository.save(locker);
    }

    @Override
    public List<Locker> getAllLockers() {
        return lockerRepository.findAll();
    }
}
