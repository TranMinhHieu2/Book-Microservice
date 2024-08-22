package com.devmh.identity.mapper;

import com.devmh.identity.dto.request.RoleRequest;
import com.devmh.identity.dto.response.RoleResponse;
import com.devmh.identity.entity.Role;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface RoleMapper {
    @Mapping(target = "permissions", ignore = true)
    Role toRole(RoleRequest request);

    RoleResponse toRoleResponse(Role role);
}
