package com.lucas.security_20.role;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "ROLE")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
}
