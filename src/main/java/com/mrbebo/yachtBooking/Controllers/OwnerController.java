package com.mrbebo.yachtBooking.Controllers;

import com.mrbebo.yachtBooking.Services.Implementations.OwnerServiceImplemenation;
import com.mrbebo.yachtBooking.models.Owner;
import com.mrbebo.yachtBooking.models.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/{ownerId}")
    final ResponseEntity<Response> fetchSpecificOwner( @PathVariable("ownerId") Long ownerId){
        return  ResponseEntity.ok(Response.builder()
                .data(Map.of("owner Data",ownerService.getSpecificOwner(ownerId)))
                .time(LocalDateTime.now())
                .statusCode(HttpStatus.OK.value())
                .status(HttpStatus.OK)
                .build());
    }
    @PostMapping("/register")
    final ResponseEntity<Response> registerOwner( @RequestBody @Validated  Owner owner){
        return  ResponseEntity.ok(Response.builder()
                .data(Map.of("owner",ownerService.create(owner)))
                .time(LocalDateTime.now())
                .statusCode(HttpStatus.OK.value())
                .status(HttpStatus.OK)
                .build());
    }

    @DeleteMapping("/delete/{ownerId}")
    final ResponseEntity<Response> deleteSpecificOwner( @PathVariable("ownerId") Long ownerId){
        return  ResponseEntity.ok(Response.builder()
                .data(Map.of("owner Deleted Successfully ",ownerService.delete(ownerId)))
                .time(LocalDateTime.now())
                .statusCode(HttpStatus.OK.value())
                .status(HttpStatus.OK)
                .build());
    }

    @PatchMapping("/update/{ownerId}/")
    public ResponseEntity<?> updateUser(@PathVariable("ownerId") Long ownerId,Owner updatedOwner) {
     Owner owner = ownerService.getSpecificOwner(ownerId);
        if(owner != null)
        {

            return  ResponseEntity.ok(Response.builder()
                    .data(Map.of("ownerUpdated ",ownerService.update(updatedOwner)))
                    .time(LocalDateTime.now())
                    .statusCode(HttpStatus.OK.value())
                    .status(HttpStatus.OK)
                    .build());
        }

        return  ResponseEntity.ok(Response.builder()
                .data(Map.of(" newOwner",ownerService.create(updatedOwner)))
                .time(LocalDateTime.now())
                .statusCode(HttpStatus.OK.value())
                .status(HttpStatus.OK)
                .build());
    }
}
