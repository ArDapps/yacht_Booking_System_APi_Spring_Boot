package com.mrbebo.yachtBooking.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.experimental.SuperBuilder;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

import java.util.Map;

@Data
@SuperBuilder
@JsonInclude
public class Response {
    protected Map<?, ?> data;
    protected int statusCode;
    protected LocalDateTime time;

    protected HttpStatus status;
}
