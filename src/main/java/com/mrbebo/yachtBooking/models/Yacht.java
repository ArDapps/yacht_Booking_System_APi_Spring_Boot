package com.mrbebo.yachtBooking.models;

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
public class Yacht {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @NotNull()
    private  String name;
    @NotNull()
    private  String description;
    @NotNull()
    private String location;
    @NotNull()
    private String pricePerDay;

    // Many products can belong to one user
    @ManyToOne
    @JoinColumn(name = "owners")
    private Owner owner;


}
