package com.mrbebo.yachtbooking.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "owners")
@NoArgsConstructor
@AllArgsConstructor
public class Owner  extends BaseEntity{

    private  String name;

    /**
     Will add JWT and Cryptography the password with Hash or User Class from Spring boot Security
     **/
    @Column(unique = true)
    @NotNull()
    private String email;


    @NotNull()
    @JsonIgnore
    private String password;

    // One owner can have many yachts
    @OneToMany(mappedBy = "owner", cascade = CascadeType.ALL)
    private List<Yacht> yachtList;

}
