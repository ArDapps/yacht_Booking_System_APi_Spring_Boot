package com.mrbebo.yachtbooking.Entities;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "yacht")
@NoArgsConstructor
@AllArgsConstructor
public class Yacht extends BaseEntity {

    @NotNull()
    private  String name;
    @NotNull()
    private  String description;
    @NotNull()
    private String location;
    @NotNull()
    private int pricePerDay;
    @NotNull()
    private  Boolean isRent ;

    // Many products can belong to one user
    @ManyToOne
    @JoinColumn(name = "owners")
    private Owner owner;


}
