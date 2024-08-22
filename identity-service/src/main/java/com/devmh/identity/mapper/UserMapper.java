package com.devmh.identity.mapper;

import com.devmh.identity.dto.request.UserCreationRequest;
import com.devmh.identity.dto.request.UserUpdateRequest;
import com.devmh.identity.dto.response.UserResponse;
import com.devmh.identity.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserCreationRequest request);

    UserResponse toUserResponse(User user);

    @Mapping(target = "roles", ignore = true)
    void updateUser(@MappingTarget User user, UserUpdateRequest request);
}
