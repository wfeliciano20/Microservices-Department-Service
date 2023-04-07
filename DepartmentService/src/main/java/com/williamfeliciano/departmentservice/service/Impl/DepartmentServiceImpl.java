package com.williamfeliciano.departmentservice.service.Impl;

import com.williamfeliciano.departmentservice.dto.DepartmentDto;
import com.williamfeliciano.departmentservice.entity.Department;
import com.williamfeliciano.departmentservice.repository.DepartmentRepository;
import com.williamfeliciano.departmentservice.service.DeparmentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DepartmentServiceImpl implements DeparmentService {

    private DepartmentRepository departmentRepository;

    @Override
    public DepartmentDto saveDepartment(DepartmentDto departmentDto) {

        // Convert DepartmentDto to Entity
        Department department = new Department(
                departmentDto.getId(),
                departmentDto.getDepartmentName(),
                departmentDto.getDepartmentDescription(),
                departmentDto.getDepartmentCode());

        Department savedDepartment = departmentRepository.save(department);

        DepartmentDto dto = new DepartmentDto(
                savedDepartment.getId(),
                savedDepartment.getDepartmentName(),
                savedDepartment.getDepartmentDescription(),
                savedDepartment.getDepartmentCode()
        );
        return dto;
    }

    @Override
    public DepartmentDto getDepartmentByCode(String departmentCode) {
        Department dbDepartment = departmentRepository.findByDepartmentCode(departmentCode);
        return new DepartmentDto(
                dbDepartment.getId(),
                dbDepartment.getDepartmentName(),
                dbDepartment.getDepartmentDescription(),
                dbDepartment.getDepartmentCode()
        );
    }
}
