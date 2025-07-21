package com.data.java_service_session09.model.dto.resonse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class DataErrorResponse <T>{
    private String message;
    private T errors;
    private HttpStatus status;
}
