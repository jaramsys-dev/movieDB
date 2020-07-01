/**
 * Exception handler Advice Class for moviesDB
 * Create by Janarthanam 29/06/2020
 **/

package com.spritle.moviesdb.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ResourceNotFoundAdvice {

  @ResponseBody
  @ExceptionHandler(ResourceNotFoundException.class)
  @ResponseStatus(HttpStatus.NOT_FOUND)
  String pageNotFoundHandler(ResourceNotFoundException ex) {
    return ex.getMessage();
  }

}
