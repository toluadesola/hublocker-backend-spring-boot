package com.tolulope.hublocker.service;

import com.tolulope.hublocker.model.Locker;
import com.tolulope.hublocker.model.LockerRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LockerService {
    Locker saveLocker(LockerRequest lockerRequest);
    List<Locker> getAllLockers();
}
