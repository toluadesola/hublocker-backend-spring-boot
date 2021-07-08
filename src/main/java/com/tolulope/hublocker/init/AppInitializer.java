package com.tolulope.hublocker.init;
import com.tolulope.hublocker.model.Location;
import com.tolulope.hublocker.repository.LocationRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Data
@Component
@AllArgsConstructor
public class AppInitializer implements ApplicationRunner {
    private final LocationRepository locationRepository;

    @Override
    public void run(ApplicationArguments args) {
        Location location;
        if (locationRepository.findByCity("lekki").isEmpty()) {
            location = new Location("no 2, third avenue", "lekki", "lagos");
            locationRepository.save(location);
        }
        if (locationRepository.findByCity("VI").isEmpty()) {
            location = new Location("house 17, plasma gardens", "VI", "lagos");
            locationRepository.save(location);
        }
        if (locationRepository.findByCity("Ikorodu").isEmpty()) {
            location = new Location("fabian hotel, rest avenue", "Ikorodu", "lagos");
            locationRepository.save(location);
        }
        if (locationRepository.findByCity("Ajah").isEmpty()) {
            location = new Location("gray wells, ocean view", "Ajah", "lagos");
            locationRepository.save(location);
        }
    }
}