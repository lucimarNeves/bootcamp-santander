package com.project.bootcamp.model.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

public class StockDTO {

    private Long id;

    @NotNull(message = "Campo deve ser preenchido")
    private String name;

    @NotNull(message = "Campo deve ser preenchido")
    @DecimalMin(value ="0.00")
    @Digits(integer = 6, fraction = 2)
    private Double price;

    @NotNull(message = "Campo deve ser preenchido")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate date;

    @NotNull(message = "Campo deve ser preenchido")
    @Digits(integer = 3, fraction = 2)
    private Double variation;

    public StockDTO() {
    }

    public StockDTO(Long id, String name, Double price, LocalDate date, Double variation) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.date = date;
        this.variation = variation;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getVariation() {
        return variation;
    }

    public void setVariation(Double variation) {
        this.variation = variation;
    }
}
