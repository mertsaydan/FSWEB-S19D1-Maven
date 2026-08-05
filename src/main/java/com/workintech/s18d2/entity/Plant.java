package com.workintech.s18d2.entity;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@MappedSuperclass
@Data
public class Plant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="name")
    @NotNull(message="name cannot be null")
    @Size(min=2, max=45, message = "name size must be between 2 to 45")
    private String name;

    @Column(name="price")
    @DecimalMin("10")
    private Double price;
}
