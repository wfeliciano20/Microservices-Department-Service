package com.williamfeliciano.departmentservice.controller;

import com.williamfeliciano.departmentservice.dto.DepartmentDto;
import com.williamfeliciano.departmentservice.service.DeparmentService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/departments")
@AllArgsConstructor
public class DepartmentController {

    DeparmentService deparmentService;

    @PostMapping
    public ResponseEntity<DepartmentDto> saveDepartment(@RequestBody @Valid DepartmentDto departmentDto){
        DepartmentDto savedDepartment = deparmentService.saveDepartment(departmentDto);
        return new ResponseEntity<>(savedDepartment, HttpStatus.CREATED);
    }

    @GetMapping("/{department-code}")
    public ResponseEntity<DepartmentDto> getDepartmentByCode(@PathVariable("department-code") String departmentCode){
        DepartmentDto savedDepartment = deparmentService.getDepartmentByCode(departmentCode);
        return new ResponseEntity<>(savedDepartment,HttpStatus.OK);
    }



}
