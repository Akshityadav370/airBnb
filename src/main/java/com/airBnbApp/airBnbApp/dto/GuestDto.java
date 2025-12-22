package com.airBnbApp.airBnbApp.dto;

import com.airBnbApp.airBnbApp.entity.User;
import com.airBnbApp.airBnbApp.entity.enums.Gender;
import jakarta.persistence.*;
import lombok.Data;

@Data
public class GuestDto {
    private Long id;
    private User user;
    private String name;
    private Gender gender;
    private Integer age;
}
