package com.example.demo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table
@Data
public class Medicament {
    @Id
    private Integer id;
    @Column
    private String denumire;
    @Column
    private Integer cantitate;

}
