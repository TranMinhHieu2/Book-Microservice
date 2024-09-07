package com.devmh.profile.controller;

import com.devmh.profile.dto.response.UserProfileReponse;
import com.devmh.profile.service.UserProfileService;
import org.springframework.web.bind.annotation.*;

import com.devmh.profile.dto.request.ProfileCreationRequest;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.List;

@RestController
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class UserProfileController {
    UserProfileService userProfileService;

    @GetMapping("/users/{profileId}")
    UserProfileReponse getProfile(@PathVariable String profileId) {
        return userProfileService.getProfile(profileId);
    }

    @GetMapping("/users")
    List<UserProfileReponse> getAllProfile(){
       return userProfileService.getAllProfiles();
    }
}
