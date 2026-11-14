package com.tenant_sphere.userservice.service;


import com.tenant_sphere.userservice.basepackage.request.PaginationRequest;
import com.tenant_sphere.userservice.request.FilterRequest;
import com.tenant_sphere.userservice.response.UserResponseDTO;
import com.tenant_sphere.userservice.request.UserRequestDTO;
import org.springframework.data.domain.Page;

public interface UserService {

    UserResponseDTO addUser(final UserRequestDTO request);

    UserResponseDTO updateUser(final Long userId, final UserRequestDTO request);

    UserResponseDTO getUserById(final Long userId);

    UserResponseDTO deleteUser(final Long userId);

    UserResponseDTO changeStatus(final Long userId);

    Page<UserResponseDTO> getUsers(final FilterRequest filterRequest, final PaginationRequest pageRequest);
}
