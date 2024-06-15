package com.defstaff.coding.test.configuration.exceptionHandler;

public class TradingException extends CustomException {

  public TradingException(String errorCode, String message) {
    super(errorCode, message);
  }

  public TradingException(String message) {
    super(message);
  }
}
