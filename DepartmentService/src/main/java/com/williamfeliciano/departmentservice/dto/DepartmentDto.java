package com.williamfeliciano.departmentservice.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Schema(
        description = "DeparmentDto Model Documentation"
)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentDto {

    private Long id;
    @Schema(
            description = "Deparment Name"
    )
    @NotEmpty
    private String departmentName;
    @Schema(
            description = "Deparment Description"
    )
    @NotEmpty
    private String departmentDescription;
    @Schema(
            description = "Department Code"
    )
    @NotEmpty
    private String departmentCode;
}
