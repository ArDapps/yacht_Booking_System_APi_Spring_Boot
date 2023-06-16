package com.mrbebo.yachtBooking.Controllers;

import com.mrbebo.yachtBooking.Services.Implementations.OwnerServiceImplemenation;
import com.mrbebo.yachtBooking.models.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/owner")
@RequiredArgsConstructor
public class OwnerController {

    private final OwnerServiceImplemenation ownerService;

    @GetMapping("/list")
    final ResponseEntity<Response> fetchAllOwners(){
        return  ResponseEntity.ok(Response.builder()
                        .data(Map.of("owners",ownerService.getAllOwners(10)))
                        .time(LocalDateTime.now())
                        .statusCode(HttpStatus.OK.value())
                        .status(HttpStatus.OK)
                .build());
    }
}
