package br.com.jvsobraz.desafiobackendtodolist.exception;

public class BadRequestException extends RuntimeException {

  public BadRequestException(String message) {
    super(message);
  }

}