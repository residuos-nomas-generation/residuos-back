package com.generation.backendproject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="region")
public class Region {
    @Id
    private Long idRegion;

}
