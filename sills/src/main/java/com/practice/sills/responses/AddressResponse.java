package com.practice.sills.responses;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AddressResponse {
    private int userId;
    private int id;
    private String title;
    private boolean completed;
}
