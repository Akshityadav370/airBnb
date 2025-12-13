package com.airBnbApp.airBnbApp.entity;

import com.airBnbApp.airBnbApp.entity.enums.Gender;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@Entity
public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(nullable = false)
    private String name;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private Integer age;

    // @ManyToMany(mappedBy = "guests")
    // Do not define @JoinTable here again, because it'll create another new join table
    // and if there is join table with same name, it'll throw exception
    // this definition (like @JoinTable, @JoinColumn) should only be present on owner side
    // private Set<Booking> bookings;
}
