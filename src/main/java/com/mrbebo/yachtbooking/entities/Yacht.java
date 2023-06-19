package com.mrbebo.yachtbooking.entities;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;

@Entity

@Table(name = "yachts")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
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
    private  Boolean isRent  ;

    // Many products can belong to one user
    @ManyToOne
    @JoinColumn(name = "owner_id",referencedColumnName = "id")
    private Owner owner;


}
