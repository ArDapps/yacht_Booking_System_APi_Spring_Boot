package com.mrbebo.yachtbooking.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.ZonedDateTime;
import java.util.UUID;

@MappedSuperclass
@NoArgsConstructor
@Getter
@Setter
@ToString
public class BaseEntity {

    @Id
    @GeneratedValue(generator = "uuid")
    @Column(name = "id",unique = true,nullable = false)
    protected UUID id;


    @Column(name = "created_by",unique = true,nullable = false)
    @CreationTimestamp
    protected ZonedDateTime createdAt;

}
