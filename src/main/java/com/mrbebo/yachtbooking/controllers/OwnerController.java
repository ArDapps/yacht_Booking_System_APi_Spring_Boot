package com.mrbebo.yachtbooking.controllers;

import com.mrbebo.yachtbooking.services.Implementations.OwnerService;
import com.mrbebo.yachtbooking.entities.Owner;
import com.mrbebo.yachtbooking.utils.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/owner")
@RequiredArgsConstructor
public class OwnerController {

    private final OwnerService ownerService;

    @GetMapping("/list")
    final ResponseEntity<Response> fetchAllOwners(int limit){
        return  ResponseEntity.ok(Response.builder()
                        .data(Map.of("owners",ownerService.getAllOwners(limit)))
                        .time(LocalDateTime.now())
                        .statusCode(HttpStatus.OK.value())
                        .status(HttpStatus.OK)
                .build());
    }
    @GetMapping("/{ownerId}")
    final ResponseEntity<Response> fetchSpecificOwner( @PathVariable("ownerId") UUID ownerId){
        return  ResponseEntity.ok(Response.builder()
                .data(Map.of("owner Data",ownerService.getSpecificOwner(ownerId)))
                .time(LocalDateTime.now())
                .statusCode(HttpStatus.OK.value())
                .status(HttpStatus.OK)
                .build());
    }
    @PostMapping("/add")
    final ResponseEntity<Response> addOwner( @RequestBody @Validated  Owner owner){
        return  ResponseEntity.ok(Response.builder()
                .data(Map.of("owner",ownerService.create(owner)))
                .time(LocalDateTime.now())
                .statusCode(HttpStatus.OK.value())
                .status(HttpStatus.OK)
                .build());
    }

    @DeleteMapping("/delete/{ownerId}")
    final ResponseEntity<Response> deleteSpecificOwner( @PathVariable("ownerId") UUID ownerId){
        return  ResponseEntity.ok(Response.builder()
                .data(Map.of("owner Deleted Successfully ",ownerService.delete(ownerId)))
                .time(LocalDateTime.now())
                .statusCode(HttpStatus.OK.value())
                .status(HttpStatus.OK)
                .build());
    }

    @PatchMapping("/update/{ownerId}/")
    public ResponseEntity<?> updateUser(@PathVariable("ownerId") UUID ownerId,Owner updatedOwner) {
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
