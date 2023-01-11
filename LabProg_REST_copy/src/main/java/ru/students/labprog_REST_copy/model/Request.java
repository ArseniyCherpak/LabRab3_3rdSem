package ru.students.labprog_REST_copy.model;

import lombok.Builder;
import lombok.Data;

import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Max;

@Data
@Builder
public class Request {

    @NotBlank
    @Size(max = 32)
    private String uid;

    @NotBlank
    @Size(max = 32)
    private String operationUid;

    private String systemName;

    @NotBlank
    private String systemTime;

    private String sourse;

    private Integer communicationId;
    private Integer templateId;

    @Max(7)
    private Integer productCode;

    @Max(5)
    private Integer smsCode;
}
