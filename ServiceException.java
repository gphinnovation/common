package com.rightbrain.commons.exceptionhandling.exception;


import com.rightbrain.commons.exceptionhandling.dto.ServiceError;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class ServiceException extends Exception {

    private HttpStatus status;
    private ServiceError serviceError;

    public ServiceException(ServiceError serviceError, HttpStatus status) {
        super(serviceError.getMsg());
        this.serviceError = serviceError;
        this.status = status;
    }

}
