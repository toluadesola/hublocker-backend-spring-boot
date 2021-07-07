package com.tolulope.hublocker.service;

import com.tolulope.hublocker.model.Location;
import org.springframework.stereotype.Service;

@Service
public interface LocationService{
    Location addLocation(Location location);
}
