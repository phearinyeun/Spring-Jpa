package dev.danvega.springBootJpa.response;

import java.time.LocalDateTime;

public class UserNotFoundException extends RuntimeException{

    public static class ExceptionResponse{
        private String message;
        private LocalDateTime dateTime;

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public LocalDateTime getLocalDateTime() {
            return dateTime;
        }

        public void setDateTime(LocalDateTime dateTime) {
            this.dateTime = dateTime;
        }

    }

}

