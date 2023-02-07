package dev.danvega.springBootJpa.response;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@AllArgsConstructor
@Data
public class Response implements Serializable {
    private int code;
    private String status;
    private Object Data;
}
