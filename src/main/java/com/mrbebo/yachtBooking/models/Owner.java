package com.mrbebo.yachtBooking.models;

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
public class Owner {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private  String name;
    @Column(unique = true)
    @NotNull()
    private String email;

    /**
     Will add JWT and Cryptography the password with Hash
     **/
    @NotNull()
    private String password;

    // One owner can have many yachts
    @OneToMany(mappedBy = "owner", cascade = CascadeType.ALL)
    private List<Yacht> yachtList;

}
