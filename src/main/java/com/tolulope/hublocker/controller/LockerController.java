package com.tolulope.hublocker.controller;


import com.tolulope.hublocker.model.LockerRequest;
import com.tolulope.hublocker.service.LockerService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/lockers")
@AllArgsConstructor
public class LockerController{

    private final LockerService lockerService;

    @PostMapping
    public ResponseEntity<?> saveLocker(@RequestBody LockerRequest lockerRequest) {
        return new ResponseEntity<>(lockerService.saveLocker(lockerRequest), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> getAllLockers() {
        return new ResponseEntity<>(lockerService.getAllLockers(), HttpStatus.OK);
    }
}
