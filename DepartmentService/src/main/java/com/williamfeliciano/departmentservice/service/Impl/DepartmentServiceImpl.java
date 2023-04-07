package com.williamfeliciano.departmentservice.service.Impl;

import com.williamfeliciano.departmentservice.Exception.ResourceNotFoundException;
import com.williamfeliciano.departmentservice.dto.DepartmentDto;
import com.williamfeliciano.departmentservice.entity.Department;
import com.williamfeliciano.departmentservice.repository.DepartmentRepository;
import com.williamfeliciano.departmentservice.service.DeparmentService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DepartmentServiceImpl implements DeparmentService {

    private DepartmentRepository departmentRepository;

    private ModelMapper modelMapper;

    @Override
    public DepartmentDto saveDepartment(DepartmentDto departmentDto) {

        // Convert DepartmentDto to Entity
        Department department = modelMapper.map(departmentDto,Department.class);

        Department savedDepartment = departmentRepository.save(department);

        return modelMapper.map(savedDepartment,DepartmentDto.class);
    }

    @Override
    public DepartmentDto getDepartmentByCode(String departmentCode) {
        Department dbDepartment = departmentRepository.findByDepartmentCode(departmentCode);
        if(dbDepartment == null){
            throw new ResourceNotFoundException("department","id",departmentCode);
        }
        return modelMapper.map(dbDepartment, DepartmentDto.class);
    }
}
