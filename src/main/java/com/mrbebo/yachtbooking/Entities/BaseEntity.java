package com.mrbebo.yachtbooking.Entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.ZonedDateTime;

@MappedSuperclass
@NoArgsConstructor
@Getter
@Setter
@ToString
public class BaseEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "ID",unique = true,nullable = false)
    protected Long id;


    @Column(name = "CREATED_AT",unique = true,nullable = false)
    @CreationTimestamp
    protected ZonedDateTime createdAt;

}
