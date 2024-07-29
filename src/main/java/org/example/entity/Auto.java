package org.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@Entity
@AllArgsConstructor
@Data
public class Auto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable=false)
    private String model;


    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "engine_id")
    private Engine engine;

    public Auto(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
    }
}
