package com.example.restgreeting.constants;

/**
 * This class contains constants used for mapping endpoints and relaying error messages. They are
 * used in the GreetingController, ExceptionController, and GreetingServiceImpl classes
 */
public class StringConstants {

  public static final String REQUIRED_FIELD = "is a required field";
  public static final String QUERY_REQUEST = "Query request received for ";
  public static final String NOT_FOUND = "Could not locate resource: ";
  public static final String VALIDATION_ERROR = "Validation error";
  public static final String UPDATE_REQUEST = "Put request received for ";
  public static final String DELETE_REQUEST = "Delete request received for ";
  public static final String POST_REQUEST = "Post request received for ";
  public static final String BAD_DATA = "Bad data";
  public static final String SERVER_ERROR = "Server error";
  public static final String UNEXPECTED_ERROR = "Unexpected server error";

  //endpoint constants
  public static final String CONTEXT_GREETINGS = "/greetings";
}
