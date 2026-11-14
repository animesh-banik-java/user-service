package com.tenant_sphere.userservice.basepackage.mapper;

import java.util.List;

public interface RequestToEntityMapper<R, E> {

	E toEntity(R request);

	List<E> toEntity(List<R> requestList);

}
