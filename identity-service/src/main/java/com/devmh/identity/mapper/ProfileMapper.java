package com.devmh.identity.mapper;

import com.devmh.identity.dto.request.ProfileCreationRequest;
import com.devmh.identity.dto.request.UserCreationRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProfileMapper {
    ProfileCreationRequest toProfileCreationRequest(UserCreationRequest request);
}
