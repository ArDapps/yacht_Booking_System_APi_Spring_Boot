package com.mrbebo.yachtBooking.models;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "owners")
@NoArgsConstructor
@AllArgsConstructor
public class Owner {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private  String name;
    @Column(unique = true)
    @NotNull()
    private String email;

    /**
     Will add JWt and Cryptograpghy the password with Hash
     **/
    @NotNull()
    private String password;
}
