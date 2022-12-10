package fr.isika.al17.raiddonspringserver.security.services;

public class CSVResponseMessage {

    private String message;

    public CSVResponseMessage(String message) {
      this.message = message;
    }

    public String getMessage() {
      return message;
    }

    public void setMessage(String message) {
      this.message = message;
    }
  }