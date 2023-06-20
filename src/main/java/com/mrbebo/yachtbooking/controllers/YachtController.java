package com.mrbebo.yachtbooking.controllers;



import com.mrbebo.yachtbooking.entities.Yacht;

import com.mrbebo.yachtbooking.services.Implementations.YachtService;
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
@RequestMapping("/api/v1/yacht")
@RequiredArgsConstructor
public class YachtController {

    private final YachtService yachtService;

    @GetMapping("/list")
    final ResponseEntity<Response> fetchAllYachts(int limit){
        return  ResponseEntity.ok(Response.builder()
                        .data(Map.of("Yachts",yachtService.getAllYachts(limit)))
                        .time(LocalDateTime.now())
                        .statusCode(HttpStatus.OK.value())
                        .status(HttpStatus.OK)
                .build());
    }
    @GetMapping("/{yachtId}")
    final ResponseEntity<Response> fetchSpecificYachts( @PathVariable("yachtId") UUID yachtId){
        return  ResponseEntity.ok(Response.builder()
                .data(Map.of("Yacht Data",yachtService.getSpecificYacht(yachtId)))
                .time(LocalDateTime.now())
                .statusCode(HttpStatus.OK.value())
                .status(HttpStatus.OK)
                .build());
    }

    @GetMapping("/owner/{ownerId}")
    final ResponseEntity<Response> fetchYachtsByOwnerId( @PathVariable("ownerId") UUID ownerId){
        return  ResponseEntity.ok(Response.builder()
                .data(Map.of("Owner Yachts",yachtService.getAllYachtsForSpecificOwner(ownerId)))
                .time(LocalDateTime.now())
                .statusCode(HttpStatus.OK.value())
                .status(HttpStatus.OK)
                .build());
    }
    @PostMapping("/add")
    final ResponseEntity<Response> addYacht( @RequestBody @Validated Yacht yacht){
        return  ResponseEntity.ok(Response.builder()
                .data(Map.of("yacht",yachtService.create(yacht)))
                .time(LocalDateTime.now())
                .statusCode(HttpStatus.OK.value())
                .status(HttpStatus.OK)
                .build());
    }

    @DeleteMapping("/delete/{yachtId}")
    final ResponseEntity<Response> deleteSpecificYacht( @PathVariable("yachtId") UUID yachtId){
        return  ResponseEntity.ok(Response.builder()
                .data(Map.of("yacht Deleted Successfully ",yachtService.delete(yachtId)))
                .time(LocalDateTime.now())
                .statusCode(HttpStatus.OK.value())
                .status(HttpStatus.OK)
                .build());
    }

    @PatchMapping("/update/{yachtId}/")
    public ResponseEntity<Response> updateUser(@PathVariable("yachtId") UUID yachtId,Yacht updatedYacht) {
     Yacht yacht = yachtService.getSpecificYacht(yachtId);
        if(yacht != null)
        {

            return  ResponseEntity.ok(Response.builder()
                    .data(Map.of("yachtUpdated ",yachtService.update(updatedYacht)))
                    .time(LocalDateTime.now())
                    .statusCode(HttpStatus.OK.value())
                    .status(HttpStatus.OK)
                    .build());
        }

        return  ResponseEntity.ok(Response.builder()
                .data(Map.of(" newYacht",yachtService.create(updatedYacht)))
                .time(LocalDateTime.now())
                .statusCode(HttpStatus.OK.value())
                .status(HttpStatus.OK)
                .build());
    }
}
