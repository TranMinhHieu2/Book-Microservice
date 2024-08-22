package com.devmh.identity.mapper;

import com.devmh.identity.dto.request.PermissionRequest;
import com.devmh.identity.dto.response.PermissionResponse;
import com.devmh.identity.entity.Permission;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PermissionMapper {
    Permission toPermission(PermissionRequest request);

    PermissionResponse toPermissionResponse(Permission permission);
}
