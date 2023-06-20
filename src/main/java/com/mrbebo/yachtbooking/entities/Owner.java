package com.mrbebo.yachtbooking.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;

import java.util.List;

@Entity
@Table(name = "owner")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Owner  extends BaseEntity{

    private  String name;

    /**
     Will add JWT and Cryptography the password with Hash or User Class from Spring boot Security
     **/
    @Column(unique = true)
    @NotNull()
    private String email;

    @Column(unique = true)

    @NotNull()
    private String phoneNumber;

//     One owner can have many yachts
//    @OneToMany( mappedBy = "owner",cascade = CascadeType.ALL)
//    private List<Yacht> yachts;

}
