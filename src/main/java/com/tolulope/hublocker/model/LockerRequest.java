package com.tolulope.hublocker.model;

import lombok.Data;

@Data
public class LockerRequest {
    private String name;

    private String price;

    private int noOfSlot;

    private Long location;
}
