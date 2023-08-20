package mhmmdnaufall.elastic.search.model;


import lombok.Data;

@Data
public class CreateProductRequest {

    private String name;

    private String description;

    private int quantity;

    private double price;


}
