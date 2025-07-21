package com.data.java_service_session09.model.dto.resonse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class DataResponse <T>{
    private T data;
    private HttpStatus status;
}
