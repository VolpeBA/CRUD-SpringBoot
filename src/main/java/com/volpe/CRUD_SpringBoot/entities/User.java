package com.volpe.CRUD_SpringBoot.entities;

import lombok.*;

import java.io.Serial;
import java.io.Serializable;

// Serializable transforma o objeto em bytes para trafegar em rede, salvar em arquivos, etc. (implements Serializable)

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @EqualsAndHashCode.Include
    private Long id;
    private String name;
    private String email;
    private String phone;
    private String password;
}
