package com.williamfeliciano.departmentservice.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentDto {

    private Long id;
    @NotEmpty
    private String departmentName;
    @NotEmpty
    private String departmentDescription;
    @NotEmpty
    private String departmentCode;
}
