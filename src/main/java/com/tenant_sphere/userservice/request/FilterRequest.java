package com.tenant_sphere.userservice.request;


import lombok.Data;

@Data
public class FilterRequest {

    private String name;

    private String email;

    private String phoneNo;

    private String address;


}
