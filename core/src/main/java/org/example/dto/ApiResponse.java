package org.example.dto;

import lombok.*;

import java.util.Collections;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class ApiResponse <T>{
    private String code;
    private String message;
    private T data;
    private List<Collections> errors;
}
