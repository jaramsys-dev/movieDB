/**
 * Exception handler Class for moviesDB
 * Create by Janarthanam 29/06/2020
 **/

package com.spritle.moviesdb.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {

  private static final long serialVersionUID = 1L;

  public ResourceNotFoundException(String message)
  {
    super(message);
  }

}
