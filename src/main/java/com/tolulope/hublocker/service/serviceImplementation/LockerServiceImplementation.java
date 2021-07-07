package com.tolulope.hublocker.service.serviceImplementation;

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
        Locker locker = new Locker(
                null,
                lockerRequest.getName(),
                lockerRequest.getPrice(),
                lockerRequest.getNoOfSlot(),
                null
        );
        locker.setLocation(locationRepository.findById(lockerRequest.getLocation()).get());
        return lockerRepository.save(locker);
    }

    @Override
    public List<Locker> getAllLockers() {
        return lockerRepository.findAll();
    }
}
