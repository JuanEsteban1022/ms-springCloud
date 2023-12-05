package com.store.serviceproduct.Category.domain.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tbl_categories")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
}
