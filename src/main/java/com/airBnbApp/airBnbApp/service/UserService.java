package com.airBnbApp.airBnbApp.service;

import com.airBnbApp.airBnbApp.dto.ProfileUpdateRequestDto;
import com.airBnbApp.airBnbApp.dto.UserDto;
import com.airBnbApp.airBnbApp.entity.User;

public interface UserService {

    User getUserById(Long id);

    void updateProfile(ProfileUpdateRequestDto profileUpdateRequestDto);

    UserDto getMyProfile();
}
