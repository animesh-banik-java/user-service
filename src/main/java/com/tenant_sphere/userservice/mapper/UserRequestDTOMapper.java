package com.tenant_sphere.userservice.mapper;

import com.tenant_sphere.userservice.basepackage.mapper.RequestToEntityMapper;
import com.tenant_sphere.userservice.entity.User;
import com.tenant_sphere.userservice.request.UserRequestDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedSourcePolicy = ReportingPolicy.WARN, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserRequestDTOMapper extends RequestToEntityMapper<UserRequestDTO, User> {
}
