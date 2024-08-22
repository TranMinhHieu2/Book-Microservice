package com.devmh.profile.mapper;

import com.devmh.profile.dto.response.UserProfileReponse;
import com.devmh.profile.entity.UserProfile;
import org.mapstruct.Mapper;

import com.devmh.profile.dto.request.ProfileCreationRequest;

@Mapper(componentModel = "spring")
public interface UserProfileMapper {
    UserProfile toUserProfile(ProfileCreationRequest request);

    UserProfileReponse toUserProfileReponse(UserProfile entity);
}
