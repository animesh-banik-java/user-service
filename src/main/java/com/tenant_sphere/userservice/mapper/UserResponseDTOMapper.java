package com.tenant_sphere.userservice.mapper;

import com.tenant_sphere.userservice.basepackage.mapper.EntityToDtoMapper;
import com.tenant_sphere.userservice.entity.User;
import com.tenant_sphere.userservice.response.UserResponseDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface UserResponseDTOMapper extends EntityToDtoMapper<UserResponseDTO, User> {
}
