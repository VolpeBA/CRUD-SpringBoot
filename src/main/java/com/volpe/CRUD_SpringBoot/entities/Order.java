package com.volpe.CRUD_SpringBoot.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;
import java.io.Serializable;
import java.time.Instant;

@Data // Gera os métodos getters, setters, equals, hashcode e toString
@Entity
@Table(name = "tb_order")
public class Order implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Define como auto incremento
    @EqualsAndHashCode.Include // Define que o equals e hashcode só será feito com este atributo
    private Long id;
    private Instant moment;

    @ManyToOne // Define a relação de muitos para um
    @JoinColumn(name = "client_id") // Define a chave estrangeira
    private User client;
}
