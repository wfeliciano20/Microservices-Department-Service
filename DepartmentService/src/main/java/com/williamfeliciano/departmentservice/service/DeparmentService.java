package com.williamfeliciano.departmentservice.service;

import com.williamfeliciano.departmentservice.dto.DepartmentDto;

public interface DeparmentService {

    DepartmentDto saveDepartment(DepartmentDto departmentDto);
    DepartmentDto getDepartmentByCode(String departmentCode);
}
