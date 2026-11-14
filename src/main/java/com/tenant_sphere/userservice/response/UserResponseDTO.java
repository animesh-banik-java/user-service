package com.tenant_sphere.userservice.response;

import com.tenant_sphere.userservice.basepackage.enums.Status;
import lombok.Data;

import java.util.Date;

@Data
public class UserResponseDTO {

    private Long id;

    private String name;

    private String email;

    private String phoneNo;

    private Date dateOfBirth;

    private String address;

    private Status status;

    private Long createdBy;

    private Date createdAt;

    private Long updatedBy;

    private Date updatedAt;

}
