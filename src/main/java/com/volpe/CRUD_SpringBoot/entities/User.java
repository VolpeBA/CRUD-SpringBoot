package com.volpe.CRUD_SpringBoot.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

// Serializable transforma o objeto em bytes para trafegar em rede, salvar em arquivos, etc. (implements Serializable)
// Lombok é uma biblioteca que gera os métodos getters, setters, equals, hashcode, toString, etc. automaticamente
// JPA é uma especificação para persistência de dados em Java
// Hibernate é uma implementação da especificação JPA
// Annotations são metadados que fornecem informações sobre os dados do programa

@EqualsAndHashCode(onlyExplicitlyIncluded = true) // Define que o equals e hashcode só será feito com os atributos marcados com @EqualsAndHashCode.Include
@AllArgsConstructor // Necessário para o JPA
@NoArgsConstructor // Necessário para o JPA
@Entity // Define que a classe é uma entidade
@Table(name = "tb_user") // Define o nome da tabela
@Getter
@Setter
public class User implements Serializable {
    @Serial // Necessário para o Serializable
    private static final long serialVersionUID = 1L;

    @Id // Define como chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Define como auto incremento
    @EqualsAndHashCode.Include // Define que o equals e hashcode só será feito com este atributo
    private Long id;
    private String name;
    private String email;
    private String phone;
    private String password;

    @Getter
    @OneToMany(mappedBy = "client") // Define a relação de um para muitos
    private List<Order> orders = new ArrayList<>();

    public User(Long id, String name, String email, String phone, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
    }
}