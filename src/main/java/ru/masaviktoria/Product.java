package ru.masaviktoria;

public class Product {

    private Integer id;
    private String title;
    private Double cost;

    public Product(Integer id, String title, Double cost){
        this.id = id;
        this.title = title;
        this.cost = cost;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Double getCost() {
        return cost;
    }
}
