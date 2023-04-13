package com.williamfeliciano.departmentservice.controller;

import com.williamfeliciano.departmentservice.dto.DepartmentDto;
import com.williamfeliciano.departmentservice.service.DeparmentService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@Tag(
        name = "Department Service - DepartmentController",
        description = "Department Controller Exposes REST APIs for Department Service"
)
@RestController
@RequestMapping("api/departments")
@AllArgsConstructor
public class DepartmentController {

    DeparmentService deparmentService;

    @Operation(
            summary = "Save Deparment REST API Endpoint",
            description = "Save Deparment Object In Database"
    )
    @ApiResponse(
            responseCode = "201",
            description = "HTTP status code 201 Created"
    )
    @PostMapping
    public ResponseEntity<DepartmentDto> saveDepartment(@RequestBody @Valid DepartmentDto departmentDto){
        DepartmentDto savedDepartment = deparmentService.saveDepartment(departmentDto);
        return new ResponseEntity<>(savedDepartment, HttpStatus.CREATED);
    }

    @Operation(
            summary = "Get a Deparment by code REST API Endpoint",
            description = "Get a Deparment Object from Database"
    )
    @ApiResponse(
            responseCode = "200",
            description = "HTTP status code 200 Success"
    )
    @GetMapping("/{department-code}")
    public ResponseEntity<DepartmentDto> getDepartmentByCode(@PathVariable("department-code") String departmentCode){
        DepartmentDto savedDepartment = deparmentService.getDepartmentByCode(departmentCode);
        return new ResponseEntity<>(savedDepartment,HttpStatus.OK);
    }



}
