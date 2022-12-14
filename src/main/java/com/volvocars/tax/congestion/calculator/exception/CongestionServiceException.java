package com.volvocars.tax.congestion.calculator.exception;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
public class CongestionServiceException extends Exception {

  private String message;
  private HttpStatus httpStatus;

  public CongestionServiceException(String message) {
    this.message = message;
  }

  public CongestionServiceException(String message, HttpStatus httpStatus) {
    this.message = message;
    this.httpStatus = httpStatus;
  }
}
